// ============================================================
//  File: HelloWorldServlet.java
//  A simple Java Servlet that prints "Hello, World!"
//  when accessed through a browser.
// ============================================================

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Maps this servlet to the URL pattern /hello
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    // Called automatically when a GET request is made from the browser
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Set the content type of the response to HTML
        response.setContentType("text/html");

        // 2. Get the PrintWriter to send character text to the client
        PrintWriter out = response.getWriter();

        // 3. Write the HTML response
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>Hello World Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <h1>Hello, World!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
