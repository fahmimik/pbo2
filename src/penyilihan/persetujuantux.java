/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyilihan;

/**
 *
 * @author X
 */
public class persetujuantux extends javax.swing.JPanel {

    /**
     * Creates new form persetujuantux
     */
    public persetujuantux() {
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

        jLabel2 = new javax.swing.JLabel();
        namapeminjam1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        keg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        jLabel2.setText("NAMA PEMINJAM");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, -1));
        add(namapeminjam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 290, 40));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        jLabel3.setText("STATUS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 190, -1));
        add(keg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 290, 40));

        jLabel4.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        jLabel4.setText("KEGIATAN");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 190, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 270, 130));

        jLabel5.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        jLabel5.setText("BARANG");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 190, -1));

        jRadioButton1.setText("Setuju");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jRadioButton2.setText("Tidak Setuju");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jButton1.setText("Submit");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 480));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel keg;
    private javax.swing.JLabel namapeminjam1;
    // End of variables declaration//GEN-END:variables
}
