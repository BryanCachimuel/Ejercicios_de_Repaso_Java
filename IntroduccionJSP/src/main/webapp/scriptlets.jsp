<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br/>
        <%-- Scriptlets para enviar información al navegador --%>
        <%
            out.print("Saludos desde un scriptlet");
        %>
        <%-- Scriptlets para manipular ilos objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.println("Nombre de la aplicación: " + nombreAplicacion);
        %>
        <br/>
        <%-- Scriptlets con código condicionado --%>
        <%
           if(session != null && session.isNew()){
        %>
            La sesión SI es nueva
         <%
             } else if(session != null){
        %>
            La sesión NO es nueva
            
        <% } %>
        <br/>
        <a href="index.html">Regresar al Inicio</a>
    </body>
</html>
