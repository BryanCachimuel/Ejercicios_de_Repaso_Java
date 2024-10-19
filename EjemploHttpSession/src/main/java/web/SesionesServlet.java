package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        String titulo = "";
        
        /* Pedir el atributo contadorVisitas a la sesión */
        Integer contadorVisitas = (Integer) sesion.getAttribute(titulo);
        
        /* si es nulo es la primera vez que accedemos a la aplicación */
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por Primera Vez";
        }else{
            contadorVisitas++;
            titulo = "Bienvenido Nuevamente";
        }
        /* Agregamos el nuevo valor a la sesión */
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        /* mandamos la respuesta al cliente */
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br/>");
        out.print("no accesos al recurso: " + contadorVisitas);
        out.print("<br/>");
        out.print("Id de la sesión: " + sesion.getId());
        out.close();
    }
    
}
