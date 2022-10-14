package _2_httpServlet._2_Response._2_responseBody._1_characterText;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
* 通过response-body, 输出字符text数据到浏览器
*
* */
@WebServlet("/characterText")
public class characterTextDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Content-Type: text/html;charset=UTF-8
        //1. 设置响应头返回数据编码格式
        resp.setContentType("text/html;charset=utf8");              //简单方法设置响应头返回编码信息
                /*
                    resp.setHeader("Content-Type", "text/html;charset=utf8");   // 复杂方法设置响应头返回编码信息
                */
        //2. 获取字节输出流
        PrintWriter pw = resp.getWriter();
        //3. 输出数据到网页
        pw.write("<h1>你好 response</h1>");
        pw.println("<h1>你好 response</h1>");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
