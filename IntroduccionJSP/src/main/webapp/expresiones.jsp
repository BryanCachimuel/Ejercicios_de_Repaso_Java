<%-- 
    Document   : index
    Created on : 19 oct. 2024, 21:08:07
    Author     : Bryan
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <%--
            <ul>
                <li><% out.print("Hola Mundo con Scriplets"); %></li>
                <li>${"Hola Mundo con Expression Language (EL)"}</li>
                <li><%= "Hola Mundo con expresiones" %></li>
                <li><c:out value="Hola Mundo con JSTL" /></li>
            </ul>
        --%>
        <h1>JSP con Expresiones</h1
        Concatenación: <%= "Saludos" + " " + "JSP" %>
        <br/>
        Operación Matemática <%= 2 * 3 /2 %>
        <br/>
        Session id: <%= session.getId() %>
        <br/>
        <br/>
        <a href="index.html">Regresar al Inicio</a>
        
    </body>
</html>
