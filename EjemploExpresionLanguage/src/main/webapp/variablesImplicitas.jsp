<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expression Language y Variables Implicitas</title>
    </head>
    <body>
        <h1>Expression Language y Variables Implicitas</h1>
        <ul>
            <li>Nombre de la Aplicaci�n: ${pageContext.request.contextPath}</li>
            <li>Navegador del Cliente: ${header["User-Agent"]}</li>
            <li>Id Sesion: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor Par�metro Primera Form: ${param.auto}</li>
            <li>Valor Par�metro Segunda Forma: ${param["auto"]}</li>
        </ul>
    </body>
</html>
