package controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
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
    
    /* variables globales */
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;
    
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
    
    /**********************************  Validación del Formulario  ********************************************/
    private boolean validarDatos(){
        if(vista.getTxtNombre().getText().equals("") || vista.getTxtPrecio().getText().equals("") || vista.getTxtStock().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Los Campos no pueden ser vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    /*
        Método que realiza lo siguiente
        1. Cargando las variables globales
        2. Parseando valores (precio y stock)
        3. Estamos validando que precio y stock sean numéricos
    */
    private boolean cargarDatos(){
        try {
            nombre = vista.getTxtNombre().getText();
            precio = Double.parseDouble(vista.getTxtPrecio().getText());
            stock = Integer.parseInt(vista.getTxtStock().getText());
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error al Cargar los Datos desde el Formulario: " + e);
            return false;
        }
    }
    
    private void crearProducto(){
        try {
            if(validarDatos() == true && cargarDatos() == true){
                ProductoDTO producto = new ProductoDTO(nombre, precio, stock);
                productodao.agregarProducto(producto);
                JOptionPane.showMessageDialog(null, "Producto Registrado Exitosamente");
            }
        } catch (Exception e) {
            System.out.println("Error al crear un producto: " + e);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
