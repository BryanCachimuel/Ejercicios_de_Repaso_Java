package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.ProductoDAO;
import modelo.ProductoDTO;
import vista.Inventario;

/**
 *
 * @author Bryan
 */
public class ControladorProducto implements ActionListener{

    ProductoDTO producto = new ProductoDTO();
    ProductoDAO productodao = new ProductoDAO();
    
    /* Instancia de la vista Inventario */
    Inventario vista = new Inventario();
    
    /* Para cargar los datos en la tabla de la vista */
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    /* constructor de la clase */
    public ControladorProducto(Inventario vistaInventario) {
        this.vista = vistaInventario;
        vista.setVisible(true);
    }
    
    private void agregarEventos(){
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
