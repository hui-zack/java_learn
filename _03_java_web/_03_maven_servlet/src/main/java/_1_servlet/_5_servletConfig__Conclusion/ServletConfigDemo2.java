package _1_servlet._5_servletConfig__Conclusion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/5/demo2", "/test/*", "*.set"})                           //* 资源路径写成多层路径
public class ServletConfigDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("http-GET run; path: _5_servletConfig__Conclusion\\ServletConfigDemo2.java");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("http-POST run; path: _5_servletConfig__Conclusion\\ServletConfigDemo2.java");
    }
}
