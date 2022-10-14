package _2_httpServlet._1_Request._5_requestForward._1_requestForward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
/*
* 请求转发1_1
* */
@WebServlet("/requestForward1_1")
public class servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String parameterName = parameterNames.nextElement();
            String parameter = req.getParameter(parameterName);
            System.out.println(String.format("requestForward1_1-访问, 输出: %s=%s", parameterName, parameter));
        }
    }
}
