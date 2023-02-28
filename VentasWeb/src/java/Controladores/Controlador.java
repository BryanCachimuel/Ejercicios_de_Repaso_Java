package Controladores;

import Modelos.Productos;
import Modelos.ProductosDAO;
import Modelos.Usuarios;
import Modelos.UsuariosDAO;
import Modelos.Venta;
import Modelos.VentaDAO;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
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
    
    Productos productos = new Productos();
    ProductosDAO productosDAO = new ProductosDAO();
    
    int idUsuario;
    int idProducto;
    int idvta;
    
    Venta venta = new Venta();
    int item, codProducto, precio, cantidad;
    String descripcion;
    double subtotal, totalapagar;
    List<Venta> listaVenta = new ArrayList();
    
    NumberFormat formatoNumero1;
    String total1;
    VentaDAO ventaDAO = new VentaDAO();
    int numFactura = 0;
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
            switch(accion){
                case "ListarProductos":
                    List listarProductos = productosDAO.ListarProductos();
                    request.setAttribute("productos", listarProductos);
                    break;
                case "AgregarProductos":
                    String nombreproducto = request.getParameter("txtproducto");
                    String descripcionproducto = request.getParameter("txtdescripcion");
                    String unidad = request.getParameter("txtunidad");
                    double precio = Double.parseDouble(request.getParameter("txtprecio"));
                    productos.setNombreproducto(nombreproducto);
                    productos.setDescripcionproducto(descripcionproducto);
                    productos.setUnidad(unidad);
                    productos.setPrecio(precio);
                    productosDAO.AgregarProductos(productos);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProductos").forward(request, response);
                    break;
                case "CargarProductos":
                    idProducto = Integer.parseInt(request.getParameter("idproducto"));
                    Productos productos = productosDAO.ListarProductoPorId(idProducto);
                    request.setAttribute("productoSeleccionado", productos);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProductos").forward(request, response);
                    break;
                case "ActualizarProductos":
                    Productos producto = new Productos();
                    String nombreProducto = request.getParameter("txtproducto");
                    String descripcionProducto = request.getParameter("txtdescripcion");
                    String unidadProducto = request.getParameter("txtunidad");
                    double precioProducto = Double.parseDouble(request.getParameter("txtprecio"));
                    producto.setNombreproducto(nombreProducto);
                    producto.setDescripcionproducto(descripcionProducto);
                    producto.setUnidad(unidadProducto);
                    producto.setPrecio(precioProducto);
                    producto.setId(idProducto);
                    productosDAO.ActualizarProducto(producto);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProductos").forward(request, response);
                    break;
                case "EliminarProductos":
                    idProducto = Integer.parseInt(request.getParameter("idproducto"));
                    productosDAO.EliminarProducto(idProducto);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProductos").forward(request, response);
                    break;
            }
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
            switch(accion){
                 case "ListarClientes":
                    List listaclientes = usuariosDAO.ListarClientes();
                    request.setAttribute("usuariosclientes", listaclientes);
                    break;
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }else if(menu.equals("Ventas")){
            switch(accion){
                case "BuscarCliente":
                    int cedulaCliente = Integer.parseInt(request.getParameter("cedulacliente"));
                    //System.err.println("Entro a buscar: " + cedulaCliente);
                    usuarios = usuariosDAO.BuscarCliente(cedulaCliente);
                    request.setAttribute("cliente", usuarios);
                    break;
                case "BuscarProducto":
                    int codigoProducto = Integer.parseInt(request.getParameter("codigoproducto"));
                    productos = productosDAO.BuscarProducto(codigoProducto);
                    System.out.println(""+productos.getNombreproducto());
                    request.setAttribute("productoseleccionado", productos);
                    request.setAttribute("cliente", usuarios);
                    for(int i = 0; i < listaVenta.size(); i++){
                        totalapagar += listaVenta.get(i).getSubtotal();
                    }
                    formatoNumero1 = NumberFormat.getNumberInstance();
                    total1 = formatoNumero1.format(totalapagar);
                    request.setAttribute("totalapagar", total1);
                    request.setAttribute("listaventas", listaVenta);
                    break;
                case "AgregarProducto":
                    totalapagar = 0;
                    venta = new Venta();
                    item++;
                    codProducto = Integer.parseInt(request.getParameter("codigoproducto"));
                    descripcion = request.getParameter("nombreproducto");
                    precio = Integer.parseInt(request.getParameter("precioproducto"));
                    cantidad = Integer.parseInt(request.getParameter("cantidadproducto"));
                    subtotal = precio * cantidad;
                    venta.setItem(item);
                    venta.setDescripcionProducto(descripcion);
                    venta.setCantidad(cantidad);
                    venta.setPrecio(precio);
                    venta.setSubtotal(subtotal);
                    venta.setIdProducto(codProducto);
                    listaVenta.add(venta);
                    request.setAttribute("listaventas", listaVenta);
                    for(int i = 0; i < listaVenta.size(); i++){
                        totalapagar += listaVenta.get(i).getSubtotal();
                    }
                    formatoNumero1 = NumberFormat.getNumberInstance();
                    total1 = formatoNumero1.format(totalapagar);
                    request.setAttribute("totalapagar", total1);
                    break;
                case "GenerarVenta":
                    venta.setIdCliente(usuarios.getId());
                    venta.setIdEmpleado(1);
                    venta.setNumeroComprobante(""+numFactura);
                    venta.setFecha("2023-02-26");
                    venta.setMonto(totalapagar);
                    venta.setEstado("1");
                    ventaDAO.RegistrarVenta(venta);
                    int idv = ventaDAO.ObtenerMaximoIdVenta();
                    for (int i = 0; i < listaVenta.size(); i++) {
                        venta = new Venta();
                        venta.setIdVenta(idv);
                        venta.setIdProducto(listaVenta.get(i).getIdProducto());
                        venta.setCantidad(listaVenta.get(i).getCantidad());
                        venta.setPrecio(listaVenta.get(i).getPrecio());
                        ventaDAO.GuardarDetalleVenta(venta);
                    }
                    break;
                case "CargarVenta":
                    idvta = Integer.parseInt(request.getParameter("idventa"));
                    Venta venta = ventaDAO.CargarVentaPorId(idvta);
                    request.setAttribute("ventaseleccionada", venta);
                    request.getRequestDispatcher("Ventas.jsp").forward(request, response);
                    break;
                case "EliminarVenta":
                    idvta = Integer.parseInt(request.getParameter("idventa"));
                    ventaDAO.EliminarVenta(idvta);
                    request.getRequestDispatcher("Ventas.jsp").forward(request, response);
                    break;
                    default:
                        String nrofactura = ventaDAO.ObtenerNumeroFactura();
                        System.err.println("número de factura: " + nrofactura);
                        if(nrofactura == null){
                            nrofactura = "1";
                        }else{
                            numFactura = Integer.parseInt(nrofactura) + 1;
                        }
                        request.setAttribute("numerofactura", numFactura);
            }
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
