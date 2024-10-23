<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del JavaBean</title>
    </head>
    <body>
        <%-- 
            Se puede hacer una sola petición al servidor una vez se refresque todos los atributos y propiedades
            creadas desaparacen
            <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="request"/>
        --%>
        <h1>JSP que lee los valores del JavaBean</h1>
        <%--<jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>--%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        <br/>
        Valor Base: <jsp:getProperty name="rectangulo" property="base"/>
        <br/>
        Valor Altura: <jsp:getProperty name="rectangulo" property="altura"/>
        <br/>
        <!<!-- esta propiedad como tal no existe pero se puede mandar a llamar al método definido getArea -->
        Valor Area: <jsp:getProperty name="rectangulo" property="area"/>
        
        <br/>
        <br/>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
