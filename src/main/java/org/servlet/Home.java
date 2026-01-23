package org.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Home extends HttpServlet {
    protected  void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.print("""
                <form action="add" method="post">
                                First number: <input type="text" name="num1"><br>
                                Second number: <input type="text" name="num2"><br>
                
                                <button type="submit" name="operation" value="sum">Sum</button>
                                <button type="submit" name="operation" value="product">Product</button>
                                <button type="submit" name="operation" value="division">Division</button>
                                </form>
                """);

    }
}
