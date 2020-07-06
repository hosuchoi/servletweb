package lake.pool;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter doFilter");
        filterChain.doFilter(servletRequest,servletResponse); // 필터 체인을 사용해야 다음 필터 or servlet으로 호출이 가능
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
