package _2_httpServlet._2_Response._2_responseBody._2_bytesText;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 使用字节输出流, 输出字节text数据到浏览器
* */
@WebServlet("/bytesText")
public class bytesTextDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 设置响应头返回数据解码方式
        resp.setContentType("text/html;charset=utf8");
        //2. 获取字节输出流
        ServletOutputStream os = resp.getOutputStream();
        //3. 输出text数据到浏览器
        os.write("<h3>你好 response</h3>".getBytes("utf-8"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
