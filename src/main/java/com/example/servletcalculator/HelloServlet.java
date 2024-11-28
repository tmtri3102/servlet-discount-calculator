package com.example.servletcalculator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "calculate", value = "/display-discount")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String desc = request.getParameter("desc");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("percent"));
        double amount = price * discount * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

            writer.println("Description: " + desc);
            writer.println("Amount: " + amount + "= " + price + "(price) " + "* " + discount + "(discount percent) " + "* 0.01");

        writer.println("</html>");
    }
}