package web._2_axios._1_axiosBasic;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/axiosServlet")
public class axiosServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        //1. 接收请求参数:
        String username = req.getParameter("username");
        String method = req.getMethod();
        System.out.println(String.format("%s: username=%s", method, username));

        //2. 设置响应数据
        resp.getWriter().write("server: axios basic response");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        this.doPost(req, resp);
    }
}
