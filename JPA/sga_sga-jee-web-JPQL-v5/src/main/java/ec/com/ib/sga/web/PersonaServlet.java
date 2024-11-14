package ec.com.ib.sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.servicio.PersonaService;

/*
    Se crea este servlet para que desde aquí se pueda acceder al EJB
*/

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject                             // sirve para hacer la llamada al EJB
    PersonaService personaService;      // llamamos a la interfaz PersonaService ya que mediante está interfaz se puede acceder al EJB
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("personas:" + personas);
        request.setAttribute("personas", personas);                                         // para poder enviar los datos hacia la vista se utiliza el alcance de request
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);    // se va a redirigir hacia un jsp para poder ver el listado de personas
    }
}
