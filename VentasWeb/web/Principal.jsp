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

        <nav class="navbar navbar-expand-lg bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#" target="miContenedor"><i class="fa-solid fa-house"></i> Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="Controlador?menu=Productos&accion=ListarProductos" target="miContenedor">Productos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page"href="Controlador?menu=Empleados&accion=Listar" target="miContenedor">Empleados</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="Controlador?menu=Clientes&accion=ListarClientes" target="miContenedor">Clientes</a>
                        </li>
                         <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="Controlador?menu=Ventas&accion=default" target="miContenedor">Ventas</a>
                        </li>
                    </ul>
                    <div class="btn-group">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            ${usuarios.getNombre()}
                        </a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#"><i class="fa-solid fa-user"></i></a>
                            <a class="dropdown-item" href="#">${usuarios.getCedula()}</a>
                            <a class="dropdown-item" href="#">${usuarios.getCorreo()}</a>
                            <div class="dropdown-divider"></div>
                            <form class="dropdown-item" method="POST" action="Validar">
                                <button class="dropdown-item" type="submit" name="accion" value="Salir">Cerrar Sesión</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
        
        <div class="ratio ratio-16x9" style="height:900px;">
                <iframe name="miContenedor" style="height:100%; width:100%;" frameBorder="1"></iframe>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </body>
</html>
