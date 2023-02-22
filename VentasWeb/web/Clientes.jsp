<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema de Ventas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-9 mx-auto">
                    <table class="table">
                        <thead class="table-dark">
                            <tr class="text-white">
                                <th scope="col">Id</th>
                                <th scope="col">Cédula</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Correo</th>
                                <th scope="col">Contraseña</th>
                                <th scope="col">Rol</th>
                                <th scope="col">Estado</th>
                                <!--<th scope="col">Acciones</th>-->
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="usuariocli" items="${usuariosclientes}">
                                <tr>
                                    <th scope="row">${usuariocli.getId()}</th>
                                    <td>${usuariocli.getCedula()}</td>
                                    <td>${usuariocli.getNombre()}</td>
                                    <td>${usuariocli.getCorreo()}</td>
                                    <td>${usuariocli.getPassword()}</td>
                                    <td>${usuariocli.getRol()}</td>
                                    <td>${usuariocli.getEstado()}</td>
                                    <!--<td>
                                        <a class="btn btn-warning" href="Controlador?menu=Empleados&accion=Cargar&id=${usuario.getId()}">Editar</a>
                                        <a class="btn btn-danger" href="Controlador?menu=Empleados&accion=Eliminar&id=${usuario.getId()}">Eliminar</a>
                                    </td>-->
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>