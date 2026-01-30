package org.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.servlet.Models.Calculator;

import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operation = req.getParameter("operation");

        Calculator calc = new Calculator(num1, num2, operation);
        int sum = calc.calculate();
        req.setAttribute("res", sum);
        RequestDispatcher rd = req.getRequestDispatcher("Result");
        rd.forward(req, res);
    }
}
