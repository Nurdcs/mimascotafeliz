<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styless.css">
    <title>Document</title>
</head>
<body>
<%
HttpSession objsesion=request.getSession();
String nombre=(String)objsesion.getAttribute("llevadato");
String nom=(String)objsesion.getAttribute("llevadat");
%>

  <header id="contenedortitulo"   class="headerclass">
    <div class="logotitulo">
      <h1 id="titulop"  class="titulop">Mascotas felices </h1>
      <div class="logo"></div>
    </div>
    <nav class="navbar">

     
          <ul>
              <li><a href="#">Mascotas</a></li>
              <li><a href="#">Curiosidades </a></li>
              <li><a href="#">Tips </a></li>
              <li><a href="#">Alimentación </a></li>
              <li><a href="#">Lugares </a></li>
              <li><a href="#">Razas </a></li>
              <li><a href="#">Eventos </a></li>
              <li><a href="#">Deportes </a></li>
             
          </ul>
    </nav>
    
      
          
  

  </header>
  <label><%=nombre %></label>
  <label><%=nom%></label>
<input type="hidden" name="codigo" value="${vs.getCedula_Usuario()}"  >
    <main>
    <section>
     <div id="u"><a  href="Usuarios.jsp">Usuarios</a></div>
      <div id="c"><a href="clientes.jsp">Clientes</a></div>
      <div id="p"><a href="proveedores.jsp">Proveedores</a></div>
      <div id="v"><a href="productos.jsp">Productos</a></div>
      <div id="d"><a href="ventas.jsp">Ventas</a></div>
    
    </section>
</main>
</body>
</html>