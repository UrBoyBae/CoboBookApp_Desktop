/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipeminjaman;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form pengembalian
     */
    
    koneksi k = new koneksi();
    String insKDPinjam,insNama,insAlamat,insJbuku,insJml,insKembali,insTerima,Keterlambatan,dendaTelat,Status;
    String dateFormat = "yyyy-MM-dd";
    SimpleDateFormat date = new SimpleDateFormat(dateFormat);
    
    public pengembalian() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kdpinjam = new javax.swing.JTextField();
        namapinjam = new javax.swing.JTextField();
        judulbuku = new javax.swing.JTextField();
        alamatpinjam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jmlbuku = new javax.swing.JTextField();
        tglditerima = new com.toedter.calendar.JDateChooser();
        tglkembali = new com.toedter.calendar.JDateChooser();
        simpan = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        keterlambatan = new javax.swing.JTextField();
        denda = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        refresh = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(168, 69, 184));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cobo-Book");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        kdpinjam.setEditable(false);
        kdpinjam.setBackground(new java.awt.Color(235, 235, 235));
        kdpinjam.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        kdpinjam.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "KODE PINJAM ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N

        namapinjam.setEditable(false);
        namapinjam.setBackground(new java.awt.Color(235, 235, 235));
        namapinjam.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        namapinjam.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "NAMA PEMINJAM ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N

        judulbuku.setEditable(false);
        judulbuku.setBackground(new java.awt.Color(235, 235, 235));
        judulbuku.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        judulbuku.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "JUDUL BUKU ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N

        alamatpinjam.setEditable(false);
        alamatpinjam.setBackground(new java.awt.Color(235, 235, 235));
        alamatpinjam.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        alamatpinjam.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ALAMAT ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-removebg (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jmlbuku.setEditable(false);
        jmlbuku.setBackground(new java.awt.Color(235, 235, 235));
        jmlbuku.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jmlbuku.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "JUMLAH BUKU  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N
        jmlbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlbukuActionPerformed(evt);
            }
        });

        tglditerima.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "TANGGAL DITERIMA  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N

        tglkembali.setBackground(new java.awt.Color(255, 255, 255));
        tglkembali.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "TANGGAL KEMBALI  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N
        tglkembali.setEnabled(false);

        simpan.setBackground(new java.awt.Color(218, 172, 221));
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("SIMPAN");
        simpan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        simpan.setBorderPainted(false);
        simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMouseClicked(evt);
            }
        });
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        keterlambatan.setEditable(false);
        keterlambatan.setBackground(new java.awt.Color(235, 235, 235));
        keterlambatan.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        keterlambatan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "KETERLAMBATAN  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N

        denda.setEditable(false);
        denda.setBackground(new java.awt.Color(235, 235, 235));
        denda.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        denda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DENDA  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Status --", "Tepat Waktu", "Terlambat" }));

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh (2).png"))); // NOI18N
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        kembali.setBackground(new java.awt.Color(255, 255, 255));
        kembali.setText("BACK");
        kembali.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alamatpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kdpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(namapinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jmlbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(judulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tglditerima, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(keterlambatan, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kdpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namapinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alamatpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jmlbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglditerima, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(keterlambatan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanMouseClicked

    void create() {
        insTerima = String.valueOf(date.format(tglditerima.getDate()));
        insKembali = String.valueOf(date.format(tglkembali.getDate()));
        insKDPinjam = kdpinjam.getText();
        insNama = namapinjam.getText();
        insAlamat = alamatpinjam.getText();
        insJbuku = judulbuku.getText();
        insJml = jmlbuku.getText();
        Keterlambatan = keterlambatan.getText();
        dendaTelat = denda.getText();
        Status = String.valueOf(status.getSelectedItem());
        }

    protected void clearForm(){
        kdpinjam.setText("");
        namapinjam.setText("");
        alamatpinjam.setText("");
        judulbuku.setText("");
        jmlbuku.setText("");
        tglditerima.setCalendar(null);
        tglkembali.setCalendar(null);
        keterlambatan.setText("");
        denda.setText("");
        status.setSelectedItem("-- Status --");
    }
    
    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if ((kdpinjam.getText().isEmpty()) && (namapinjam.getText().isEmpty())&& (alamatpinjam.getText().isEmpty())
                && (judulbuku.getText().isEmpty()) && (jmlbuku.getText().isEmpty()) && ((tglditerima.getDate().toString()).isEmpty())
                && ((tglkembali.getDate().toString()).isEmpty()) && (keterlambatan.getText().isEmpty()) && (denda.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Isi Data Terlebih Dahulu", "info", JOptionPane.WARNING_MESSAGE);
        }
        else if ((kdpinjam.getText().isEmpty()) || (namapinjam.getText().isEmpty()) || (alamatpinjam.getText().isEmpty())
                || (judulbuku.getText().isEmpty()) || (jmlbuku.getText().isEmpty()) || ((tglditerima.getDate().toString()).isEmpty())
                || ((tglkembali.getDate().toString()).isEmpty()) || (keterlambatan.getText().isEmpty()) || (denda.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "lengkapi Data Terlebih Dahulu", "info", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                create();
                k.setDriver();
                k.query = "insert into pengembalian values(?,?,?,?,?,?,?,?,?,?)";
                k.CUD();
                k.ps.setString(1, insKDPinjam);
                k.ps.setString(2, insNama);
                k.ps.setString(3, insAlamat);
                k.ps.setString(4, insJbuku);
                k.ps.setString(5, insJml);
                k.ps.setString(6, insKembali);
                k.ps.setString(7, insTerima);
                k.ps.setString(8, Keterlambatan);
                k.ps.setString(9, dendaTelat);
                k.ps.setString(10, Status);
                k.ps.execute();
                JOptionPane.showMessageDialog(null, "Data Tersimpan","Info", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Tersimpan");
                System.out.println("Error" + ex);
            }

            clearForm();
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        kdpinjam.setText("");
        namapinjam.setText("");
        alamatpinjam.setText("");
        judulbuku.setText("");
        jmlbuku.setText("");
        tglditerima.setCalendar(null);
        tglkembali.setCalendar(null);
        keterlambatan.setText("");
        denda.setText("");
        status.setSelectedItem("-- Status --");
    }//GEN-LAST:event_clearActionPerformed

    private void jmlbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlbukuActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new datapeminjam2().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
        try {
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            // tanggal ke 1
            String tKembali = String.valueOf(date.format(tglkembali.getDate()));
            Date tglKembali = (Date) date.parse(tKembali);
            // tanggal ke 2
            String tTerima = String.valueOf(date.format(tglditerima.getDate()));
            Date tglTerima = (Date) date.parse(tTerima);
            // hitung keterlambatan
            long Telat = Math.abs(tglKembali.getTime() - tglTerima.getTime());
            keterlambatan.setText("" + TimeUnit.MILLISECONDS.toDays(Telat) + " Hari");
            // hitung denda
            long bayar = Math.abs (TimeUnit.MILLISECONDS.toDays(Telat) * 5000);
            denda.setText("Rp. " + bayar);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_refreshMouseClicked

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
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField alamatpinjam;
    private javax.swing.JButton clear;
    private javax.swing.JTextField denda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField jmlbuku;
    public static javax.swing.JTextField judulbuku;
    public static javax.swing.JTextField kdpinjam;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField keterlambatan;
    public static javax.swing.JTextField namapinjam;
    private javax.swing.JLabel refresh;
    private javax.swing.JButton simpan;
    private javax.swing.JComboBox<String> status;
    private com.toedter.calendar.JDateChooser tglditerima;
    public static com.toedter.calendar.JDateChooser tglkembali;
    // End of variables declaration//GEN-END:variables
}