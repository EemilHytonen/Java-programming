package sum;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@SuppressWarnings("serial")
@WebServlet("/addNumbers")



public class AdditionServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Retrieve the values of the two numbers from the request
        //String number1Str = request.getParameter("number1");
        //String number2Str = request.getParameter("number2");
        

        // Convert the input strings to integers
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));

        // Perform the addition
        int sum = number1 + number2;

        // Display the result
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Result of numbers</h1>");
        response.getWriter().println("<p>" + number1 + " + " + number2 + " = " + sum + "</p>");
        response.getWriter().println("</body></html>");
    }
}