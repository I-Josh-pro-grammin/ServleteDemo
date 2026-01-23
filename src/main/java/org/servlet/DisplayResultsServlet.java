package org.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DisplayResultsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        req.getRequestDispatcher("/header").include(req, res);

        int num1 = (int) req.getAttribute("fNum");
        int num2 = (int) req.getAttribute("sNum");
        String operation = (String) req.getAttribute("operation");

        if ("sum".equals(operation)) {
            out.println("Sum: " + (num1 + num2));
        } else if ("product".equals(operation)) {
            out.println("Product: " + (num1 * num2));
        } else if ("division".equals(operation)) {
            out.println("Division: " + (num1 / num2));
        }

        req.getRequestDispatcher("/footer").include(req, res);
    }
}
