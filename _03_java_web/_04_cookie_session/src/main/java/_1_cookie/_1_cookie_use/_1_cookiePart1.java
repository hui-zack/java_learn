package _1_cookie._1_cookie_use;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/*
 * cookie使用快速流程和原理
 *    第一次请求(设置Cookie请求):
 *      servlet返回响应头如下响应头要求浏览器本地设置Cookie:
 *          Set-Cookie:msg=hello             // 浏览器接受后设置Cookie
 * */
@WebServlet("/cookiePart1")
public class _1_cookiePart1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1. 实例化Cookie对象, 设置多个Cookie(实际上是在设置响应头 Set-Cookie : msg=hello)
        Cookie c = new Cookie("msg", "hello");
        Cookie c1 = new Cookie("user", URLEncoder.encode("张辉", "UTF-8"));       //* cookie编码(tomcat7及以下)
        c1.setMaxAge(1000);                                 // 持久化存储到用户硬盘, 存活时间1000s
                /*
                * Cookie对象:
                    1) 持久化存储Cookie到用户硬盘
                        cookie.setMaxAge(int seconds):
                            参数-seconds(默认-1):
                                1) 正数: 将Cookie数据写入用户硬盘文件, 持久化存储, seconds后自动删除
                                2) 负数: 默认值, 存储到内存, 浏览器关闭, 销毁Cookie
                                3) 0: 要求浏览器删除Cookie
                * */
        //2. 返回给浏览器
        resp.addCookie(c);
        resp.addCookie(c1);

        //3. 获取cookie --> (_2_cookiePart2)

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

}
