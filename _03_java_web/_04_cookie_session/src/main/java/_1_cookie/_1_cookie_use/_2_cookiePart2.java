package _1_cookie._1_cookie_use;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Enumeration;
/*
* 第二次请求(接受Cookie的请求):
*   浏览器根据第一次请求的响应头(Set-Cookie:msg=hello), 在浏览器本地设置Cookie后, 之后的每一次请求都会携带Cookie
*       使用: Cookie[] cs = req.getCookies() 来获取Cookie
*
* */
@WebServlet("/cookiePart2")
public class _2_cookiePart2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //2.2 遍历检查请求头
        this.for_reqHeaders(req);

        //3 获取并遍历cookie
        Cookie[] cs = req.getCookies();
        if (cs != null) {
            System.out.println("get-Cookie:");
            for (Cookie c : cs) {
                String name = c.getName();                                      //* 获取cookie键
                String value = c.getValue();                                    //* 获取cookie值
                value = URLDecoder.decode(value, "UTF-8");                 //* url解码, 解析cookie中的中文数据
                System.out.println(String.format("    %s=%s", name, value));
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    /**
     * 遍历打印请求头
     * @param req request对象
     */
    private void for_reqHeaders(HttpServletRequest req){
        Enumeration<String> headerNames = req.getHeaderNames();
        System.out.println("---print start---");
        while (headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String value = req.getHeader(headerName);
            System.out.println(String.format("%s : %s",headerName, value));
        }
        System.out.println("---print end---");
    }
}
