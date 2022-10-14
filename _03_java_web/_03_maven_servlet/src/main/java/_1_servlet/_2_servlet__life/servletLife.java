package _1_servlet._2_servlet__life;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
* servlet生命周期
* */
@WebServlet(urlPatterns = "/servletLife", loadOnStartup = -1)    //* -1 被访问时才创建该对象
public class servletLife implements Servlet {

    /**
     * 初始化方法
     *  在servlet被创建时执行, 只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }


    /**
     * 获取ServletConfig对象(需要自己实现)
     *  ServletConfig对象, Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    /**
     * servlet提供服务的方法:
     *  1.调用时机: 每一次被访问时都会执行
     *  2.调用次数: 每次被访问都调用
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletService");
    }


    /**
     * 获取Servlet的一些信息, 如版本, 作者等, 需要自己实现
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法:
     *  在内存释放或服务器正常关闭时执行, 执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
