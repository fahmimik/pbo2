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
public class pengembalianx extends javax.swing.JPanel {

    /**
     * Creates new form pengembalianx
     */
    public pengembalianx() {
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

        haripeminjaman = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(910, 480));
        setPreferredSize(new java.awt.Dimension(910, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(haripeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 290, 40));

        jLabel6.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        jLabel6.setText("HARI PEMINJAMAN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 130, -1));

        jButton1.setText("Kembali");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 90, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 470, 100));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 480));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser haripeminjaman;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
