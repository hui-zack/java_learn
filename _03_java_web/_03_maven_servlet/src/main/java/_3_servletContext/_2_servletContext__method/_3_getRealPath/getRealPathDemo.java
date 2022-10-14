package _3_servletContext._2_servletContext__method._3_getRealPath;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 使用servletContext对象的getRealFile(String path)方法获取文件的编译运行目录
*   配置文件在tomcat项目中通常存放在三个位置下:
*       直接存放在src下
*       直接存放在在web目录下
*       直接存放在WEB-INF目录下
*   这三个位置可以直接使用文件名作为参数传入上述方法中, 获取服务器文件运行路径
* */
@WebServlet("/getRealPath")
public class getRealPathDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        String realPath1 = context.getRealPath("/WEB-INF/classes/servletContext知识点.txt");     // src下的资源获取运行路径
        String realPath2 = context.getRealPath("/properties.txt");                      // web目录下的资源获取运行路径
        String realPath3 = context.getRealPath("/WEB-INF/123.txt");                     // WEB-INF目录下的资源获取运行路径
                /*
                * 获取的资源路径如果正确, 应该是蓝色的
                * */
        System.out.println(realPath1);
        System.out.println(realPath2);
        System.out.println(realPath3);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
