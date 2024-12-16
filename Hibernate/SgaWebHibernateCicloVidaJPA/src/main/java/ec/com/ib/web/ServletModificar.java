package ec.com.ib.web;

import ec.com.ib.domain.Alumno;
import ec.com.ib.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // recuperar el id que se envia desde el jsp de listarAlumnos
        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);
        
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);
        
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarAlumno(alumno);        // se almacena en una variable alumno para poder recuperar toda la información de ese alumno
        
        request.setAttribute("alumno", alumno);
        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);
    }
    
    
}
