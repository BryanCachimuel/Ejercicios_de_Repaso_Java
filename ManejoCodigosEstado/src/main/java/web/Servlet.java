package web;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        /* Simulando los valores correctos */
        String usuarioOk = "Roxana";
        String passwordOk = "123456789";
        
        /* capturando los valores del formulario */
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        /* validando que los valores que se ingresen por formulario sean iguales con los valores de la simulación */
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos Correctos");
            out.print("<br>Usuario: "+ usuario);
            out.print("<br>Password: "+ password);
            out.print("</h1>");
        }
        else{
            /* en caso de haber un error se manda un código de estado para este caso response.SC_UNAUTHORIZED */
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
    
}
