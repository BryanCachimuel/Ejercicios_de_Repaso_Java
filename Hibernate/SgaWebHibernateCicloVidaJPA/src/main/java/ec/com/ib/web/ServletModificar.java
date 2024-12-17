package ec.com.ib.web;

import ec.com.ib.domain.Alumno;
import ec.com.ib.domain.Contacto;
import ec.com.ib.domain.Domicilio;
import ec.com.ib.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // recuperar el id que se envia desde el jsp de listarAlumnos
        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);

        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);

        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarAlumno(alumno);        // se almacena en una variable alumno para poder recuperar toda la información de ese alumno

        //request.setAttribute("alumno", alumno);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("alumno", alumno);

        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServicioAlumno servicioAlumno = new ServicioAlumno();

        String actualizar = request.getParameter("Actualizar");

        if (actualizar != null) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            Integer edad = Integer.parseInt(request.getParameter("edad"));

            String calle = request.getParameter("calle");
            String noCasa = request.getParameter("noCasa");
            String ciudad = request.getParameter("ciudad");

            String nombreContacto = request.getParameter("nombreContacto");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");

            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");   // se obtiene todos los datos de alumno mediante la sesión iniciada

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.setEdad(edad);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNoCasa(noCasa);
            alumno.getDomicilio().setCiudad(ciudad);
            alumno.getContacto().setNombreContacto(nombreContacto);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);

            servicioAlumno.guardarAlumno(alumno);

            sesion.removeAttribute("alumno");
        } else {
            // caso de eliminar
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            Alumno alumno = new Alumno(idAlumno);
            servicioAlumno.eliminarAlumno(alumno);
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

}
