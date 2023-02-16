package Controladores;

import Modelos.Usuarios;
import Modelos.UsuariosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bryan
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
    
    Usuarios usuarios = new Usuarios();
    UsuariosDAO usuariosDAO = new UsuariosDAO();
    
    int idUsuario;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*menu -> palabra clave descrita en el archivo Validar request.getRequestDispatcher("Controlador?menu=Principal").forward(request, response);*/
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if(menu.equals("Principal")){
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }else if(menu.equals("Productos")){
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }else if(menu.equals("Empleados")){
            switch(accion){
                case "Listar":
                    List listaUsuarios = usuariosDAO.Listar();
                    request.setAttribute("usuarios", listaUsuarios);
                    break;
                case "Agregar":
                    int cedula = Integer.parseInt(request.getParameter("txtcedula"));
                    String nombre = request.getParameter("txtnombre");
                    String correo = request.getParameter("txtcorreo");
                    String password = request.getParameter("txtpassword");
                    String rol = request.getParameter("txtrol");
                    String estado = request.getParameter("txtestado");
                    usuarios.setCedula(cedula);
                    usuarios.setNombre(nombre);
                    usuarios.setCorreo(correo);
                    usuarios.setPassword(password);
                    usuarios.setRol(rol);
                    usuarios.setEstado(estado);
                    usuariosDAO.Agregar(usuarios);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                    break;
                case "Cargar":
                    idUsuario = Integer.parseInt(request.getParameter("id"));
                    Usuarios usuarios = usuariosDAO.ListarPorId(idUsuario);
                    request.setAttribute("usuarioSeleccionado", usuarios);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    Usuarios usuario = new Usuarios();
                    int cedulaActualizar = Integer.parseInt(request.getParameter("txtcedula"));
                    String nombreActualizar =request.getParameter("txtnombre");
                    String correoActualizar = request.getParameter("txtcorreo");
                    String passwordActualizar = request.getParameter("txtpassword");
                    String rolActualizar = request.getParameter("txtrol");
                    String estadoActualizar = request.getParameter("txtestado");
                    usuario.setCedula(cedulaActualizar);
                    usuario.setNombre(nombreActualizar);
                    usuario.setCorreo(correoActualizar);
                    usuario.setPassword(passwordActualizar);
                    usuario.setRol(rolActualizar);
                    usuario.setEstado(estadoActualizar);
                    usuario.setId(idUsuario);
                    usuariosDAO.Actualizar(usuario);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    idUsuario = Integer.parseInt(request.getParameter("id"));
                    usuariosDAO.Eliminar(idUsuario);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Empleados.jsp").forward(request, response);
        }else if(menu.equals("Clientes")){
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }else if(menu.equals("Ventas")){
            request.getRequestDispatcher("Ventas.jsp").forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
