package web;

import com.alibaba.fastjson.JSON;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/jsonChangeServlet")
public class jsonChangeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //0. 读取请求中的json字符串
        BufferedReader reader = req.getReader();                                    //* getReader()方法, 获取字符输入流

        StringBuilder jsonBuilderStr = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null){
            jsonBuilderStr.append(line);
        }
        String jsonStr = jsonBuilderStr.toString();
        System.out.println("request读取json数据: \t" + jsonStr);

        //1.  jsonStr转javaBean对象
        User user = JSON.parseObject(jsonStr, User.class);

        System.out.println("json转为javaBean: \t\t" + user.toString());

        //2. javaBean对象转为jsonStr
        String respJson = JSON.toJSONString(user);
        resp.getWriter().write(respJson);

        System.out.println("javaBean转为json:\t\t" + respJson);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
