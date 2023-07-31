package controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
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
        agregarEventos();
        listarTabla();
    }
    
    private void agregarEventos(){
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);
        vista.getTblProductos().addMouseListener(new MouseAdapter() {     
            public void mouseClicked(MouseEvent e){
                llenarCampos(e);
            }
        });
    }
    
    private void listarTabla(){
        String[] titulos = new String[]{"Código", "Nombre", "Precio", "Stock"}; // encabezados de la tabla
        modeloTabla = new DefaultTableModel(titulos, 0);
        List<ProductoDTO> listarProductos = productodao.listarProductos();
        for (ProductoDTO iterarproducto : listarProductos) {
            modeloTabla.addRow(new Object[]{iterarproducto.getCodigo(),
                                            iterarproducto.getNombre(),
                                            iterarproducto.getPrecio(),
                                            iterarproducto.getStock()});
        }
        vista.getTblProductos().setModel(modeloTabla);
        vista.getTblProductos().setPreferredSize(new Dimension(350, modeloTabla.getRowCount() * 16));
    }
    
    private void llenarCampos(MouseEvent e){
        JTable target = (JTable) e.getSource();
        vista.getTxtNombre().setText(vista.getTblProductos().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTxtPrecio().setText(vista.getTblProductos().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        vista.getTxtStock().setText(vista.getTblProductos().getModel().getValueAt(target.getSelectedRow(), 3).toString());
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
