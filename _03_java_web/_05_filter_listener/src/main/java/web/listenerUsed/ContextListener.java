package web.listenerUsed;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;

@WebFilter
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //1. 加载资源
        System.out.println("contextListener had run");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //2. 释放资源
    }
}

