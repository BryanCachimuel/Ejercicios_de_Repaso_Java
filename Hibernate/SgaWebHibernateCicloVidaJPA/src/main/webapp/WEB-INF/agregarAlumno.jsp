<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Agregar Alumno</h1>
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post" autocomplete="off">
            Nombre: <input type="text" name="nombre"/>
            <br/>
            Apellido: <input type="text" name="apellido"/>
            <br/>
            Edad: Nombre: <input type="number" name="edad"/>
            <br/><br/>
            
            Datos Domicilio:
            <br/>
            Calle: <input type="text" name="calle"/>
            <br/>
            Nro Casa: <input type="text" name="noCasa"/>
            <br/>
            Ciudad: <input type="text" name="ciudad"/>
            <br/><br/>
            
            Datos de Contacto:
            <br/>
            Nombre: <input type="text" name="nombreContacto"/>
            <br/>
            Télefono: <input type="tel" name="telefono"/>
            <br/>
            Email: <input type="email" name="email"/>
            <br/>
            <input type="submit" name="Agregar" value="Agregar"/>
        </form>
    </body>
</html>
