package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        String uri = request.getRequestURI();
        // Imprimir todos los cabecerso disponibles
        Enumeration cabeceros = request.getHeaderNames();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers Http</title>");
        out.print("</head>");
        out.print("<body>");
        
        out.print("<h1>Headers HTTP</h1>");
        out.print("Metodo Http: " + metodoHttp);
        out.print("<br/>");
        
        out.print("Uri solicitada: " + uri);
        out.print("<br/>");
        out.print("<br/>");
        
        while(cabeceros.hasMoreElements()){
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "</b>");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br/>");
        }
                
                
        out.print("</body>");
        out.print("</html>");
        out.close(); // es buena practica realziar este cierre
    }
    
}
