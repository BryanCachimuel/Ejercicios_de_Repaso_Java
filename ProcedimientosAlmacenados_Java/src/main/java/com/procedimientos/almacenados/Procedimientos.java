/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.procedimientos.almacenados;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Procedimientos extends javax.swing.JFrame {

    /**
     * Creates new form Procedimientos
     */
    
    Conexion instanciaMysql = Conexion.getInstance();
    
    public Procedimientos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Procedimientos Almacenados");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnListarAlumnos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        txtLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtParalelo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnListarAlumnosB = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnParaleloA = new javax.swing.JButton();
        btnParaleloB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnListarAlumnos.setText("Listar Alumnos del A");
        btnListarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAlumnosActionPerformed(evt);
            }
        });

        txaLista.setColumns(20);
        txaLista.setRows(5);
        jScrollPane1.setViewportView(txaLista);

        txtLimpiar.setText("Limpiar Área");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese su Nombre:");

        jLabel2.setText("Ingrese su Apellido:");

        jLabel3.setText("Ingrese su Edad:");

        jLabel4.setText("Ingrese su Paralelo:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnListarAlumnosB.setText("Listar Alumnos del B");
        btnListarAlumnosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAlumnosBActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("Código del Alumno:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("DATOS DE ALUMNOS");

        btnParaleloA.setText("Edades Alumnos Paralelo A");
        btnParaleloA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaleloAActionPerformed(evt);
            }
        });

        btnParaleloB.setText("Edades Alumnos Paralelo B");
        btnParaleloB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaleloBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtParalelo)
                                                .addComponent(txtApellido)
                                                .addComponent(txtEdad))))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnListarAlumnosB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnListarAlumnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnParaleloA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnParaleloB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel6)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnListarAlumnos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnListarAlumnosB))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimpiar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParaleloA)
                    .addComponent(btnParaleloB))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAlumnosActionPerformed
        try {
            Connection conexion = instanciaMysql.conectar();
            CallableStatement procedimientoAlmacenado = conexion.prepareCall("{call listarAlumnosDelA}");
            ResultSet consulta = procedimientoAlmacenado.executeQuery();
            
            while(consulta.next()){
                txaLista.append((consulta.getInt(1) + " "));
                txaLista.append((consulta.getString(2) + " "));
                txaLista.append((consulta.getString(3) + " "));
                txaLista.append((consulta.getInt(4) + " "));
                txaLista.append((consulta.getString(5) + " "));
                txaLista.append("\n");
            }
            
            procedimientoAlmacenado.close();
            instanciaMysql.desconectar(conexion);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnListarAlumnosActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        txaLista.setText("");
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            Connection conexion = instanciaMysql.conectar();
            CallableStatement procedimientoAlmacenadoInsertar = conexion.prepareCall("{call insertarAlumno(?,?,?,?)}");
            
            procedimientoAlmacenadoInsertar.setString(1, txtNombre.getText());
            procedimientoAlmacenadoInsertar.setString(2, txtApellido.getText());
            procedimientoAlmacenadoInsertar.setInt(3, Integer.parseInt(txtEdad.getText()));
            procedimientoAlmacenadoInsertar.setString(4, txtParalelo.getText());
            procedimientoAlmacenadoInsertar.executeUpdate();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Alumno Registrado con exito");
            
            procedimientoAlmacenadoInsertar.close();
            instanciaMysql.desconectar(conexion);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnListarAlumnosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAlumnosBActionPerformed
        try {
            Connection conexion = instanciaMysql.conectar();
            CallableStatement procedimientoAlmacenado = conexion.prepareCall("{call listarAlumnosDelB}");
            ResultSet consulta = procedimientoAlmacenado.executeQuery();
            
            while(consulta.next()){
                txaLista.append((consulta.getInt(1) + " "));
                txaLista.append((consulta.getString(2) + " "));
                txaLista.append((consulta.getString(3) + " "));
                txaLista.append((consulta.getInt(4) + " "));
                txaLista.append((consulta.getString(5) + " "));
                txaLista.append("\n");
            }
            
            procedimientoAlmacenado.close();
            instanciaMysql.desconectar(conexion);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnListarAlumnosBActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection conexion = instanciaMysql.conectar();
            CallableStatement procedimientoAlmacenadoEliminar = conexion.prepareCall("{call eliminarAlumno(?)}");
            
            procedimientoAlmacenadoEliminar.setInt(1, Integer.parseInt(txtId.getText()));
            procedimientoAlmacenadoEliminar.executeUpdate();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Alumno Eliminado satisfactoriamente");
            
            procedimientoAlmacenadoEliminar.close();
            instanciaMysql.desconectar(conexion);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            Connection conexion = instanciaMysql.conectar();
            CallableStatement procedimientoAlmacenadoActualizar = conexion.prepareCall("call actualizarAlumno(?,?,?,?,?)");
            
            procedimientoAlmacenadoActualizar.setString(1, txtNombre.getText());
            procedimientoAlmacenadoActualizar.setString(2, txtApellido.getText());
            procedimientoAlmacenadoActualizar.setInt(3, Integer.parseInt(txtEdad.getText()));
            procedimientoAlmacenadoActualizar.setString(4, txtParalelo.getText());
            procedimientoAlmacenadoActualizar.setInt(5, Integer.parseInt(txtId.getText()));
            procedimientoAlmacenadoActualizar.executeUpdate();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Datos del Alumno Actualizados exitosamente");
            
            procedimientoAlmacenadoActualizar.close();
            instanciaMysql.desconectar(conexion);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnParaleloAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaleloAActionPerformed
        try {
           Connection conexion = instanciaMysql.conectar();
           CallableStatement procedimientoAlmacenadoEdadesA = conexion.prepareCall("{call edadesAlumnosA}");
           ResultSet consulta = procedimientoAlmacenadoEdadesA.executeQuery();
           
           while(consulta.next()){
               txaLista.append((consulta.getInt(1) + " "));
               txaLista.append((consulta.getString(2) + " "));
               txaLista.append((consulta.getString(3) + " "));
               txaLista.append((consulta.getInt(4) + " "));
               txaLista.append((consulta.getString(5) + " "));
               txaLista.append("\n");
           }
           
           JOptionPane.showMessageDialog(null, "Lista de los Estudiantes Mayores o Iguales a 28 años del Paralelo A");
           procedimientoAlmacenadoEdadesA.close();
           instanciaMysql.desconectar(conexion);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnParaleloAActionPerformed

    private void btnParaleloBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaleloBActionPerformed
        try {
           Connection conexion = instanciaMysql.conectar();
           CallableStatement procedimientoAlmacenadoEdadesB = conexion.prepareCall("{call edadesAlumnosB}");
           ResultSet consulta = procedimientoAlmacenadoEdadesB.executeQuery();
           
           while(consulta.next()){
               txaLista.append((consulta.getInt(1) + " "));
               txaLista.append((consulta.getString(2) + " "));
               txaLista.append((consulta.getString(3) + " "));
               txaLista.append((consulta.getInt(4) + " "));
               txaLista.append((consulta.getString(5) + " "));
               txaLista.append("\n");
           }
           JOptionPane.showMessageDialog(null, "Lista de los Estudiantes Mayores o Iguales a 28 años del Paralelo B");
           procedimientoAlmacenadoEdadesB.close();
           instanciaMysql.desconectar(conexion);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnParaleloBActionPerformed
    
    public void limpiarCampos(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtParalelo.setText("");
        txtId.setText("");
        txaLista.setText("");
    }
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
            java.util.logging.Logger.getLogger(Procedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procedimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListarAlumnos;
    private javax.swing.JButton btnListarAlumnosB;
    private javax.swing.JButton btnParaleloA;
    private javax.swing.JButton btnParaleloB;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtParalelo;
    // End of variables declaration//GEN-END:variables
}
