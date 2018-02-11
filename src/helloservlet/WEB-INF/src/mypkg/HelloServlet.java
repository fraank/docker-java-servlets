package mypkg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Hello World</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hello World</h1>");
    out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
    out.println("<p>Protocol: " + request.getProtocol() + "</p>");
    out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
    out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
    // Generate a random number upon each request
    out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");

    out.println("</body></html>");
   }
}