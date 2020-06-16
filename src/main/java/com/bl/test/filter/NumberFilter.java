package com.bl.test.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class NumberFilter implements Filter {
    private String numberPattern="^-?[0-9]{1,10}";
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");
        if(request.getParameter("first").matches(numberPattern) && request.getParameter("second").matches(numberPattern)){
            filterChain.doFilter(request,servletResponse);
        }else {
            request.setAttribute("error","Please enter both numbers");
            rd.include(request,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
