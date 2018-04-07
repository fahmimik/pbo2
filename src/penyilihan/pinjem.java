/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyilihan;
import java.awt.GridBagLayout;
/**
 *
 * @author Mik
 */
public class pinjem extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();

    peminjamx lay1;
    peminjamanx lay2;
    peralatanx lay3;
    cetakx lay4;
    
    public pinjem() {
        initComponents();
        setLocationRelativeTo(this);
        
        lay1 = new peminjamx();
        lay2 = new peminjamanx();
        lay3 = new peralatanx();
        lay4 = new cetakx();
        
        panelx.setLayout (layout);
        panelx.add(lay1);
        panelx.add(lay2);
        panelx.add(lay3);
        panelx.add(lay4);
        
        lay1.setVisible(false);
        lay2.setVisible(false);
        lay3.setVisible(false);
        lay4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peminjaman = new javax.swing.JButton();
        peralatan = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        peminjam1 = new javax.swing.JButton();
        panelx = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peminjaman.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        peminjaman.setText("Peminjaman");
        peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanActionPerformed(evt);
            }
        });
        getContentPane().add(peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 50));

        peralatan.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        peralatan.setText("Peralatan");
        peralatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peralatanActionPerformed(evt);
            }
        });
        getContentPane().add(peralatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 140, 50));

        cetak.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        cetak.setText("Cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        getContentPane().add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 140, 50));

        peminjam1.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        peminjam1.setText("Peminjam");
        peminjam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjam1ActionPerformed(evt);
            }
        });
        getContentPane().add(peminjam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 50));

        panelx.setBackground(new java.awt.Color(255, 153, 51));
        panelx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelxLayout = new javax.swing.GroupLayout(panelx);
        panelx.setLayout(panelxLayout);
        panelxLayout.setHorizontalGroup(
            panelxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        panelxLayout.setVerticalGroup(
            panelxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(panelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 910, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/JUDUL.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 900, 130));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
    lay1.setVisible(false);
    lay2.setVisible(false);
    lay3.setVisible(false);
    lay4.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_cetakActionPerformed

    private void peminjam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjam1ActionPerformed
    lay1.setVisible(true);
    lay2.setVisible(false);
    lay3.setVisible(false);
    lay4.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_peminjam1ActionPerformed

    private void peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanActionPerformed
    lay1.setVisible(false);
    lay2.setVisible(true);
    lay3.setVisible(false);
    lay4.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_peminjamanActionPerformed

    private void peralatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peralatanActionPerformed
    lay1.setVisible(false);
    lay2.setVisible(false);
    lay3.setVisible(true);
    lay4.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_peralatanActionPerformed

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
            java.util.logging.Logger.getLogger(pinjem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pinjem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pinjem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pinjem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pinjem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Panel panelx;
    private javax.swing.JButton peminjam1;
    private javax.swing.JButton peminjaman;
    private javax.swing.JButton peralatan;
    // End of variables declaration//GEN-END:variables
}
