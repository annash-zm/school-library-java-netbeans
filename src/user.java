
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class user extends javax.swing.JDialog {

    DefaultTableModel tbl1 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form userinfo
     */
    public user(java.awt.Frame parent, boolean modal, String userName_) {
        super(parent, modal);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width / 2, screen.height / 2);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setUndecorated(true);
        
        initComponents();

        userlawas.setVisible(false);
        passlawas.setVisible(false);
        namalawas.setVisible(false);
        userName.setVisible(false);
        tampil();
        setUserName(userName_);
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
        header2 = new javax.swing.JPanel();
        close_btn2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama_lengkap = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        esbtn = new javax.swing.JPanel();
        edit_save = new javax.swing.JLabel();
        userlawas = new javax.swing.JLabel();
        namalawas = new javax.swing.JLabel();
        passlawas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_admin = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tambah_ = new javax.swing.JRadioButton();
        ubah_ = new javax.swing.JRadioButton();
        userName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        header2.setBackground(new java.awt.Color(0, 102, 153));
        header2.setPreferredSize(new java.awt.Dimension(718, 47));

        close_btn2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        close_btn2.setForeground(new java.awt.Color(255, 255, 255));
        close_btn2.setText("x");
        close_btn2.setToolTipText("Keluar?");
        close_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btn2MouseClicked(evt);
            }
        });
        close_btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                close_btn2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close_btn2)
        );

        jLabel1.setText("Username");

        jLabel4.setText("Password");

        jLabel2.setText("Nama Lengkap");

        esbtn.setBackground(new java.awt.Color(0, 102, 153));

        edit_save.setForeground(new java.awt.Color(255, 255, 255));
        edit_save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_save.setText("Tambah Admin");
        edit_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_saveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout esbtnLayout = new javax.swing.GroupLayout(esbtn);
        esbtn.setLayout(esbtnLayout);
        esbtnLayout.setHorizontalGroup(
            esbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        esbtnLayout.setVerticalGroup(
            esbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_save, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        tbl_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Nama Lengkap", "Password"
            }
        ));
        tbl_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_adminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_admin);

        jLabel3.setText("Data Admin");

        tambah_.setSelected(true);
        tambah_.setText("Tambah Admin");
        tambah_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambah_MouseClicked(evt);
            }
        });
        tambah_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_ActionPerformed(evt);
            }
        });

        ubah_.setText("Ubah Admin");
        ubah_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubah_ActionPerformed(evt);
            }
        });

        userName.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(userlawas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(esbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama_lengkap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tambah_)
                                        .addGap(14, 14, 14)
                                        .addComponent(ubah_))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addComponent(password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passlawas)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(344, 344, 344)
                    .addComponent(namalawas)
                    .addContainerGap(344, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(userName)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userlawas)
                    .addComponent(jLabel3)
                    .addComponent(tambah_)
                    .addComponent(ubah_))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(esbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(passlawas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_lengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(namalawas)
                    .addContainerGap(174, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(userName)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btn2MouseClicked
        // TODO add your handling code here:
        home n = new home(userName.getText());
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_close_btn2MouseClicked

    private void close_btn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_close_btn2KeyPressed
        // TODO add your handling code here:
        home n = new home(userName.getText());
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_close_btn2KeyPressed
    
    private static boolean empty(final String s) {
        return s == null || s.trim().isEmpty();
    }
    
    private void edit_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_saveMouseClicked
        // TODO add your handling code here:
        if (edit_save.getText().equals("Tambah Admin")) {
            String username_, nama_, password_;

            username_ = username.getText();
            nama_ = nama_lengkap.getText();
            password_ = password.getText();

            if (empty(username_) || empty(nama_) || empty(password_)) {
                JOptionPane.showMessageDialog(null, "Data yang Anda masukkan belum lengkap!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    Connection con = new database.connection().configDB();
                    String get = "SELECT * FROM admin WHERE username = '" + username_ + "' AND nama_lengkap = '" + nama_ + "'";
                    java.sql.Statement st = con.createStatement();
                    java.sql.ResultSet hasil = st.executeQuery(get);

                    if (hasil.next()) {
                        JOptionPane.showMessageDialog(null, "Data seperti ini sudah pernah Anda masukkan sebelumnya.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    } else {
                        try {
                            String sql = "INSERT INTO admin VALUES (null, ?, ?, ?)";
                            java.sql.PreparedStatement stat = (PreparedStatement) con.prepareStatement(sql);
                            stat.setString(1, username_);
                            stat.setString(2, nama_);
                            stat.setString(3, password_);
                            stat.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Data BERHASIL Ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                            tampil();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "GAGAL Menambahkan Data", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (edit_save.getText().equals("Ubah Admin")) {
            String pengguna = userlawas.getText();
            String sandi = passlawas.getText();

            String user = username.getText();
            String nama_ = nama_lengkap.getText();
            String pass = password.getText();

            try {
                Connection con = new database.connection().configDB();
                String sql = "UPDATE admin SET username = ?, nama_lengkap = ?, password = ? WHERE username = '" + pengguna + "' AND password = '" + sandi + "'";
                java.sql.PreparedStatement stat = con.prepareStatement(sql);
                stat.setString(1, user);
                stat.setString(2, nama_);
                stat.setString(3, pass);
                stat.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data login BERHASIL Diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data login GAGAL Diubah", "Kesalahan", JOptionPane.ERROR_MESSAGE);

                home n = new home(userName.getText());
                this.setVisible(false);
                n.setVisible(true);
            }
        }
    }//GEN-LAST:event_edit_saveMouseClicked

    private void tbl_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_adminMouseClicked
        // TODO add your handling code here:
        //clicktbl_murid();
        clickTabel();
    }//GEN-LAST:event_tbl_adminMouseClicked

    private void tambah_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambah_ActionPerformed

    private void ubah_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubah_ActionPerformed
        // TODO add your handling code here:
        int baris = tbl_admin.getSelectedRow();
        if (baris >= 0) {
            tambah_.setSelected(false);
            ubah_.setSelected(true);
            edit_save.setText("Ubah Admin");
            clickTabel();
        } else {
            ubah_.setSelected(false);
            JOptionPane.showMessageDialog(null, "Anda belum memilih data yang akan diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ubah_ActionPerformed

    private void tambah_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambah_MouseClicked
        // TODO add your handling code here:
        tambah_.setSelected(true);
        ubah_.setSelected(false);

        username.setText("");
        nama_lengkap.setText("");
        password.setText("");

        edit_save.setText("Tambah Admin");
    }//GEN-LAST:event_tambah_MouseClicked

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                user dialog = new user(new javax.swing.JFrame(), true, 0+"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void clickTabel() {
        int baris = tbl_admin.getSelectedRow();
        if (ubah_.isSelected()) {
            userlawas.setText((String) tbl1.getValueAt(baris, 0));
            namalawas.setText((String) tbl1.getValueAt(baris, 1));
            passlawas.setText((String) tbl1.getValueAt(baris, 2));

            username.setText((String) tbl1.getValueAt(baris, 0));
            nama_lengkap.setText((String) tbl1.getValueAt(baris, 1));
            password.setText((String) tbl1.getValueAt(baris, 2));
        }
    }
    
    public void setUserName(String username_){
        userName.setText(username_);
    }

    private void tampil() {
        Object[] baris = {"Username", "Nama Lengkap", "Password"};
        tbl1 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_admin.setModel(tbl1);
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM admin";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String username_ = hasil.getString("username");
                String nama_ = hasil.getString("nama_lengkap");
                String password_ = hasil.getString("password");

                String[] data = {username_, nama_, password_};
                tbl1.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan DATA!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_btn2;
    private javax.swing.JLabel edit_save;
    private javax.swing.JPanel esbtn;
    private javax.swing.JPanel header2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_lengkap;
    private javax.swing.JLabel namalawas;
    private javax.swing.JLabel passlawas;
    private javax.swing.JTextField password;
    private javax.swing.JRadioButton tambah_;
    private javax.swing.JTable tbl_admin;
    private javax.swing.JRadioButton ubah_;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userlawas;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
