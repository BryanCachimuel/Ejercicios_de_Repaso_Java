package ec.com.ib.web;

import ec.com.ib.domain.Alumno;
import ec.com.ib.domain.Contacto;
import ec.com.ib.domain.Domicilio;
import ec.com.ib.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        Integer edad = Integer.parseInt(request.getParameter("edad"));
        
        String calle = request.getParameter("calle");
        String noCasa = request.getParameter("noCasa");
        String ciudad = request.getParameter("ciudad");
        
        String nombreContacto = request.getParameter("nombreContacto");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNoCasa(noCasa);
        domicilio.setCiudad(ciudad);
        
        Contacto contacto = new Contacto();
        contacto.setNombreContacto(nombreContacto);
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setEdad(edad);
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        servicioAlumno.guardarAlumno(alumno);
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        
    }
    
}
