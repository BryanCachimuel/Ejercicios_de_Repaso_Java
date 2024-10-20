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
        <title>Introducción a JSP</title>
    </head>
    <body>
        <h1>Introducción a JSP</h1>
        <ul>
            <li><% out.print("Hola Mundo con Scriplets"); %></li>
            <li>${"Hola Mundo con Expression Language (EL)"}</li>
            <li><%= "Hola Mundo con expresiones" %></li>
            <li><c:out value="Hola Mundo con JSTL" /></li>
        </ul>
    </body>
</html>
