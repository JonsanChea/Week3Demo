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
        
        String calculated = "---";
        request.setAttribute("calculated", calculated);
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        request.setAttribute("firstNum", firstNum);  
        request.setAttribute("secondNum", secondNum);  
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        
        String calculate = request.getParameter("calculate");
       
        String calculated = "";
            
            if(firstNum == null || firstNum.equals("") || secondNum == null || secondNum.equals("")){ 
                
                request.setAttribute("calculated", "invalid");
                
            }else if (calculate.equals("+")){
                int firstInt = Integer.parseInt(firstNum);
                int secondInt = Integer.parseInt(secondNum);
                 calculated = Integer.toString(firstInt + secondInt);
                 request.setAttribute("firstNum", firstNum);
            request.setAttribute("secondNum", secondNum);
            request.setAttribute("calculated", calculated);
            }else if (calculate.equals("-")){
                int firstInt = Integer.parseInt(firstNum);
                int secondInt = Integer.parseInt(secondNum);
                 calculated = Integer.toString(firstInt - secondInt);
                 request.setAttribute("firstNum", firstNum);
            request.setAttribute("secondNum", secondNum);
            request.setAttribute("calculated", calculated);
            } else if (calculate.equals("*")){
                int firstInt = Integer.parseInt(firstNum);
                int secondInt = Integer.parseInt(secondNum);
                 calculated = Integer.toString(firstInt + secondInt);
                 request.setAttribute("firstNum", firstNum);
            request.setAttribute("secondNum", secondNum);
            request.setAttribute("calculated", calculated);
            } else if (calculate.equals("%")){
                int firstInt = Integer.parseInt(firstNum);
                int secondInt = Integer.parseInt(secondNum);
                 calculated = Integer.toString(firstInt + secondInt);
            request.setAttribute("calculated", calculated);
            request.setAttribute("firstNum", firstNum);
            request.setAttribute("secondNum", secondNum);
            }
         
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
               .forward(request, response);
}
    }


    

