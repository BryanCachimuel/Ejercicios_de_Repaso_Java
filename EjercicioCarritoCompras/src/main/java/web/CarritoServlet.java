package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        // creamos o recuperamos el objeto http sesion
        HttpSession sesion = request.getSession();

        // recuperamos la lista de articulos agregados previamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        // verificamos si la lista de articulos existe
        if (articulos == null) {
            // inializamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        // procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        // revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try ( 
            // imprimimos la lista de articulos
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");
            // se itera todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            // agregamos un link para regresar al inicio
            out.print("<br>");
            out.print("<a href='/EjercicioCarritoCompras'>Regresar al Inicio</a>");
        }
    }
}
