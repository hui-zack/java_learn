package _2_httpServlet._1_Request._2_requestHeader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
* 请求头
* */
@WebServlet("/requestHeader")
public class requestHeaderDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------\n--> [part1 Enumeration<String>迭代器]");
        // --> [part1 Enumeration<String>迭代器]
        Enumeration<String> headerNames = req.getHeaderNames();             //* Enumeration<String> getHeaderNames()方法
        while (headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String header = req.getHeader(headerName);                      //* String getHeader(String name)方法
            System.out.println(String.format("%s : %s", headerName, header));
        }

        // --> [part2 判断浏览器]
        System.out.println("\n--> [part2 判断浏览器]");
        String agent = req.getHeader("user-agent");                      //* String getHeader(String name)方法
        if (agent.contains("Chrome")){
            System.out.println("请求来自 -> Chrome浏览器");
        } else if (agent.contains("Firefox")){
            System.out.println("请求来自 -> 火狐浏览器");
        } else if (agent.contains("Trident")){
            System.out.println("请求来自 -> IE浏览器");
        }
        System.out.println("user-agent : " + agent);

        // --> [part3 防盗链]
        System.out.println("\n--> [part3 防盗链]");
        String referer = req.getHeader("referer");
        if (referer == null){
            System.out.println("链接来自复制或手输");
        } else if (referer.contains("test.html")){
            System.out.println("链接来自我方登录页面");
        } else {
            System.out.println(referer);
        }
    }


}
