<%-- 
    Document   : ageCalculator
    Created on : 24-Sep-2022, 5:39:49 PM
    Author     : Jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method ="post" action="age">
            
            Enter your age: <input type ="text" name="userAge"><br>
            <input type="submit" value="Age next birthday"><br>
            
        </form> 
        ${ageMessage}<br>
            <a href="arithmetic">Arithmetic Calculator</a> 
    </body>
</html>
