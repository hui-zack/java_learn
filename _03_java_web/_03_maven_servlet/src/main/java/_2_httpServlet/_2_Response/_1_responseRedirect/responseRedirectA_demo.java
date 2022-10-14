package _2_httpServlet._2_Response._1_responseRedirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 案例-重定向
*   重定向的特点:
*       1. 重定向地址栏发生变换
*       2. 重定向可以访问其他站点(服务)的资源
*       3. 重定向是两次请求
*   重定向至百度: resp.sendRedirect("http://baidu.com")
* */
@WebServlet("/responseRedirectA")
public class responseRedirectA_demo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("...A资源被访问...");
/*
        //1. 设置状态码: 重定向-302                             //* 复杂方式实现重定向(原理)
        resp.setStatus(302);
        //2. 设置响应头: B资源路径
        resp.setHeader("location", "/responseRedirectB");
*/
    //1. 通过重定向方法实现资源重定向
        resp.sendRedirect("http://baidu.com");
        //resp.sendRedirect("/responseRedirectB");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
