<%-- 
    Document   : arithmeticCalculator
    Created on : 24-Sep-2022, 7:26:45 PM
    Author     : Jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method = "post" action="arithmetic" >
        First: <input type ="text" name="firstNum" value="${firstNum}"><br>
        Second: <input type ="text" name="secondNum" value="${secondNum}"><br>
        
        <button type ="submit" value="+" name="calculate">+</button>
        <button type ="submit" value="-" name="calculate">-</button>
        <button type ="submit" value="*" name="calculate">*</button>
        <button type ="submit" value="%" name="calculate">%</button>
        
        
        </form>
        <br>
        Result: ${calculated}
        <br>
        <a href ="age">Age Calculator</a>
    </body>
</html>
