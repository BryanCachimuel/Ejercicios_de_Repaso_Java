package ec.com.ib.sga.web;

import ec.com.ib.sga.domain.Usuario;
import ec.com.ib.sga.servicio.UsuarioService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
    Se crea este servlet para que desde aquí se pueda acceder al EJB de Usuario
*/

@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet{
    
    @Inject 
    UsuarioService usuarioService;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        System.out.println("usuarios:" + usuarios);
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("/listadoUsuarios.jsp").forward(request, response);
    }
}
