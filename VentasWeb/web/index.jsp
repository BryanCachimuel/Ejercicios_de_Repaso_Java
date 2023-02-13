<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema de Ventas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mx-auto mt-5">
            <div class="row justify-content-center">
                <div class="card" style="width: 18rem;">
                    <h3>Inicio de Sesión</h3>
                    <img src="./publico/imagen/carrito.png" class="card-img-top" alt="...">
                    <div class="card-body">
                        <form method="POST" action="Validar">
                            <div class="mb-3">
                                <label for="txtusuario" class="form-label">Cédula de Identidad:</label>
                                <input type="text" class="form-control" id="txtusuario" name="txtusuario">
                                <div id="emailHelp" class="form-text">Ingrese su Cédula de Identidad sin Espacios y Giones</div>
                            </div>
                            <div class="mb-3">
                                <label for="txtpassword" class="form-label">Contraseña:</label>
                                <input type="password" class="form-control" id="txtpassword" name="txtpassword">
                            </div>
                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Permanecer Logeado</label>
                            </div>
                            <button type="submit" class="btn btn-primary" name="accion" value="Ingresar">Ingresar</button>
                        </form>
                    </div>
                </div>
            </div>  
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>

