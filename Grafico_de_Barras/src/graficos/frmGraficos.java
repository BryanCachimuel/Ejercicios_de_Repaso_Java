package graficos;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author Bryan
 */
public class frmGraficos extends javax.swing.JFrame {

    /**
     * Creates new form frmGraficos
     */
    
    boolean estado = false;
    
    public frmGraficos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Gáfico de Barras");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrimero = new javax.swing.JTextField();
        txtSegundo = new javax.swing.JTextField();
        txtTercero = new javax.swing.JTextField();
        btnGraficar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCuarto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Gráfico de Barras");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Digite el 1er Dato:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Digite el 2do Dato:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Digite el 3er Dato:");

        btnGraficar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jLabel5.setText("Digite el 4to Dato: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTercero, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtCuarto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txtPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTercero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnGraficar)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        estado = true;
        repaint();
    }//GEN-LAST:event_btnGraficarActionPerformed
    
    /* creamos el método para hallar el maximo promedio */
    public static int calcularMayorPromedio(int promedio_uno, int promedio_dos, int promedio_tres, int promedio_cuatro){
        if(promedio_uno > promedio_dos && promedio_uno > promedio_tres && promedio_uno > promedio_cuatro){
            return promedio_uno;
        }
        else if(promedio_dos > promedio_tres && promedio_dos > promedio_cuatro && promedio_dos > promedio_cuatro){
            return promedio_dos;
        }else if(promedio_tres > promedio_uno && promedio_tres > promedio_dos && promedio_tres > promedio_cuatro){
            return promedio_tres;
        }else{
            return promedio_cuatro;
        }
    }
    
    /* Creando método para gráficar */
    public void paint(Graphics grafico){
        super.paint(grafico);
        try {
            if(estado == true){
                String promedio1 = txtPrimero.getText();
                String promedio2 = txtSegundo.getText();
                String promedio3 = txtTercero.getText();
                String promedio4 = txtCuarto.getText();
                
                int valor_promedio1 = Integer.parseInt(promedio1);
                int valor_promedio2 = Integer.parseInt(promedio2);
                int valor_promedio3 = Integer.parseInt(promedio3);
                int valor_promedio4 = Integer.parseInt(promedio4);
                
                int mayor_valor = calcularMayorPromedio(valor_promedio1, valor_promedio2, valor_promedio3, valor_promedio4);
                
                int largo_promedio1 = valor_promedio1 * 400 / mayor_valor;
                int largo_promedio2 = valor_promedio2 * 400 / mayor_valor;
                int largo_promedio3 = valor_promedio3 * 400 / mayor_valor;
                int largo_promedio4 = valor_promedio4 * 400 / mayor_valor;
                
                /* Gráficamos el primer promedio */
                grafico.setColor(Color.yellow);
                grafico.fillRect(150, 350, largo_promedio1, 40);
                grafico.drawString("1er Promedio", 50, 360);
                
                /* Gráficamos el segundo promedio */
                grafico.setColor(Color.blue);
                grafico.fillRect(150, 410, largo_promedio2, 40);
                grafico.drawString("2do Promedio", 50, 420);
                
                /* Gráficamos el tercero promedio */
                grafico.setColor(Color.red);
                grafico.fillRect(150, 470, largo_promedio3, 40);
                grafico.drawString("3ro Promedio", 50, 480);
                
                /* Gráficamos el cuarto promedio */
                grafico.setColor(Color.green);
                grafico.fillRect(150, 530, largo_promedio4, 40);
                grafico.drawString("4to Promedio", 50, 540);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(frmGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGraficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCuarto;
    private javax.swing.JTextField txtPrimero;
    private javax.swing.JTextField txtSegundo;
    private javax.swing.JTextField txtTercero;
    // End of variables declaration//GEN-END:variables
}
