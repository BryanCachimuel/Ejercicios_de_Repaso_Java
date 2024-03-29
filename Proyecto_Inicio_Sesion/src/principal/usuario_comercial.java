/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexion.conexionbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class usuario_comercial extends javax.swing.JFrame {

    /**
     * Creates new form usuario_comercial
     */
    
     conexionbd conexion = conexionbd.getInstance();
    
    public usuario_comercial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Productos para el Usuario Comercial");
        mostrarTabla("");
    }
    
    private void mostrarTabla(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre Carnico");
        modelo.addColumn("Precio por Kg");
        modelo.addColumn("Precio por Lb");
        modelo.addColumn("Cantidad del Producto");
        modelo.addColumn("Procedencia");
        modelo.addColumn("Tipo de Carnico");
        
        tblTablaProductosCarnicos.setModel(modelo);
        
        Connection cn = conexion.conectarbd();
        String sql = "SELECT * FROM carnicos WHERE CONCAT(nombre_carnico,' ',precio_carnico_kilos) LIKE '%"+valor+"%'";
        String carnicos[] = new String[6];
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                carnicos[0] = rs.getString("nombre_carnico");
                carnicos[1] = rs.getString("precio_carnico_kilos");
                carnicos[2] = rs.getString("precio_carnico_libras");
                carnicos[3] = rs.getString("cantidad");
                carnicos[4] = rs.getString("procedencia");
                carnicos[5] = rs.getString("tipo_carnico");
                
                modelo.addRow(carnicos);
            }
            
            tblTablaProductosCarnicos.setModel(modelo);
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaProductosCarnicos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Bienvenido Usuario Comercial");

        tblTablaProductosCarnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTablaProductosCarnicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(usuario_comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario_comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario_comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario_comercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario_comercial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaProductosCarnicos;
    // End of variables declaration//GEN-END:variables
}
