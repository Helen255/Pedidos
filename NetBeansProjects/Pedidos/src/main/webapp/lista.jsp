<%-- 
    Document   : lista
    Created on : 07-mar-2019, 11:38:22
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
    <body>
   
       
        
        <form id="list" method="post" action="CreateUsuario">
             <h1>Resgistrate</h1>
            <input name="name" type="text"required placeholder="Usuario"/><br><br>
            <input name="pass" type="password" required placeholder="Contraseña"/><br><br><br>

            <button>Registrar</button>

           
            <a href="search.jsp">Volver</a>

            <c:forEach items="${list}" var="usuario">
                <p>${usuario.user_name}
                   




                </p>
            </c:forEach>
        </form>
    </body>
</html>
