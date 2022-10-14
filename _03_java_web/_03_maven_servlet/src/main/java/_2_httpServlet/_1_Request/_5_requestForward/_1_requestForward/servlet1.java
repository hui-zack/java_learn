package _2_httpServlet._1_Request._5_requestForward._1_requestForward;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 请求转发1
* */
@WebServlet("/requestForward1")
public class servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----------");
        System.out.println("requestForward1-访问, 转发至: \"requestForward1_1\"");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/requestForward1_1");   //* 请求转发
        requestDispatcher.forward(req, resp);

    }
}
