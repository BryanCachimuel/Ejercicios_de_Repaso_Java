package calculo_credito;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Bryan
 */
public class CreditoTotal extends javax.swing.JFrame {
     
    int precios[] = {1500,375,4000,650,410,1200,740,498};
    String imgs[] = {"smart.png","celular.png","moto.png","sala.jpg","comedor.png","computadora.png","refrigeradora.png","minicomponente.png"};
    double contado=0, credito=0, descuento=0, seguro=0, garantia=0, total=0, abono=0;
    int plazo=6, cantidad=1, index=0;
    double precio=0, aumento=1.07;
    
    public CreditoTotal() {
        initComponents();
        this.setTitle("Credit");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/credit.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(this);
        rad6.setSelected(true);
        calcularCredito();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbllogo = new javax.swing.JLabel();
        lblimagenes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        rad6 = new javax.swing.JRadioButton();
        rad12 = new javax.swing.JRadioButton();
        rad18 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        chkdescuento = new javax.swing.JCheckBox();
        chkseguro = new javax.swing.JCheckBox();
        chkgarantia = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtContado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSeguro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMensual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/credit.png"))); // NOI18N

        lblimagenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Costo");

        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Smart TV", "Celular Huawei", "Moto", "Sala ", "Comedor", "Computadora", "Refrigeradora", "Minicomponente" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("$ 500.00 USD");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Plazo a Meses");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad");

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        buttonGroup1.add(rad6);
        rad6.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        rad6.setText("6 meses");
        rad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rad12);
        rad12.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        rad12.setText("12 meses");
        rad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad12ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rad18);
        rad18.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        rad18.setText("18 meses");
        rad18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad18ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Adicionales");

        chkdescuento.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        chkdescuento.setText("5 % de Descuento(clientes fijos)");
        chkdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkdescuentoActionPerformed(evt);
            }
        });

        chkseguro.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        chkseguro.setText("Seguro por Daños");
        chkseguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkseguroActionPerformed(evt);
            }
        });

        chkgarantia.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        chkgarantia.setText("Garantía Extendida");
        chkgarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkgarantiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad6)
                            .addComponent(jLabel5)
                            .addComponent(rad12)
                            .addComponent(rad18)
                            .addComponent(jLabel7)
                            .addComponent(chkdescuento)
                            .addComponent(chkseguro)
                            .addComponent(chkgarantia))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(spnCantidad))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rad6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rad12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rad18)
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkdescuento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkseguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkgarantia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel8.setText("Precio Contado: ");

        txtContado.setEditable(false);
        txtContado.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtContado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtContado.setText("$ 00.00 USD");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel9.setText("Precio Credito: ");

        txtCredito.setEditable(false);
        txtCredito.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtCredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCredito.setText("$ 00.00 USD");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel10.setText("Descuento:");

        txtDescuento.setEditable(false);
        txtDescuento.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDescuento.setText("$ 00.00 USD");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel11.setText("Seguro por Daños:");

        txtSeguro.setEditable(false);
        txtSeguro.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtSeguro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSeguro.setText("$ 00.00 USD");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel12.setText("Garantía:");

        txtGarantia.setEditable(false);
        txtGarantia.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtGarantia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGarantia.setText("$ 00.00 USD");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel13.setText("Costo Total:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("$ 00.00 USD");

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel14.setText("Abono Mensual:");

        txtMensual.setEditable(false);
        txtMensual.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtMensual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMensual.setText("$ 00.00 USD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMensual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGarantia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeguro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCredito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtContado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblimagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblimagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        index = cboProducto.getSelectedIndex();
        calcularCredito();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        calcularCredito();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void rad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad6ActionPerformed
        aumento = rad6.isSelected() ? 1.07 : 1.00;
        plazo = 6;
        calcularCredito();
    }//GEN-LAST:event_rad6ActionPerformed

    private void rad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad12ActionPerformed
        aumento = rad12.isSelected() ? 1.10 : 1.00;
        plazo = 12;
        calcularCredito();
    }//GEN-LAST:event_rad12ActionPerformed

    private void rad18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad18ActionPerformed
        aumento = rad18.isSelected() ? 1.125 : 1.00;
        plazo = 18;
        calcularCredito();
    }//GEN-LAST:event_rad18ActionPerformed

    private void chkdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkdescuentoActionPerformed
        descuento = chkdescuento.isSelected() ? 0.05 : 0;
        calcularCredito();
    }//GEN-LAST:event_chkdescuentoActionPerformed

    private void chkseguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkseguroActionPerformed
        seguro = chkseguro.isSelected() ? 100 : 0;
        calcularCredito();
    }//GEN-LAST:event_chkseguroActionPerformed

    private void chkgarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkgarantiaActionPerformed
        garantia = chkgarantia.isSelected() ? 0.03 : 0;
        calcularCredito();
    }//GEN-LAST:event_chkgarantiaActionPerformed
    
    public String aMoneda(double precio){
        return "$ "+Math.round(precio*100.00)/100.00+" USD";
    }
    
    public void calcularCredito(){
        precio = precios[index];
        contado = precio * cantidad;
        lblPrecio.setText(aMoneda(contado));
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/"+imgs[index]));
        lblimagenes.setIcon(new ImageIcon(img.getScaledInstance(lblimagenes.getWidth(), lblimagenes.getHeight(), Image.SCALE_SMOOTH)));
        
        credito = contado * aumento;
        total = credito - (credito * descuento) + seguro + (credito * garantia);
        
        txtContado.setText(aMoneda(contado));
        txtCredito.setText(aMoneda(credito));
        txtDescuento.setText(aMoneda(credito*descuento));
        txtSeguro.setText(aMoneda(seguro));
        txtGarantia.setText(aMoneda(credito*garantia));
        txtTotal.setText(aMoneda(total));
        txtMensual.setText(aMoneda(total/plazo));
    }
  
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
            java.util.logging.Logger.getLogger(CreditoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditoTotal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JCheckBox chkdescuento;
    private javax.swing.JCheckBox chkgarantia;
    private javax.swing.JCheckBox chkseguro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblimagenes;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JRadioButton rad12;
    private javax.swing.JRadioButton rad18;
    private javax.swing.JRadioButton rad6;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtContado;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtMensual;
    private javax.swing.JTextField txtSeguro;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
