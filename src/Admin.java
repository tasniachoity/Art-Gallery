
import java.awt.Image;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Admin extends javax.swing.JFrame {

    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;

    public Admin() {
        initComponents();
        connect();
    }

//    public String path;
    private JFileChooser file;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private FileNameExtensionFilter filter;

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/artgallery", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgPath = new javax.swing.JTextField();
        btnartChoose = new javax.swing.JButton();
        btnAddArt = new javax.swing.JButton();
        btnAdminLogOut = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Arts");

        imgPath.setEditable(false);
        imgPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgPathActionPerformed(evt);
            }
        });

        btnartChoose.setBackground(new java.awt.Color(153, 153, 255));
        btnartChoose.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnartChoose.setForeground(new java.awt.Color(255, 255, 255));
        btnartChoose.setText("Choose");
        btnartChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnartChooseActionPerformed(evt);
            }
        });

        btnAddArt.setBackground(new java.awt.Color(153, 153, 255));
        btnAddArt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnAddArt.setForeground(new java.awt.Color(255, 255, 255));
        btnAddArt.setText("Add art");
        btnAddArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArtActionPerformed(evt);
            }
        });

        btnAdminLogOut.setBackground(new java.awt.Color(153, 153, 255));
        btnAdminLogOut.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnAdminLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminLogOut.setText("Log Out");
        btnAdminLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLogOutActionPerformed(evt);
            }
        });

        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imgPath, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAddArt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnartChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(btnAdminLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(182, 182, 182)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnartChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddArt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(189, 189, 189)
                        .addComponent(btnAdminLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnartChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnartChooseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG JPEG", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if (load == JFileChooser.APPROVE_OPTION) {
            f = fileChooser.getSelectedFile();

            path = f.getAbsolutePath();
            imgPath.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
            imgLabel.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnartChooseActionPerformed

    private void imgPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgPathActionPerformed

    private void btnAddArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArtActionPerformed
        // TODO add your handling code here:
        System.out.print("Image Path - " + path);
        System.out.print("Image name - " + f.getName());
        f = new File(path);

        try {
            InputStream is = new FileInputStream(f);

            pst = con.prepareStatement("INSERT INTO image(img_name, img_path, img_file) VALUES(?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);

            int inserted = pst.executeUpdate();
            if (inserted > 0) {
                JOptionPane.showMessageDialog(null, "Image Uploaded");
                imgPath.setText("");
                imgLabel.setIcon(null);
            }
        } catch (FileNotFoundException | SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddArtActionPerformed

    private void btnAdminLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLogOutActionPerformed
        // TODO add your handling code here:
        dispose();
        Home art = new Home();
        art.setVisible(true);
    }//GEN-LAST:event_btnAdminLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddArt;
    private javax.swing.JButton btnAdminLogOut;
    private javax.swing.JButton btnartChoose;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JTextField imgPath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
