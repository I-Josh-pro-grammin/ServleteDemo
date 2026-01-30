package org.servlet;

import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/add")
public class SumServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();

        String n1 = req.getParameter("num1");
        String n2 = req.getParameter("num2");
        String oper = req.getParameter("operation");

        if(n2.isEmpty() || n1.isEmpty()|| oper.isEmpty()) {
           out.print("provide everything is required");
        }


        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operation = req.getParameter("operation");

          Cookie c = new Cookie("fNum", num1 + "");
          Cookie c2 = new Cookie("sNum", num2 + "");
          Cookie op = new Cookie("operation", operation);
          c.setPath("/");
          c2.setPath("/");
          op.setPath("/");

          res.addCookie(c);
          res.addCookie(c2);
          res.addCookie(op);

        res.sendRedirect("display");

    }
}
