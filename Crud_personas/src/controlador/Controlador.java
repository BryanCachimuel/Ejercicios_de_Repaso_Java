package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.PersonaDAO;
import vista.Vista;

/**
 *
 * @author Bryan
 */
public class Controlador implements ActionListener{
    
    /* Instanciado las clases de los paquetes modelo y vista */
    PersonaDAO dao = new PersonaDAO();
    Persona p = new Persona();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Controlador(Vista v){
        this.vista = v;
        this.vista.btnListar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnOk.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        listar(vista.tabla);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == vista.btnListar){
           limpiarTabla();
           listar(vista.tabla);
       }
       if(e.getSource() == vista.btnGuardar){
           agregar();
           limpiarTabla();
           listar(vista.tabla);
       }
       if(e.getSource() == vista.btnEditar){
           int fila = vista.tabla.getSelectedRow();
           if(fila == -1){
               JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
           }else{
               int id = Integer.parseInt((String)vista.tabla.getValueAt(fila, 0).toString());
               String nombres = (String)vista.tabla.getValueAt(fila, 1);
               String correo = (String)vista.tabla.getValueAt(fila, 2);
               String telefono = (String)vista.tabla.getValueAt(fila, 3);
               vista.txtId.setText(""+id);
               vista.txtnombres.setText(nombres);
               vista.txtcorreo.setText(correo);
               vista.txtTelefono.setText(telefono);
           }
       }
       if(e.getSource() == vista.btnOk){
           actualizar();
           limpiarTabla();
           listar(vista.tabla);
       }
       if(e.getSource() == vista.btnEliminar){
           eliminar();
           limpiarTabla();
           listar(vista.tabla);
       }
    }
    
    public void listar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Persona> lista = dao.listar();
        Object[]object = new Object[4];
        for(int i = 0; i < lista.size(); i++){
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombres();
            object[2] = lista.get(i).getCorreo();
            object[3] = lista.get(i).getTelefono(); 
            modelo.addRow(object);
        }
        vista.tabla.setModel(modelo);
    }
    
    public void agregar(){
        String nombre = vista.txtnombres.getText();
        String correo = vista.txtcorreo.getText();
        String telefono = vista.txtTelefono.getText();
        p.setNombres(nombre);
        p.setCorreo(correo);
        p.setTelefono(telefono);
        int respuesta = dao.agregar(p);
        if(respuesta == 1){
            JOptionPane.showMessageDialog(vista, "Usuario Agregado con Exito");
        }else{
            JOptionPane.showMessageDialog(vista, "Error no se puede agregar el registro");
        }
    }
    
    /*método para limpiar la tabla una vez se haya actualizado un registro*/
    public void limpiarTabla(){
        for(int i = 0; i < vista.tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    public void actualizar(){
        int id = Integer.parseInt(vista.txtId.getText());
        String nombre = vista.txtnombres.getText();
        String correo = vista.txtcorreo.getText();
        String telefono = vista.txtTelefono.getText();
        p.setId(id);
        p.setNombres(nombre);
        p.setCorreo(correo);
        p.setTelefono(telefono);
        int respuesta = dao.actualizar(p);
        if(respuesta == 1){
            JOptionPane.showMessageDialog(vista, "Usuario Actualizado con Exito");
        }else{
            JOptionPane.showMessageDialog(vista, "Error no se pudo actualizar el registro");
        }
        limpiarTabla();
    }
    
    public void eliminar(){
        int fila = vista.tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(vista, "Debe selecccionar un Usuario");
        }else{
            int id = Integer.parseInt((String)vista.tabla.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            JOptionPane.showMessageDialog(vista, "Usuario Eliminado");
        }
    }
   
}
