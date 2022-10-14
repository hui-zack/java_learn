package _2_httpServlet._1_Request._3_requestBody;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/*
*
* */
@WebServlet(urlPatterns = "/requestBody")
public class requestBodyDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get has run");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------");

        BufferedReader reader = req.getReader();                                    //* getReader()方法, 获取字符输入流

        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
}



