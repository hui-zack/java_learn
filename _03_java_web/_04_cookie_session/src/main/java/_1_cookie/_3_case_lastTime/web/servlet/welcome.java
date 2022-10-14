package _1_cookie._3_case_lastTime.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
[案例需求]:
    1. 访问一个servlet如果是第一次访问, 提示"欢迎访问首页"
    2. 如果不是第一次访问, 则提示: "欢迎回来, 您上次访问时间为: 显示时间字符串"
*/
@WebServlet("/welcome")
public class welcome extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cs = req.getCookies();
        //1. 获取上次访问时间的cookie
        String lastTiem = null;
        if (cs != null && cs.length > 0) {
            for (Cookie c : cs) {                                                       // 遍历cookie数组
                String name = c.getName();
                String value = c.getValue();
                // System.out.println("    %s=%s".formatted(name, value));
                if ("lastTime".equals(name)) {
                    lastTiem = value;
                    break;
                }
            }
        }

        resp.setContentType("text/html;charset=utf8");
        if (lastTiem != null){
            resp.getWriter().write("欢迎回来, 您上次访问时间为: " + lastTiem);
        } else {
            resp.getWriter().write("欢迎访问首页");
        }

        //2. 添加新cookie, cookie存储当前时间(cookie名字相同的话, 会覆盖掉浏览器原来的值 )
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
        String nowTime = sdf.format(d);
        Cookie dateCookie = new Cookie("lastTime", nowTime);
        dateCookie.setMaxAge(84600 * 10);                                                   // 设置cookie存活时间
        resp.addCookie(dateCookie);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
