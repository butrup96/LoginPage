<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
Welcome ${name}

<!-- Initialize Date -->
<% Date date = new java.util.Date(); %>

<!-- = follows scriplet as expression language to display -->
<!-- Scriplets are bad coding practices -->
<div>
Date and Time: <%=date%>
</div>

</body>
</html>

<!-- Valid User -> welcome.jsp -->
<!-- Invalid User -> login.jsp -->