package web._1_ajax._1_ajaxBasic;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/ajaxServlet")
public class ajaxServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
         resp.getWriter().write("server: ajax basic");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, IOException {
        this.doPost(req, resp);
    }
}
