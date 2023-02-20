<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema de Ventas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-3">
                    <div class="card">
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
                                <input type="submit" class="btn btn-primary" name="accion" value="AgregarProductos">
                                <input type="submit" class="btn btn-success" name="accion" value="ActualizarProductos">
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-9">
                    <table class="table">
                        <thead class="table-dark">
                            <tr class="text-white">
                                <th scope="col">Id</th>
                                <th scope="col">Producto</th>
                                <th scope="col">Descripción</th>
                                <th scope="col">Unidad</th>
                                <th scope="col">Precio</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="producto" items="${productos}">
                                <tr>
                                    <th scope="row">${producto.getId()}</th>
                                    <td>${producto.getNombreproducto()}</td>
                                    <td>${producto.getDescripcionproducto()}</td>
                                    <td>${producto.getUnidad()}</td>
                                    <td>${producto.getPrecio()}</td>
                                    <td>
                                        <a class="btn btn-warning" href="Controlador?menu=Productos&accion=CargarProductos&idproducto=${producto.getId()}">Editar</a>
                                        <a class="btn btn-danger" href="Controlador?menu=Productos&accion=EliminarProductos&idproducto=${producto.getId()}">Eliminar</a>
                                    </td>
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

