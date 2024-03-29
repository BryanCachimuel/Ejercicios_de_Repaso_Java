package controladores;

import Modelo.Empleados;
import base_datos.conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class crud {
    conexion con = new conexion();
    Empleados emp = new Empleados();
    Statement st;
    ResultSet rs;
    
    public void insertar(String nombre, String apellido, String area, String puesto){
        try {
            Connection conexion = con.conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO empleados(nombre,apellido,area,puesto) VALUES('"+nombre+"','"+apellido+"','"+area+"','"+puesto+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El Registro no se ha Guardado: " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscar(String apellido){
        try {
            Connection conexion = con.conectar();
            st = conexion.createStatement();
            String sql = "SELECT * FROM empleados WHERE apellido='"+apellido+"';";
            rs = st.executeQuery(sql);
            if(rs.next()){
                emp.setIdempleado(rs.getString("idempleado"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setArea(rs.getString("area"));
                emp.setPuesto(rs.getString("puesto"));
                JOptionPane.showMessageDialog(null, "Registro Encontrado con Exito","Si hay Registro",JOptionPane.INFORMATION_MESSAGE);
            }else{
                emp.setIdempleado("");
                emp.setNombre("");
                emp.setApellido("");
                emp.setArea("");
                emp.setPuesto("");
                JOptionPane.showMessageDialog(null, "No se encontro el Registro buscado","Sin Registro",JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la sección de Busqueda: " + e, "Error Busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscarporId(String idempleado){
        try {
            Connection conexion = con.conectar();
            st = conexion.createStatement();
            String sql = "SELECT * FROM empleados WHERE idempleado='"+idempleado+"';";
            rs = st.executeQuery(sql);
            if(rs.next()){
                emp.setIdempleado(rs.getString("idempleado"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setArea(rs.getString("area"));
                emp.setPuesto(rs.getString("puesto"));
                JOptionPane.showMessageDialog(null, "Registro Encontrado con Exito","Si hay Registro",JOptionPane.INFORMATION_MESSAGE);
            }else{
                emp.setIdempleado("");
                emp.setNombre("");
                emp.setApellido("");
                emp.setArea("");
                emp.setPuesto("");
                JOptionPane.showMessageDialog(null, "No se encontro el Registro buscado","Sin Registro",JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close(); 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la sección de Busqueda: " + e, "Error Busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizar(String nombre, String apellido, String area, String puesto, String idempleado) {
        try {
            Connection conexion = con.conectar();
            st = conexion.createStatement();
            String sql = "UPDATE empleados SET nombre='"+nombre+"',apellido='"+apellido+"',area='"+area+"',puesto='"+puesto+"' WHERE idempleado='"+idempleado+"';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro Actualizado Exitosamente","Exito",JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la Actualización: "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminar(String idempleado){
        try {
            Connection conexion = con.conectar();
            st = conexion.createStatement();
            String sql = "DELETE FROM empleados WHERE idempleado='"+idempleado+"';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro Eliminado Correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la Eliminación: "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List listar(){
        List<Empleados> listaempleados = new ArrayList<>();  
        try {
           Connection conexion = con.conectar();
           st = conexion.createStatement();
           String sql = "SELECT * FROM empleados";
           rs = st.executeQuery(sql);
           while(rs.next()){
               Empleados empl = new Empleados();
               empl.setIdempleado(rs.getString(1));
               empl.setNombre(rs.getString(2));
               empl.setApellido(rs.getString(3));
               empl.setArea(rs.getString(4));
               empl.setPuesto(rs.getString(5));
               listaempleados.add(empl);
           }
           conexion.close();
           st.close();
           rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los empleados: "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return listaempleados;
    }
}
