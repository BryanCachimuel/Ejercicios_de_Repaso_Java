package vistas;

/**
 *
 * @author Bryan
 */
public class arranque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmEmpresa empresa = new frmEmpresa();
        empresa.setVisible(true);
        empresa.setLocationRelativeTo(null);
        empresa.setTitle("Empresa");
    }
    
}
