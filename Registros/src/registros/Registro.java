package registros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Registro extends javax.swing.JFrame {

    Conexion conectarbdd = Conexion.getInstance();
    
    public Registro() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Empleados");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxProfesion = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInformacionEmpleados = new javax.swing.JTextArea();
        btnConsultarEmpleados = new javax.swing.JButton();
        btnValidadBDD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese su Nombre:");

        jLabel2.setText("Registro de Empleados");

        jLabel3.setText("Ingrese su Teléfono:");

        jLabel4.setText("Ingrese su Profesión:");

        cbxProfesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniero en Sistemas Computacionales", "Ingeniero en Mecatrónica", "Ingeniero en Telecomunicaciones", "Ingeniero en Electricidad" }));

        btnRegistrar.setText("Registrar Empleado");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar Empleado");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txaInformacionEmpleados.setColumns(20);
        txaInformacionEmpleados.setRows(5);
        jScrollPane1.setViewportView(txaInformacionEmpleados);

        btnConsultarEmpleados.setText("Consultar Empleados");
        btnConsultarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEmpleadosActionPerformed(evt);
            }
        });

        btnValidadBDD.setText("Validar Informacion en BDD");
        btnValidadBDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidadBDDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnValidadBDD))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbxProfesion, 0, 1, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                .addComponent(txtTelefono))))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarEmpleados)
                    .addComponent(btnValidadBDD))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
           Connection conexion = conectarbdd.conectar();
           String sql = "INSERT INTO empleados VALUES(?,?,?,?)";
           PreparedStatement insertar = conexion.prepareStatement(sql);
           insertar.setString(1, "0");
           insertar.setString(2, txtNombre.getText().trim());
           insertar.setString(3, txtTelefono.getText().trim());
           insertar.setString(4, cbxProfesion.getSelectedItem().toString());
           insertar.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Se Registro al Empleado con exito!");
           conectarbdd.cerrarConexion();
           
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        txtNombre.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnValidadBDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidadBDDActionPerformed
        try {
           Connection conexion = conectarbdd.conectar();
           String sql = "SELECT * FROM empleados";
           // sirve para poder insertar, actualizar, eliminar o listar información hacia la bdd
           PreparedStatement seleccionar = conexion.prepareStatement(sql);
           
           // consultamos a la base de datos
            ResultSet consulta = seleccionar.executeQuery();
            
            // validamos si en la bdd tiene datos
            if(consulta.next()){
                JOptionPane.showMessageDialog(null, "La Base de Datos si tiene Información");
            }else{
                JOptionPane.showMessageDialog(null, "No existe Información en la Base de Datos");
            } 
            // cerramos la conexión hacia la bdd
            conectarbdd.cerrarConexion();
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }//GEN-LAST:event_btnValidadBDDActionPerformed

    private void btnConsultarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEmpleadosActionPerformed
        
        // controlar que cuando se vuelva ingresar un nuevo empleado la lista se actualize sin repetir la lista una y otra vez
        txaInformacionEmpleados.setText("");
        
        try {
           Connection conexion = conectarbdd.conectar();
           String sql = "SELECT * FROM empleados";
           PreparedStatement seleccionar = conexion.prepareStatement(sql);
           ResultSet consulta = seleccionar.executeQuery();
           
           while(consulta.next()){
               txaInformacionEmpleados.append(consulta.getString(1)); // le decimos que con append nos traiga el elemento 1 de la bdd
               txaInformacionEmpleados.append("   ");
               txaInformacionEmpleados.append(consulta.getString(2));
               txaInformacionEmpleados.append("   ");
               txaInformacionEmpleados.append(consulta.getString(3));
               txaInformacionEmpleados.append("   ");
               txaInformacionEmpleados.append(consulta.getString(4));
               txaInformacionEmpleados.append("\n");
           }
           
           conectarbdd.cerrarConexion(); 
           
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }//GEN-LAST:event_btnConsultarEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultarEmpleados;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnValidadBDD;
    private javax.swing.JComboBox<String> cbxProfesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaInformacionEmpleados;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
