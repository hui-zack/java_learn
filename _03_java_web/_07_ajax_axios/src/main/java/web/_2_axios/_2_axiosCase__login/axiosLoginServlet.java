package web._2_axios._2_axiosCase__login;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.User;
import service.UserService;
import util.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/axiosLoginServlet")
public class axiosLoginServlet extends HttpServlet {
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
            //System.out.println(user.toString());
            flag = 1;
        } else {
            //System.out.println("don't find username");
            flag = 0;
        }

        response.getWriter().write("" + flag);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}