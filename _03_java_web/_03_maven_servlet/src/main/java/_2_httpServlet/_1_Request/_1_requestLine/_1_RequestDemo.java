package _2_httpServlet._1_Request._1_requestLine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
// http://localhost:8080/httpProject/RequestLine

/**
 * 请求行
 */
@WebServlet("/requestLine")
public class _1_RequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----");
        System.out.println(req.toString());

        String method = req.getMethod();                    //* 1.获取请求方式 String getMethod()
        System.out.println("获取-请求方式: " + method);

        String contextPath = req.getContextPath();          //* 2.获取虚拟目录 String getContextPath()
        System.out.println("获取-虚拟路径:" + contextPath);

        String servletPath = req.getServletPath();          //* 3.获取Servlet路径 String getServletPath()
        System.out.println("获取-servlet路径: " + servletPath);

        String queryString = req.getQueryString();          //* 4.获取get请求参数 String getQueryString()
        queryString = URLDecoder.decode(queryString, "utf8");       //* url解码
        System.out.println("获取-获取get请求参数: " + queryString);

        String requestURI = req.getRequestURI();            //* 5.获取URI String getRequestURI()
        System.out.println("获取-uri: " + requestURI);

        StringBuffer requestURL = req.getRequestURL();      //* 6.获取url: StringBuffer getRequestUrl()
        System.out.println("获取-url: " + requestURL);

        String protocol = req.getProtocol();                //* 7.获取协议及版本 String getProtocol()
        System.out.println("获取-协议及版本: " + protocol);

        String remoteAddr = req.getRemoteAddr();            //* 8.获取客户机的IP地址 String getRemoteIP()
        System.out.println("获取-IP: " + remoteAddr);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post run");
    }
}
