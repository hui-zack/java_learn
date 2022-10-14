package _3_servletContext._2_servletContext__method._2_dateForward;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dataForward2")
public class dataForward2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();       // 获取servletContext对象
        String msg = (String) context.getAttribute("msg");             // 获取servletContext域内转发的数据

        if (msg != null){
            System.out.println(String.format("获取msg: %s", msg));
        } else {
            System.out.println((String) null);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
