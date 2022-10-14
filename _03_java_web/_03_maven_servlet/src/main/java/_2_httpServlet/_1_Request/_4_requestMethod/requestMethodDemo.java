package _2_httpServlet._1_Request._4_requestMethod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestMethod")
public class requestMethodDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println("--------------------\n--> 1[获取所有的参数名称]");

        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String parameterName = parameterNames.nextElement();
            String parameter = req.getParameter(parameterName);
            System.out.println(String.format("    %s = %s", parameterName, parameter));
        }


        System.out.println("--> 2[获取请求参数值]");
        String parameter1 = req.getParameter("username-post");
        System.out.println("    获取参数请求值(username-post): " + parameter1);



        System.out.println("--> 3[获取参数值数组]");
        String[] hobbies = req.getParameterValues("hobby");
        for (int i = 0; i < hobbies.length; i++) {
            String hobby = hobbies[i];
            System.out.println("    根据名称获取参数值的数组(hobby): " + hobby);
        }

        System.out.println("--> 4[获取请求名称及参数的map集合]");
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        for(String key : keySet){
            String[] values = parameterMap.get(key);
            for (int i = 0; i < values.length; i++){
                String value = values[i];
                if (i == 0) {
                    System.out.print(String.format("    %s=%s", key, value));
                } else {
                    System.out.print(String.format("&%s=%s", key, value));
                }
            }
            System.out.println();
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
