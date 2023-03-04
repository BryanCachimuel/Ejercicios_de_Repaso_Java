<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema de Ventas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>

        <header class="p-3 mb-3 border-bottom">
                <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                    <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                        <li><a class="nav-link px-2 link-secondary" href="Controlador?menu=Inicio" target="miContenedor"><i class="fa-solid fa-house"></i> Inicio</a></li>
                        <li><a class="nav-link px-2 link-dark" href="Controlador?menu=Productos&accion=ListarProductos" target="miContenedor"><i class="fa-solid fa-basket-shopping"></i> Productos</a></li>
                        <li><a class="nav-link px-2 link-dark" href="Controlador?menu=Empleados&accion=Listar" target="miContenedor"><i class="fa-solid fa-user-tie"></i> Empleados</a></li>
                        <li><a class="nav-link px-2 link-dark" href="Controlador?menu=Clientes&accion=ListarClientes" target="miContenedor"><i class="fa-solid fa-users"></i> Clientes</a></li>
                        <li><a class="nav-link px-2 link-dark" href="Controlador?menu=Ventas&accion=default" target="miContenedor"><i class="fa-solid fa-cart-shopping"></i> Ventas</a></li>
                    </ul>

                  

                    <div class="dropdown text-end">
                        <a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="fa-solid fa-user-check"></i> ${usuarios.getNombre()}
                        </a>
                        <ul class="dropdown-menu text-small">
                            <li><a class="dropdown-item" href="#">${usuarios.getCedula()}</a></li>
                            <li><a class="dropdown-item" href="#">${usuarios.getCorreo()}</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <form method="POST" action="Validar">
                                <li><input type="submit" class="dropdown-item" name="accion" value="Salir"></li>
                            </form>
                        </ul>
                    </div>
                </div>
            
        </header>

        <div class="ratio ratio-16x9" style="height:900px;">
            <iframe name="miContenedor" style="height:100%; width:100%;" frameBorder="1"></iframe> 
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>
