package _2_session._1_session_used;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
* 获取session对象
* */
@WebServlet("/sessionPart2")
public class _2_sessionPart2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取session对象
        HttpSession session = req.getSession();
        //2. 获取存储数据
        Object username = session.getAttribute("username");
        System.out.println(String.format("username=%s", username));

        //3. 根据key删除session中存储的键值对
        session.removeAttribute("username");

        //4. 销毁session
        session.invalidate();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
