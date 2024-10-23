<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core (JSP Standart Tag Library)</h1>
        <!-- Manipulaci�n de Variables -->
        <!-- Definimos la variable -->
        <c:set var="nombre" value="Jessica"/>
        <!-- Desplegamos el valor de variable -->
        Variable nombre: <c:out value="${nombre}"/>
        <b/>
        <br/>
        <!-- escapeXml="false" -> se lo utiliza para que la etiqueta html aplique sus cambios a Saludos -->
        Variable con c�digo html: <c:out value="<h4>Saludos</h4>" escapeXml="false"/>
        <br/>
        <br/>
        <!-- C�digo condicionado, uso de if -->
        <c:set var="bandera" value="true"/>
        
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <!--  C�digo condicionado, uso de switch -->
        <%--<c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opci�n 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    Opci�n 2 seleccionada
                </c:when>
                <!-- opcion por default -->
                <c:otherwise>
                   <br/>
                   Opci�n proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>--%>
                   
        <!-- Iteraci�n de un arreglo -->
        <%
            String nombres[] = {"Diana","Dayana","Nathaly"};
            request.setAttribute("nombres", nombres);
        %>
        <br/>
        Lista de Nombres:
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>Nombre: ${persona}</li>
            </c:forEach>
        </ul>
    </body>
</html>
