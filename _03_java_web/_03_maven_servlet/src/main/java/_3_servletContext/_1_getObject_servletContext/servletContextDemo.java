package _3_servletContext._1_getObject_servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/*
* 获取Context对象的两种方式
* */
@WebServlet("/getServletContext")
public class servletContextDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //方式1 通过request对象获取servletContext对象
        ServletContext context1 = req.getServletContext();

        //方式2 通过httpServlet获取servletContext对象
        ServletContext context2 = this.getServletContext();

        Date date = new Date();
        Date date1 = new Date();
        System.out.println(System.identityHashCode(date));
        System.out.println(System.identityHashCode(date1));


        System.out.println(context1);
        System.out.println(context2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
