package _2_httpServlet._1_Request._5_requestForward._2_dataForward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 数据转发1_2
* */
@WebServlet("/requestForward2_1")
public class servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("requestForward2_1 已接受请求 ...");
        Object data1 = req.getAttribute("data1");                   //* getAttribute(String dataName)方法; 接收域内数据

        System.out.println("requestForward2_1 已接受数据 ... " + data1);

    }
}
