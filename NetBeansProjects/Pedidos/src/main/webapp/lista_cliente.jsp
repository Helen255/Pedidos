<%-- 
    Document   : lista_cliente
    Created on : 09-mar-2019, 0:19:16
    Author     : Helen Garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet"href="${pageContext.request.contextPath}/css/estilo.css" type="text/css"><link>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="susu">
        
        

        <form id="liscli"  method="post" action="CreateCliente" >
            <h1>Nombres de Clientes</h1>
            <input id="i" name="nom" type="text" required minlength="2"/>
            <button id="b1">Guardar</button><br><br><br><br>

            <a href="search.jsp">Volver</a>

            <c:forEach items="${list}" var="cliente">
                <p>${cliente.name}
                    <a href="ClienteById?id=${cliente.id}">Ver </a>
                   



                </p>
            </c:forEach>
        </form>
    </body>
</html>
