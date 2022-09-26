/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jonat
 */
public class ageCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String ageMessage = "";
       try{
       String userAge = request.getParameter("userAge");
       int nextAge = Integer.parseInt(userAge) + 1;
       
       ageMessage = "Your age next birthday will be " + nextAge;
       
       }catch (NumberFormatException e){
           ageMessage = "Try inserting numbers";
       }
       request.setAttribute("ageMessage", ageMessage);
       getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
               .forward(request, response);
           
       }
    }


