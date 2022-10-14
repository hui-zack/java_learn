package _3_servletContext._2_servletContext__method._1_getMimeType;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getMimeType")
public class getMimeTypeDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取servletContext对象
        ServletContext context = req.getServletContext();
        //2. 根据文件名称获取文件的MiME类型
        String jsonName = "aa.json";
        String imgName = "bb.jpg";

        String jsonMime = context.getMimeType(imgName);
        String imgMime = context.getMimeType(jsonName);
        System.out.println(String.format("%s %s",jsonMime, imgMime));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
