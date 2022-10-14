package _3_servletContext._2_servletContext__method._2_dateForward;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* servletContext域:
*   服务器内数据共享
*
* */
@WebServlet("/dataForward1")
public class dataForward1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();                   // 获取servletContext对象
        String  str = "用户数据";
        context.setAttribute("msg", str);       // 在servletContext域内共享数据(范围: 服务器所有servlet)

        System.out.println("servletContext: 数据已转发");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
