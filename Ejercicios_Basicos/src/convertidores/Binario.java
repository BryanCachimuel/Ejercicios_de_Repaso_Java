package convertidores;

public class Binario extends javax.swing.JFrame {

   int binario[] = new int[11];
    
    public Binario() {
        initComponents();
        this.setTitle("Binario a Decimal con Jtogglebutton");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbtnnueve = new javax.swing.JToggleButton();
        tbtnonce = new javax.swing.JToggleButton();
        tbtndiez = new javax.swing.JToggleButton();
        tbtnocho = new javax.swing.JToggleButton();
        tbtnsiete = new javax.swing.JToggleButton();
        tbtncinco = new javax.swing.JToggleButton();
        tbtnseis = new javax.swing.JToggleButton();
        tbtncuatro = new javax.swing.JToggleButton();
        tbtntres = new javax.swing.JToggleButton();
        tbtndos = new javax.swing.JToggleButton();
        tbtnuno = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblDecimal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel1.setText("256");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel2.setText("1024");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel3.setText("4");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel4.setText("512");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel5.setText("128");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel6.setText("64");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel7.setText("32");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel8.setText("16");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel9.setText("8");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel10.setText("1");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        jLabel11.setText("2");

        tbtnnueve.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtnnueve.setText("0");
        tbtnnueve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtnnueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnnueveActionPerformed(evt);
            }
        });

        tbtnonce.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtnonce.setText("0");
        tbtnonce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtnonce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnonceActionPerformed(evt);
            }
        });

        tbtndiez.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtndiez.setText("0");
        tbtndiez.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtndiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtndiezActionPerformed(evt);
            }
        });

        tbtnocho.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtnocho.setText("0");
        tbtnocho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtnocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnochoActionPerformed(evt);
            }
        });

        tbtnsiete.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtnsiete.setText("0");
        tbtnsiete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtnsiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnsieteActionPerformed(evt);
            }
        });

        tbtncinco.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtncinco.setText("0");
        tbtncinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtncinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtncincoActionPerformed(evt);
            }
        });

        tbtnseis.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtnseis.setText("0");
        tbtnseis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtnseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnseisActionPerformed(evt);
            }
        });

        tbtncuatro.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtncuatro.setText("0");
        tbtncuatro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtncuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtncuatroActionPerformed(evt);
            }
        });

        tbtntres.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtntres.setText("0");
        tbtntres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtntresActionPerformed(evt);
            }
        });

        tbtndos.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtndos.setText("0");
        tbtndos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtndos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtndosActionPerformed(evt);
            }
        });

        tbtnuno.setFont(new java.awt.Font("sansserif", 1, 26)); // NOI18N
        tbtnuno.setText("0");
        tbtnuno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtnuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnunoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel13.setText("BINARIO");

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel14.setText("DECIMAL");

        lblDecimal.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lblDecimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDecimal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbtnonce, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tbtndiez, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tbtnnueve, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tbtnocho, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tbtnsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtnseis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtncinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tbtncuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tbtntres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tbtndos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tbtnuno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(408, 408, 408)
                    .addComponent(jLabel13)
                    .addContainerGap(446, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(420, 420, 420)
                    .addComponent(jLabel14)
                    .addContainerGap(422, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnnueve, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnonce, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtndiez, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnocho, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnseis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtncinco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtncuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtntres, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtndos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnuno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(lblDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel13)
                    .addContainerGap(404, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(261, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(187, 187, 187)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnunoActionPerformed
        binario[0] = tbtnuno.isSelected() ? 1 : 0;
        tbtnuno.setText(""+binario[0]);
        calcularDecimal();
    }//GEN-LAST:event_tbtnunoActionPerformed

    private void tbtndosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtndosActionPerformed
        binario[1] = tbtndos.isSelected() ? 1 : 0;
        tbtnuno.setText(""+binario[1]);
        calcularDecimal();
    }//GEN-LAST:event_tbtndosActionPerformed

    private void tbtntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtntresActionPerformed
        binario[2] = tbtntres.isSelected() ? 1 : 0;
        tbtntres.setText(""+binario[2]);
        calcularDecimal();
    }//GEN-LAST:event_tbtntresActionPerformed

    private void tbtncuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtncuatroActionPerformed
        binario[3] = tbtncuatro.isSelected() ? 1 : 0;
        tbtncuatro.setText(""+binario[3]);
        calcularDecimal();
    }//GEN-LAST:event_tbtncuatroActionPerformed

    private void tbtncincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtncincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtncincoActionPerformed

    private void tbtnseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnseisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnseisActionPerformed

    private void tbtnsieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnsieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnsieteActionPerformed

    private void tbtnochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnochoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnochoActionPerformed

    private void tbtnnueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnnueveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnnueveActionPerformed

    private void tbtndiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtndiezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtndiezActionPerformed

    private void tbtnonceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnonceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnonceActionPerformed
    
    public void calcularDecimal(){
        
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
            java.util.logging.Logger.getLogger(Binario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(Binario.class.getName()).ltbtnunogging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Binario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Binario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Binario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDecimal;
    private javax.swing.JToggleButton tbtncinco;
    private javax.swing.JToggleButton tbtncuatro;
    private javax.swing.JToggleButton tbtndiez;
    private javax.swing.JToggleButton tbtndos;
    private javax.swing.JToggleButton tbtnnueve;
    private javax.swing.JToggleButton tbtnocho;
    private javax.swing.JToggleButton tbtnonce;
    private javax.swing.JToggleButton tbtnseis;
    private javax.swing.JToggleButton tbtnsiete;
    private javax.swing.JToggleButton tbtntres;
    private javax.swing.JToggleButton tbtnuno;
    // End of variables declaration//GEN-END:variables
}
