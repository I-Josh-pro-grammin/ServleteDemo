package org.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SumServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String s1 = req.getParameter("num1");
        String s2 = req.getParameter("num2");

        PrintWriter out = res.getWriter();

        if(s1.isEmpty() || s2.isEmpty()) {
            out.print(("The numbers requested are needed;"));
        }

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num2 + num1;

        out.print("Sum is:" + sum);


    }
}
