<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!!!!!! From JSP</title>
</head>
<body>
<form action = "/login.do" method = "post">
<p><font color = "red"> ${errorMessage} </font></p>

<!-- Request Name Param -->
Name: <input type = "text" name= "name"/> 

<!-- Request Password Param -->
Password: <input type = "password" name= "password"/> 

<!-- Submit Button -->
<input type = "submit" value = "Login"/>

</form>
</body>
</html>