package org.servlet;

import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SumServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String s1 = req.getParameter("num1");
        String s2 = req.getParameter("num2");

//        ServletConfig conf = getServletConfig();
//        ServletContext context = getServletContext();
//        String servletDesc = conf.getInitParameter("servletDescription");
//        String appName = conf.getInitParameter("appName");

        PrintWriter out = res.getWriter();

        if(s1.isEmpty() || s2.isEmpty()) {
            out.print(("The numbers requested are needed;"));
        }

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operation = req.getParameter("operation");

        if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
            req.setAttribute("error", "Both numbers are required");
            req.getRequestDispatcher("/display").forward(req, res);
            return;
        }

//        int sum = num2 + num1;
        req.setAttribute("fNum", num1);
        req.setAttribute("sNum", num2);
        req.setAttribute("operation", operation);
        RequestDispatcher rd = req.getRequestDispatcher("display");
        rd.forward(req, res);

//        out.println("App name: " + appName);
//        out.println("Description: "+servletDesc);
//        out.print("Sum is:" + sum);
    }
}
