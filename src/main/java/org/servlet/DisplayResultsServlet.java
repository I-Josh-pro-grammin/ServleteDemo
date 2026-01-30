package org.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/display")
public class DisplayResultsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        req.getRequestDispatcher("/header").include(req, res);

        Cookie[] cookies = req.getCookies();
        if (cookies == null || cookies.length == 0) {
            out.println("No cookies");
            return;
        }

        int num1 = 0;
        int num2 = 0;
        String operation = null;

        for (Cookie ck : cookies) {
            switch (ck.getName()) {
                case "fNum" -> num1 = Integer.parseInt(ck.getValue());
                case "sNum" -> num2 = Integer.parseInt(ck.getValue());
                case "operation" -> operation = ck.getValue();
            }
        }


        if ("sum".equals(operation)) {
            out.println("Sum: " + (num1 + num2));
        } else if ("product".equals(operation)) {
            out.println("Product: " + (num1 * num2));
        } else if ("division".equals(operation)) {
            out.println("Division: " + (num1 / num2));
        }

        req.getRequestDispatcher("footer").include(req, res);
    }
}
