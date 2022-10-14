package web.filterUsed;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
            (1) 拦截具体的资源:   "/index.jsp"   只有访问index.jsp时才会被拦截
            (2) 目录拦截:        "/user/*"      访问/user下的所有资源, 都会被拦截
            (3) 后缀名拦截:      "*.jsp"        访问后缀名为jsp的资源, 都会被拦截
            (4) 拦截所有         "/*"           访问所有资源, 都会被拦截
*/
@WebFilter("/*")                                //* 配置要拦截的路径
public class filterPart1 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1. 放行前逻辑(对request数据进行处理)
        req.setCharacterEncoding("utf8");       //* 统一设置编码
        System.out.println("code_location: 1");
        //2. 放行
        chain.doFilter(req, resp);
        //3. 放行后处理
        System.out.println("code_location: 5");
    }

    public void destroy() {
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
