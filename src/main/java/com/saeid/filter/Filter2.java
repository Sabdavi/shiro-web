package com.saeid.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter2 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.printf("This is filter2");
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
