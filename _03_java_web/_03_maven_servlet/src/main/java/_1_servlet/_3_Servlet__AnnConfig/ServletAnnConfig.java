package _1_servlet._3_Servlet__AnnConfig;
/*
* 注解配置: 使用注解完成url和全类名的对应(之前用web.xml来完成)
*
* */
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/servletAnnConfig")                  //* 注解配置; 也可以写成: @WebServlet("/servletAnnConfig")
public class ServletAnnConfig implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet3.0来了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
