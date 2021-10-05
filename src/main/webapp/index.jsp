<%@page import="Controlador.Conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Conexion con=new Conexion();

%>


<fieldset>
<form action="Login" method="POST">   
<input type="text" name="usu" id="">
<input type="text" name="pas" id="">
<input type="submit" name="btn" id="">
</form> 
</fieldset>
</body>
</html>