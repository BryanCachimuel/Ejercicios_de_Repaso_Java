<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de Variables</title>
    </head>
    <body>
        <h1>Despliegue de Variables</h1>
        Variable en alcance request: ${mensaje}
        <br/>
        <br/>
        Variables en alcance sesión
        <br/>
        Rectangulo: 
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        <br/>
        <h4>Area: ${rectangulo.area}</h4>
        <h4>Perimetro: ${rectangulo.perimetro}</h4>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
    </body>
</html>
