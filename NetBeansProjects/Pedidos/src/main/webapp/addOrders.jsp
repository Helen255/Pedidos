<%-- 
    Document   : addOrders
    Created on : 09-mar-2019, 18:05:12
    Author     : helen
--%>

<%@page import="com.models.Producto"%>
<%@page import="com.Dao.ProductoDao"%>
<
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet"href="${pageContext.request.contextPath}/css/estilo.css" type="text/css"><link>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="seis">




        <form id="order" action="CreatePedido" method="post">
            <h1>NombrePedidos</h1>

            <input type="hidden" name="cliente" value="${clie}">
            <label>Cantidad</label> <input id="i4" type="text" name="cantidad"/>
            <%
                ProductoDao uno = new ProductoDao();

            %> 
            <select name="producto">
                <%                   for (Producto id : uno.getProductList()) {%>
                <option value="<%= id.getId()%>"><%= id.getName()%></option>

                <% }
                %>

            </select>
            <button id="b5">Guardar</button>
             <a href="index.jsp">Volver</a>
        </form>

       

    </body>
</html>
