<%-- 
    Document   : index
    Created on : 06-mar-2019, 15:02:10
    Author     : helen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet"href="${pageContext.request.contextPath}/css/estilo.css" type="text/css"><link>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

        <img id="imgg" src="bro.jpg"> 
    <body>
       
        <form id="ss" method="get" action="CreateListUser">
            <h1>Inicio de Sesion</h1>
            <input id="p1" name="name" type="text"required placeholder="Usuario" /><br><br>
            <input id="p1" name="pass" type="password"required placeholder="Password"  /><br>
            <a href="addOrders.jsp"></a><br><br>
          
            <button id="b6">Ingresar</button>
        </form>
        <button id="b6" onclick="location.href='lista.jsp'"></button>
        <img id="imgg" src="bro.jpg"> 

    </body>
</html>
