<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sistema La Venta</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
      
      <div class="container mt-5 col-4">
          <div class="card col-sm-10">
              <div class="card-body">
                  <form class="form-sign" action="Validacion" method="POST">
                      <div class="form-group text-center">
                          <h3>Inicio de Sesi�n</h3>
                          <img src="img/ventas.png" alt="70" width="170"/>
                          <label>Bienvenido al Sistema La Venta</label>
                      </div>
                      <div class="form-group mt-4">
                          <label>Usuario:</label>
                          <input type="text" name="txtusuario" class="form-control">
                      </div>
                      <div class="form-group mt-4">
                           <label>Contrase�a:</label>
                           <input type="password" name="txtpassword" class="form-control">
                      </div>
                      <input type="submit" name="accion" value="Ingresar" class="btn btn-outline-primary mt-3">
                  </form>
              </div>
          </div>
      </div>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>
