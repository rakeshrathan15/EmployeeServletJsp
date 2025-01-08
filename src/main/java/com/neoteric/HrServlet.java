package com.neoteric;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;


public class HrServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println("<h2>Welcome to HR Page</h2>");
    }
}
