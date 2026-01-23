package org.servlet;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FooterServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("""
            <hr>
            <h5>© 2026 RCA</h5>
            </body>
            </html>
        """);
    }
}
