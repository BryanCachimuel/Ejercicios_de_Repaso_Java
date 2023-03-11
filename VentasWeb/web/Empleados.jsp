<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema de Ventas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <!-- DataTable CSS -->
        <link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-3">
                    <div class="card">
                        <div class="card-header text-center"><h4>Formulario de Empleados</h4></div>
                        <div class="card-body">
                            <form action="Controlador?menu=Empleados" method="POST">
                                <div class="mb-3">
                                    <label for="txtcedula" class="form-label">Cédula: </label>
                                    <input type="number" class="form-control" id="txtcedula" name="txtcedula" value="${usuarioSeleccionado.getCedula()}">
                                </div>
                                <div class="mb-3">
                                    <label for="txtnombre" class="form-label">Nombre: </label>
                                    <input type="text" class="form-control" id="txtnombre" name="txtnombre" value="${usuarioSeleccionado.getNombre()}">
                                </div>
                                <div class="mb-3">
                                    <label for="txtcorreo" class="form-label">Correo: </label>
                                    <input type="email" class="form-control" id="txtcorreo" name="txtcorreo" value="${usuarioSeleccionado.getCorreo()}">
                                </div>
                                <div class="mb-3">
                                    <label for="txtpassword" class="form-label">Contraseña: </label>
                                    <input type="text" class="form-control" id="txtpassword" name="txtpassword" value="${usuarioSeleccionado.getPassword()}">
                                </div>
                                <div class="mb-3">
                                    <label for="txtrol" class="form-label">Rol: </label>
                                    <select class="form-control form-control-sm" name="txtrol">
                                        <option>Empleado</option>
                                        <option>Cliente</option>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="txtestado" class="form-label">Estado: </label>
                                    <select class="form-control form-control-sm" name="txtestado">
                                        <option>Activo</option>
                                        <option>Inactivo</option>
                                    </select>
                                </div>
                                <div class="mb-3 row">
                                    <input type="submit" class="btn btn-primary mb-2" name="accion" value="Agregar">
                                    <input type="submit" class="btn btn-success" name="accion" value="Actualizar">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-9">
                    <table class="table" id="empleados">
                        <thead class="table-dark">
                            <tr class="text-white">
                                <th scope="col">Id</th>
                                <th scope="col">Cédula</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Correo</th>
                                <th scope="col">Contraseña</th>
                                <th scope="col">Rol</th>
                                <th scope="col">Estado</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="usuario" items="${usuarios}">
                                <tr>
                                    <th scope="row">${usuario.getId()}</th>
                                    <td>${usuario.getCedula()}</td>
                                    <td>${usuario.getNombre()}</td>
                                    <td>${usuario.getCorreo()}</td>
                                    <td>${usuario.getPassword()}</td>
                                    <td>${usuario.getRol()}</td>
                                    <td>${usuario.getEstado()}</td>
                                    <td>
                                        <a class="btn btn-warning" href="Controlador?menu=Empleados&accion=Cargar&id=${usuario.getId()}"><i class="fa-sharp fa-solid fa-pen-to-square"></i></a>
                                        <a class="btn btn-danger" href="Controlador?menu=Empleados&accion=Eliminar&id=${usuario.getId()}"><i class="fa-solid fa-trash"></i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <!-- Proceso DataTable -->
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>                    

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        
         <script>
            $(document).ready(function () {
                $('#empleados').DataTable({
                    "language": {
                        "decimal": "",
                        "emptyTable": "No hay información",
                        "info": "Mostrando _START_ a _END_ de _TOTAL_ Entradas",
                        "infoEmpty": "Mostrando 0 a 0 de 0 Entradas",
                        "infoFiltered": "(Filtrado de _MAX_ total entradas)",
                        "infoPostFix": "",
                        "thousands": ",",
                        "lengthMenu": "Mostrar _MENU_ Entradas",
                        "loadingRecords": "Cargando...",
                        "processing": "Procesando...",
                        "search": "Buscar:",
                        "zeroRecords": "Sin resultados encontrados",
                        "paginate": {
                            "first": "Primero",
                            "last": "Ultimo",
                            "next": "Siguiente",
                            "previous": "Anterior"
                        }
                    },
                    "lengthMenu": [[5, 10, 15, 20], [5, 10, 15, "All"]
                    ],
                });
            });
        </script>
    </body>
</html>

