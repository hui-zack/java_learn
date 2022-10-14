package web._1_ajax._2_ajaxCase__login;

import pojo.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ajaxLoginServlet")
public class ajaxLoginServlet extends HttpServlet {
    UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1. 接收用户名
        String username = request.getParameter("username");

        //2. 调用service查询User对象
        User user = service.selectByUsername(username);
        //3. 响应标记
        int flag;
        if (user != null){
            flag = 1;
        } else {
            flag = 0;
        }

        response.getWriter().write("" + flag);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}