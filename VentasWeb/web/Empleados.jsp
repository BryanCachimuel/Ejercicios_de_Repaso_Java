<!doctype html>
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
                <div class="col-4">
                    <div class="card">
                        <div class="card-body">
                            <form action="Controlador?menu=Empleados" method="POST">
                                <div class="mb-3">
                                    <label for="txtcedula" class="form-label">Cédula: </label>
                                    <input type="number" class="form-control" id="txtcedula" name="txtcedula">
                                </div>
                                <div class="mb-3">
                                    <label for="txtnombre" class="form-label">Nombre: </label>
                                    <input type="text" class="form-control" id="txtnombre" name="txtnombre">
                                </div>
                                <div class="mb-3">
                                    <label for="txtcorreo" class="form-label">Correo: </label>
                                    <input type="email" class="form-control" id="txtcorreo" name="txtcorreo">
                                </div>
                                <div class="mb-3">
                                    <label for="txtpassword" class="form-label">Contraseña: </label>
                                    <input type="text" class="form-control" id="txtpassword" name="txtpassword">
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
                                <input type="submit" class="btn btn-primary" name="accion" value="Agregar">
                                <input type="submit" class="btn btn-success" name="accion" value="Actualizar">
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-8">
                    <table class="table">
                        <thead>
                            <tr>
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
                           
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>

