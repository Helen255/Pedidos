<%-- 
    Document   : orders
    Created on : 16-mar-2019, 10:47:39
    Author     : helen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pedidos</h1><br>
        <table border="2">
            <tr>
                <th>Nombre Cliente</th>
                <th>Producto</th>
                <th>Codigo</th>
                <th>Marca</th>
                <th>Cantidad</th>
                <th>Vendedor</th>
            </tr>

        <a href="index.jsp"></a>
        <c:forEach items="${lista}" var="order">
            <tr>
                <td> ${order.clienteName}</td>  
                <td> ${order.productoName}</td>
                <td>${order.marca}</td>
                <td> ${order.codigo}</td>
                <td>${order.cantidad}</td> 
                <td>${order.usuarioName}</td> 
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
