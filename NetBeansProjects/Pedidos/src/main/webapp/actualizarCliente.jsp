<%-- 
    Document   : actualizarCliente
    Created on : 09-mar-2019, 21:10:45
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

    <body>

        <form id="actu" method="post" action="ClienteUpdate">
            <h1>Actualizacion</h1>
            <a> <label>Actualizar</label> <input name="nom" value="${cliente.name}" type="text" required minlength="2">
                <button>Actualizar</button><br><br>

                <a href="CreateClienteList">Volver a Lista</a><br><br>

                <a href="AddPedido?cli=${cliente.id}&clienteName=${cliente.name}">Agregar Pedido</a>
        </form>   
    </body>
</html>
