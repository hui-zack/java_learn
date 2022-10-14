package web.filterUsed;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/hello.jsp")
public class filterPart2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("code_location: 2");
        chain.doFilter(req, resp);
        System.out.println("code_location: 4");
    }

    @Override
    public void destroy() {

    }
}
