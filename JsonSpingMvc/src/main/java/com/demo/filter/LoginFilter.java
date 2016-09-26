package com.demo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wj on 14-4-24.
 */
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        if (uri.equals("/student/login.do")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            Object student = request.getSession().getAttribute("student");
            if (student == null) {
                response.sendRedirect("/login.jsp");
            } else {
                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
    }

    public void destroy() {
        //这里做一些清理操作
    }
}
