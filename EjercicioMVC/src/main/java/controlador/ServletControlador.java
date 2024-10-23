package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // 1. Procesamos los parámetros
        
        //2. Creamos los JavaBeans
        Rectangulo rectangulo = new Rectangulo(25, 14);
        
        // 3. Agregamos el javabeans a algun alcance
        request.setAttribute("mensaje", "Saludos desde el Servlet -> ServletControlador");
        
        // 4. Se manda por sesión el objeto de la instancia de la clase Rectangulo
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rectangulo);
        
        // 5. Redireccionar a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
    }
    
}
