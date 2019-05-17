<%-- 
    Document   : lista_producto
    Created on : 09-mar-2019, 14:17:02
    Author     : helen
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
    <body id="cuatro">

        <form id="lispro" method="post" action="CreateProducto" >
            <h1>Productos</h1>
            <label>Codigo<input id="i3" name="codigo" type="text" required minlength="2"/>
                <label>Name</label> <input id="i3" name="name" type="text" required minlength="2"/>
                <label>Marca</label><input id="i3" name="marca" type="text" required minlength="2"/>
                <button id="b4">Guardar</button><br><br><br>

                <a href="search.jsp">Volver</a>

                <c:forEach items="${list}" var="producto">
                    <p>${producto.name} ${producto.codigo} ${producto.marca}



                    </p>
                </c:forEach>
                </body>
                </html>
