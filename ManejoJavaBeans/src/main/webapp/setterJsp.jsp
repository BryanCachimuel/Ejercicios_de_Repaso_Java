<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp que modifica a un JavaBean</title>
    </head>
    <body>
        <h1>Jsp que modifica a un JavaBean</h1>
        <!-- 
            este JSP se encarga de crear:
            id="rectangulo"          -> una variable 
            class="beans.Rectangulo" -> de tipo rectangulo
            scope="session"          -> lo esta depositando en un alcance de sesión
        -->
        <%--<jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>--%>
        <%--
            Va a exitir esta propiedad por todo el momento que este arriba la aplicación
            <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="application"/>
        --%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
         Modificando los atributos:
         <br/>
         <br/>
         <%
             int baseValor = 5;
             int alturaValor = 8;
         %>
         <jsp:setProperty name="rectangulo" property="base" value="<%= baseValor %>"/>
         <jsp:setProperty name="rectangulo" property="altura" value="<%= alturaValor %>"/>
         <br/>
         Nuevo Valor base: <%= baseValor %>
         <br/>
         Nuevo Valor altura: <%= alturaValor %>
         
         <br/>
        <br/>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
