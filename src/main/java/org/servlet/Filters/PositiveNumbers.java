package org.servlet.Filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class PositiveNumbers implements Filter {

    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain chain
    ) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String num2Param = req.getParameter("num2");

        if (num2Param != null) {
            int num2 = Integer.parseInt(num2Param);

            if (num2 < 0) {
                System.out.println("The second number is negative, Please use positive numbers");
                res.sendRedirect("home");
                return;
            }
        }

        chain.doFilter(servletRequest, servletResponse);
    }
}
