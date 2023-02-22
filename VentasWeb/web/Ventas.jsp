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
        <div class="row">
            <div class="col-5 seccion1">
                <div class="card">
                    <h5 class="card-header">Datos Cliente</h5>
                    <div class="card-body">
                        <form action="Controlador?menu=Ventas" method="POST">
                            <div class="row">
                                <div class="col-4 d-flex">
                                    <input type="number" name="cedulacliente" class="form-control" placeholder="Cédula cliente">
                                    <input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-dark">
                                </div>
                                <div class="col-8 d-flex">
                                    <input type="text" name="nombrecliente" class="form-control" placeholder="Nombre del Cliente">
                                </div>
                            </div>
                            <div class="row"></div>
                        </form>
                    </div>
                </div>
                
                <div class="card">
                    <h5 class="card-header">Datos Producto</h5> 
                    <div class="card-body">
                        <form action="Controlador?menu=Ventas" method="POST">
                            <div class="row">
                                <div class="col-4 d-flex form-group">
                                    <input type="number" name="codigoproducto" class="form-control" placeholder="Código Producto">
                                    <input type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-dark">
                                </div>
                                <div class="col-8 d-flex form-group">
                                    <input type="text" name="nombreproducto" class="form-control" placeholder="Nombre Producto">
                                </div>
                                <div class="col-4 d-flex form-group">
                                    <input type="number" step="0.01" name="precioproducto" class="form-control" placeholder="$00.00">
                                </div>
                                <div class="col-8 d-flex form-group">
                                    <input type="number" value="1" name="cantidadproducto" class="form-control" placeholder="Cantidad Producto">
                                </div>
                                <input type="submit" name="accion" value="AgregarProducto" class="btn btn-outline-primary col text-center">
                                <div class="row"></div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            
            <div class="col-7">
                <div class="card">
                    
                </div> 
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>

