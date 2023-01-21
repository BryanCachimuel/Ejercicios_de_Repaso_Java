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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == vista.btnListar){
           listar(vista.tabla);
       }
       if(e.getSource() == vista.btnGuardar){
           agregar();
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
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }
   
}
