<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema de Ventas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <style>
            @media print{
                .seccion1, .btn, .columna{
                    display: none;
                }
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="row mt-5">
                <div class="col-5 seccion1">
                    <div class="card">
                        <h5 class="card-header">Datos Cliente</h5>
                        <div class="card-body">
                            <form action="Controlador?menu=Ventas" method="POST">
                                <div class="row g-3">
                                    <div class="col-auto">
                                        <input type="number" name="cedulacliente" class="form-control" placeholder="Cédula cliente" value="${cliente.getCedula()}">
                                    </div>
                                    <div class="col-auto">
                                        <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-dark">
                                    </div>
                                    <div class="col-auto">
                                        <input type="text" name="nombrecliente" class="form-control" placeholder="Nombre del Cliente" value="${cliente.getNombre()}">
                                    </div>
                                </div>
                                <div class="row"></div>
                            </form>
                        </div>
                    </div>

                    <div class="card mt-3">
                        <h5 class="card-header">Datos Producto</h5> 
                        <div class="card-body">
                            <form action="Controlador?menu=Ventas" method="POST">
                                <div class="row g-4">
                                    <div class="col-auto">
                                        <input type="number" name="codigoproducto" class="form-control" placeholder="Código Producto" value="${productoseleccionado.getId()}">
                                    </div>
                                    <div class="col-auto">
                                        <input type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-dark">
                                    </div>
                                    <div class="col-auto">
                                        <input type="text" name="nombreproducto" class="form-control" placeholder="Nombre Producto" value="${productoseleccionado.getNombreproducto()}">
                                    </div>
                                    <div class="col-auto">
                                        <input type="number" step="0.01" name="precioproducto" class="form-control" placeholder="$00.00" value="1">
                                    </div>
                                    <div class="col-auto mb-4">
                                        <input type="number" name="cantidadproducto" class="form-control" placeholder="Cantidad Producto" value="${productoseleccionado.getUnidad()}">
                                    </div>   
                                </div>
                                <div class="mx-auto">
                                    <input type="submit" name="accion" value="AgregarProducto" class="btn btn-outline-primary">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

                <div class="col-7">
                    <div class="card">
                        <div class="card-header">
                            <div class="mb-3 row">
                                <label for="txtnumerofactura" class="col-sm-2 col-form-label">Nro. Factura</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="txtnumerofactura" name="txtnumerofactura" value="${numerofactura}">
                                </div>  
                            </div>
                        </div>
                        <div class="card-body">
                            <table class="table">
                                <thead class="table-dark">
                                    <tr class="text-white">
                                        <th scope="col">#</th>
                                        <th scope="col">Código</th>
                                        <th scope="col">Producto</th>
                                        <th scope="col">Cantidad</th>
                                        <th scope="col">Precio</th>
                                        <th scope="col">Total</th>
                                        <th scope="col" class="columna">Acciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="lista" items="${listaventas}">
                                        <tr>
                                            <th scope="row" style="width: 30px;">${lista.getItem()}</th>
                                            <td style="width: 30px">${lista.getIdProducto()}</td>
                                            <td style="width: 350px">${lista.getDescripcionProducto()}</td>
                                            <td style="width: 30px">${lista.getCantidad()}</td>
                                            <td>$ ${lista.getPrecio()}</td>
                                            <td>${lista.getSubtotal()}</td>
                                            <td class="columna">
                                                <a class="btn btn-danger">Eliminar</a>
                                                <a class="btn btn-warning">Editar</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>

                        <div class="card-footer d-flex">
                            <div class="col-8 text-center">
                                <a class="btn btn-success" onclick="print()" href="Controlador?menu=Ventas&accion=GenerarVenta">Generar Venta</a>
                                <a class="btn btn-danger" href="Controlador?menu=Ventas&accion=NuevaVenta">Nueva Venta</a>
                            </div>
                            <div class="col-4">
                                <input type="text" name="txttotalpagar" class="form-control" placeholder="$00.00" disabled="disabled" value="${totalapagar}">
                            </div>
                        </div>
                    </div> 
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>

