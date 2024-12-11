package ec.com.ib.test;

import ec.com.ib.dao.AlumnoDAO;
import ec.com.ib.dao.AsignacionDAO;
import ec.com.ib.dao.ContactoDAO;
import ec.com.ib.dao.CursoDAO;
import ec.com.ib.dao.DomicilioDAO;
import java.util.List;

public class TestDAOs {
    
    public static void main(String[] args) {
        
        /*AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumnos: ");
        imprimir(alumnoDao.listar());
        
        DomicilioDAO domicilioDao = new DomicilioDAO();
        System.out.println("Domicilio: ");
        imprimir(domicilioDao.listar());
        
        CursoDAO cursoDao = new CursoDAO();
        System.out.println("Curso: ");
        imprimir(cursoDao.listar());
        
        ContactoDAO contactoDao = new ContactoDAO();
        System.out.println("Contacto: ");
        imprimir(contactoDao.listar());*/
        
        AsignacionDAO asignacionDao = new AsignacionDAO();
        System.out.println("Contacto: ");
        imprimir(asignacionDao.listar());
        
        
    }
    
    private static void imprimir(List coleccion){
        for(Object o : coleccion){
            System.out.println("Valor: " + o);
        }
    }
    
}
