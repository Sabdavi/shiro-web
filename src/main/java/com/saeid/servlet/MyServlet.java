package com.saeid.servlet;

import com.saeid.service.ServiceGateway;
import org.apache.shiro.authc.AuthenticationException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        // Do required initialization
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServiceGateway.handleRequest();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" +""+ "</h1>");
    }

    public void destroy() {
        // do nothing.
    }
}
