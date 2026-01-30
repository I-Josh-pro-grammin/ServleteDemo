package org.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/header")
public class HeaderServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("""
            <!DOCTYPE html>
            <html>
            <head>
                <title>Calculator</title>
            </head>
            <body>
            <h1>Welcome to RCA</h1>
            <hr>
        """);
    }
}

