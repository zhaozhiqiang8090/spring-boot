package com.zzq.core.filter;

import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("testFilter前置");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("testFilter后置");
    }

    @Override
    public void destroy() {

    }
}
