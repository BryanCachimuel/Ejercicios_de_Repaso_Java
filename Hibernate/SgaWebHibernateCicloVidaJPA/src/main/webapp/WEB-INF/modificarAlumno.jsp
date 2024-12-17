<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Actualizar Alumno</title>
    </head>
    <body>
        <h1>Actualizar Alumno</h1>
        <form name="form1" action="${pageContext.request.contextPath}/ServletModificar" method="post" autocomplete="off">
            <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
  
            Nombre: <input type="text" name="nombre" value="${alumno.nombre}"/>
            <br/>
            Apellido: <input type="text" name="apellido" value="${alumno.apellido}"/>
            <br/>
            Edad: Nombre: <input type="number" name="edad" value="${alumno.edad}"/>
            <br/><br/>
            
            Datos Domicilio:
            <br/>
            Calle: <input type="text" name="calle" value="${alumno.domicilio.calle}"/>
            <br/>
            Nro Casa: <input type="text" name="noCasa" value="${alumno.domicilio.noCasa}"/>
            <br/>
            Ciudad: <input type="text" name="ciudad" value="${alumno.domicilio.ciudad}"/>
            <br/><br/>
            
            Datos de Contacto:
            <br/>
            Nombre: <input type="text" name="nombreContacto" value="${alumno.contacto.nombreContacto}"/>
            <br/>
            Télefono: <input type="tel" name="telefono" value="${alumno.contacto.telefono}"/>
            <br/>
            Email: <input type="email" name="email" value="${alumno.contacto.email}"/>
            <br/>
            <input type="submit" name="Actualizar" value="Actualizar"/>
            <input type="submit" name="Eliminar" value="Eliminar"/>
        </form>
    </body>
</html>
