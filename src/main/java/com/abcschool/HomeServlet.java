
package com.abcschool;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head><title>ABC School</title></head>");
            out.println("<body style='font-family:Arial;text-align:center'>");
            out.println("<h1>Welcome to ABC School</h1>");
            out.println("<h2>Java CI/CD Application</h2>");
            out.println("<p>Build and deployment successful!</p>");
            out.println("<p>Environment: " +
                System.getProperty("app.environment", "Default") +
                "</p>");
            out.println("</body></html>");
        }
    }
}
