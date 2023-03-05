<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="es">
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
                        <div class="card-header text-center"><h4>Formulario de Productos</h4></div>
                        <div class="card-body">
                            <form action="Controlador?menu=Productos" method="POST" autocomplete="off">
                                <div class="mb-3">
                                    <label for="txtproducto" class="form-label">Producto: </label>
                                    <input type="text" class="form-control" id="txtproducto" name="txtproducto" value="${productoSeleccionado.getNombreproducto()}">
                                </div>
                                <div class="mb-3">
                                    <label for="txtdescripcion" class="form-label">Descripción: </label>
                                    <textarea class="form-control" id="txtdescripcion" name="txtdescripcion" rows="3">${productoSeleccionado.getDescripcionproducto()}</textarea>
                                </div>
                                <div class="mb-3">
                                    <label for="txtunidad" class="form-label">Unidad: </label>
                                    <input type="text" class="form-control" id="txtunidad" name="txtunidad" value="${productoSeleccionado.getUnidad()}">
                                </div>
                                <div class="mb-3">
                                    <label for="txtprecio" class="form-label">Precio: </label>
                                    <input type="number" step="0.01" class="form-control" id="txtprecio" name="txtprecio" value="${productoSeleccionado.getPrecio()}">
                                </div> 
                                <div class="mb-3 row">
                                    <input type="submit" class="btn btn-primary mb-2" name="accion" value="AgregarProductos">
                                    <input type="submit" class="btn btn-success" name="accion" value="ActualizarProductos">  
                                </div>          
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-9">
                    <table class="table" id="productos">
                        <thead class="table-dark">
                            <tr class="text-white text-center">
                                <th scope="col">Id</th>
                                <th scope="col">Producto</th>
                                <th scope="col">Descripción</th>
                                <th scope="col">Unidad</th>
                                <th scope="col">Precio</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody class="text-center">
                            <c:forEach var="producto" items="${productos}">
                                <tr>
                                    <th scope="row">${producto.getId()}</th>
                                    <td>${producto.getNombreproducto()}</td>
                                    <td>${producto.getDescripcionproducto()}</td>
                                    <td>${producto.getUnidad()}</td>
                                    <td>${producto.getPrecio()}</td>
                                    <td>
                                        <a class="btn btn-warning" href="Controlador?menu=Productos&accion=CargarProductos&idproducto=${producto.getId()}"><i class="fa-sharp fa-solid fa-pen-to-square"></i></a>
                                        <a class="btn btn-danger" href="Controlador?menu=Productos&accion=EliminarProductos&idproducto=${producto.getId()}"><i class="fa-solid fa-trash"></i></a>
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
                $('#productos').DataTable({
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

