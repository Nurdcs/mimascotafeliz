<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/clientes.css">
    <title>Document</title>
</head>
<body>
<%!long cedula=0;
String nombre="",correo="",usuario="",pass=""; %>
<%
if(request.getParameter("cedula")!=null)
{
cedula= Long.parseLong(request.getParameter("cedula"));
nombre= request.getParameter("nombre");
correo= request.getParameter("correo");
usuario = request.getParameter("usuario");
pass = request.getParameter("pass");
JOptionPane.showMessageDialog(null, "Datos: "+cedula+" - "+nombre+" - "+correo+" - "+usuario+" - "+pass);
}
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
      <section>
          <fieldset>
              <legend>Gestión Usuarios</legend>
                <form action="Usuarios" method="post">
                    <input type="text" name="cedula" value="<%=cedula %>" placeholder="Cedula">
                    <input type="text" name="nombre" value="<%=nombre %>" placeholder="Nombre">
                    <input type="email" name="correo" value="<%=correo %>" placeholder="Correo">
                    <input type="text" name="usuario" value="<%=usuario %>" placeholder="Usuario">
                    <input type="password" name="pass" value="<%=pass %>" placeholder="*****">
                    <input type="submit" name="insertar" value="insertar" placeholder="texto">
                    <input type="submit" name="actualizar" value="Actualizar" placeholder="texto">
                    <input type="submit" name="consultar" value="Consultar" placeholder="texto">
                    <input type="submit" name="eliminar" value="Eliminar" placeholder="texto">

                </form>


          </fieldset>
      </section>
</body>
</html>