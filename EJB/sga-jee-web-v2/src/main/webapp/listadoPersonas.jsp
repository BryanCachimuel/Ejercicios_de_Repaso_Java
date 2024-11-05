<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Personas SGA</title>
    </head>
    <body>
        <h1>Listado de Personas SGA</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>${persona.nombre} ${persona.apellido}</li>
                <li>${persona.email}</li>
                <li>${persona.telefono}</li>
            </c:forEach>
        </ul>

    </body>
</html>
