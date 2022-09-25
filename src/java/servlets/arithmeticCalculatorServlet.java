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
public class arithmeticCalculatorServlet extends HttpServlet {

    
    
    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int firstNum = Integer.parseInt(request.getParameter("firstNum"));
        int secondNum = Integer.parseInt(request.getParameter("secondNum"));
        String calculated;
       
        String calculate = request.getParameter("calculate");
        try{
        if(calculate.equals("+")){
            calculated = Integer.toString(firstNum + secondNum);
            request.setAttribute("calculated", calculated);
        }else if (calculate.equals("-")){
                calculated = Integer.toString(firstNum - secondNum);
            request.setAttribute("calculated", calculated);
            } else if (calculate.equals("*")){
                calculated = Integer.toString(firstNum * secondNum);
                request.setAttribute("calculated", calculated);
            } else if (calculate.equals("%")){
                calculated = Integer.toString(firstNum % secondNum);
                request.setAttribute("calculated", calculated);
            }
        }
            catch (NumberFormatException e){
           calculated = "Try inserting numbers";
       }
              
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
               .forward(request, response);
    

}
}
