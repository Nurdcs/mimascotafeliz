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
<%
String ced="",nom="",dir="",cor="",tel="";

if(request.getParameter("c")!=null){
ced=request.getParameter("c");
nom=request.getParameter("n");
dir=request.getParameter("d");
cor=request.getParameter("co");
tel=request.getParameter("t");
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
              <legend>Gestión Clientes</legend>
                <form action="Cliente" method="POST">
                    <input type="text" name="ced" value="<%=ced%>" placeholder="texto">
                    <input type="text" name="dir" value="<%=dir%>" placeholder="texto">
                    <input type="text" name="ema" value="<%=cor%>" placeholder="texto">
                    <input type="text" name="nom" value="<%=nom%>" placeholder="texto">
                    <input type="text" name="tel" value="<%=tel%>" placeholder="texto">
                    <input type="submit" name="btnisn" value="insertar" >
                    <input type="submit" name="" value="Actualizar" >
                    <input type="submit" name="btncon" value="Consultar" >
                    <input type="submit" name="btneli" value="Eliminar" >

                </form>


          </fieldset>
          
          <table>
          <tr>
	          <td><%=ced%></td>
	          <td><%=dir%></td>
	          <td><%=cor%></td>
	          <td><%=nom%></td>
	          <td><%=tel%></td>
          
          </tr>
          
          
          </table>
      </section>
</body>
</html>