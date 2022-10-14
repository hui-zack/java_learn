package _1_servlet._5_servletConfig__Conclusion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* servlet常用配置总结
* */
@WebServlet({"/servletConfig1", "/servletConfig2", "/servletConfig43"})                //* 三个路径都能访问到本资源
public class ServletConfigDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("资源访问: servletConfig1(2/3), path: _5_servletConfig__Conclusion\\ServletConfigDemo1.java");
    }
}
