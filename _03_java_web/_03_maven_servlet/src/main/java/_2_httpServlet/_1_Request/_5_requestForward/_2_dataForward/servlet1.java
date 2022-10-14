package _2_httpServlet._1_Request._5_requestForward._2_dataForward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 数据转发1
*   请求转发和数据转发:
*       请求转发必须放在后面, 否则下一个servlet运行时可能无法及时接受到数据!!!!
* */
@WebServlet("/requestForward2")
public class servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----");
        System.out.println("requestForward2访问  请求转发至requestForward2_1 ...");

        req.setAttribute("data1", "userName=张辉");                       //* setAttribute(String name, Object data)方法; 数据转发至request域
        /* 请求转发必须放在后面, 否则下一个servlet运行时可能无法及时接受到数据!!!! */
        req.getRequestDispatcher("/requestForward2_1").forward(req, resp);   // 请求转发
    }
}
