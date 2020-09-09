package com.saeid.filter;


import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.printf("This is filter1");
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
