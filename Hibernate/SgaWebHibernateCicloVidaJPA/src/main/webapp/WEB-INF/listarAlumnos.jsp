<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Alumnos</title>
    </head>
    <body>
        <h1>Listar Alumnos</h1>
        <br/>
        <!-- pageContext.request.contextPath: obtiene el nombre de la aplicación -->
        <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>
        <br/>
        <table border="1">
            <tr>
                <th>Alumno ID</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Contacto</th>
                <th>Email</th>
                <th>Teléfono</th>
            </tr>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td>${alumno.idAlumno}</td>
                    <td>${alumno.nombre} ${alumno.apellido}</td>
                    <td>${alumno.domicilio.calle} ${alumno.domicilio.noCasa} ${alumno.domicilio.ciudad}</td>
                    <td>${alumno.contacto.nombre}</td>
                    <td>${alumno.contacto.email}</td>
                    <td>${alumno.contacto.telefono}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
