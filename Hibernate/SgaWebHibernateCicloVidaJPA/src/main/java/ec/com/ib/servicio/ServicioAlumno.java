package ec.com.ib.servicio;

import ec.com.ib.dao.AlumnoDAO;
import ec.com.ib.domain.Alumno;
import java.util.List;

public class ServicioAlumno {
    
    private AlumnoDAO alumnoDao = new AlumnoDAO();
    
    public List<Alumno> listarAlumnos(){
        return alumnoDao.listar();
    }
    
    /* Método que servira tanto para guardar como modificar un alumno */
    public void guardarAlumno(Alumno alumno){
        if(alumno != null && alumno.getIdAlumno() == null){
            alumnoDao.insertar(alumno);
        }
        else{
            alumnoDao.actualizar(alumno);
        }
    }
    
    public void eliminarAlumno(Alumno alumno){
        alumnoDao.eliminar(alumno);
    }
    
    public Alumno encontrarAlumno(Alumno alumno){
        return alumnoDao.buscarPorId(alumno);
    }
}
