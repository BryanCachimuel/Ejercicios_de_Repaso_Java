package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/* para reconocer desde el navegador se debe agregar el siguiente decorador y dentro de los parentesis se define el path para ingresar al servlet*/
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola Mundo desde Servelets");
    }
    
}
