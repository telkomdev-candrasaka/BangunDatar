package bangun_datar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author ACER E15
 */
public class Segi_Tiga extends javax.swing.JFrame {
    double alas, tinggi, sisi1, sisi2, sisi3, luas, keliling;
    /**
     * Creates new form Segi_Tiga
     */
    public Segi_Tiga() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        LJududl = new javax.swing.JLabel();
        LAlas = new javax.swing.JLabel();
        LTinggi = new javax.swing.JLabel();
        LKeliling = new javax.swing.JLabel();
        LLuas = new javax.swing.JLabel();
        hapus1 = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        TfLuas = new javax.swing.JTextField();
        TfKeliling = new javax.swing.JTextField();
        TfTinggi = new javax.swing.JTextField();
        TfAlas = new javax.swing.JTextField();
        Hitung1 = new javax.swing.JButton();
        LSisi1 = new javax.swing.JLabel();
        TfSisi1 = new javax.swing.JTextField();
        LSisi2 = new javax.swing.JLabel();
        TfSisi2 = new javax.swing.JTextField();
        LSisi3 = new javax.swing.JLabel();
        TfSisi3 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LJududl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LJududl.setText("SEGITIGA");

        LAlas.setText("ALAS         :");
        LAlas.setToolTipText("");
        LAlas.setFocusable(false);
        LAlas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LTinggi.setText("TINGGI       :");
        LTinggi.setToolTipText("");
        LTinggi.setFocusable(false);
        LTinggi.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        LKeliling.setText(" KELILING      :");

        LLuas.setText(" LUAS            :");

        hapus1.setText("HAPUS");
        hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus1ActionPerformed(evt);
            }
        });

        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        TfKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfKelilingActionPerformed(evt);
            }
        });

        TfTinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfTinggiActionPerformed(evt);
            }
        });

        TfAlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfAlasActionPerformed(evt);
            }
        });

        Hitung1.setText("HITUNG");
        Hitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung1ActionPerformed(evt);
            }
        });

        LSisi1.setText("SISI 1       :");
        LSisi1.setToolTipText("");
        LSisi1.setFocusable(false);
        LSisi1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TfSisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfSisi1ActionPerformed(evt);
            }
        });

        LSisi2.setText("SISI 2        :");
        LSisi2.setToolTipText("");
        LSisi2.setFocusable(false);
        LSisi2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TfSisi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfSisi2ActionPerformed(evt);
            }
        });

        LSisi3.setText("ALAS");
        LSisi3.setToolTipText("");
        LSisi3.setFocusable(false);
        LSisi3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TfSisi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfSisi3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(68, Short.MAX_VALUE)
                        .addComponent(hapus1)
                        .addGap(42, 42, 42)
                        .addComponent(keluar)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LLuas, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(LKeliling, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TfKeliling)
                                    .addComponent(TfLuas)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(LJududl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(LSisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LSisi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LSisi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LTinggi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LAlas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TfAlas, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(TfSisi1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(TfTinggi, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(TfSisi2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(TfSisi3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(Hitung1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LJududl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LAlas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfAlas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfTinggi))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfSisi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfSisi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSisi3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfSisi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Hitung1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus1)
                    .addComponent(keluar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus1ActionPerformed
        // TODO add your handling code here:
        TfAlas.setText(String.valueOf(" "));
        TfSisi1.setText(String.valueOf(" "));
        TfSisi2.setText(String.valueOf(" "));
        TfSisi3.setText(String.valueOf(" "));
        TfTinggi.setText(String.valueOf(" "));
        TfKeliling.setText(String.valueOf(" "));
        TfLuas.setText(String.valueOf(" "));
    }//GEN-LAST:event_hapus1ActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
       BangunDatar formBangunDatar=new BangunDatar();
        formBangunDatar.show();
        this.hide();
    }//GEN-LAST:event_keluarActionPerformed

    private void TfKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfKelilingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfKelilingActionPerformed

    private void TfTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfTinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfTinggiActionPerformed

    private void TfAlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfAlasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfAlasActionPerformed

    private void Hitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung1ActionPerformed
        // TODO add your handling code here:
        alas = Double.parseDouble(TfAlas.getText());
        tinggi = Double.parseDouble(TfTinggi.getText());
        sisi1 = Double.parseDouble(TfSisi1.getText());
        sisi2 = Double.parseDouble(TfSisi2.getText());
        sisi3 = Double.parseDouble(TfSisi3.getText());
        luas = alas*tinggi/2;
        TfLuas.setText(String.valueOf(luas));
        keliling = sisi1+sisi2+sisi3;
        TfKeliling.setText(String.valueOf(keliling));
    }//GEN-LAST:event_Hitung1ActionPerformed

    private void TfSisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfSisi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfSisi1ActionPerformed

    private void TfSisi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfSisi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfSisi2ActionPerformed

    private void TfSisi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfSisi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfSisi3ActionPerformed

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
            java.util.logging.Logger.getLogger(Segi_Tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Segi_Tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Segi_Tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Segi_Tiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segi_Tiga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung1;
    private javax.swing.JLabel LAlas;
    private javax.swing.JLabel LJududl;
    private javax.swing.JLabel LKeliling;
    private javax.swing.JLabel LLuas;
    private javax.swing.JLabel LSisi1;
    private javax.swing.JLabel LSisi2;
    private javax.swing.JLabel LSisi3;
    private javax.swing.JLabel LTinggi;
    private javax.swing.JTextField TfAlas;
    private javax.swing.JTextField TfKeliling;
    private javax.swing.JTextField TfLuas;
    private javax.swing.JTextField TfSisi1;
    private javax.swing.JTextField TfSisi2;
    private javax.swing.JTextField TfSisi3;
    private javax.swing.JTextField TfTinggi;
    private javax.swing.JButton hapus1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton keluar;
    // End of variables declaration//GEN-END:variables
}
