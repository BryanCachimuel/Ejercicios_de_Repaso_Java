<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusi�n Din�mica</title>
    </head>
    <body>
        <h1>Ejemplo Inclusi�n Din�mica</h1>
        <br/>
        <jsp:include page="paginas_dinamicas/recursoPublico.jsp">
            <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>
    </body>
</html>
