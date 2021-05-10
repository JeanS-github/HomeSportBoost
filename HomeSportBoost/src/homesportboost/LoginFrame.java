/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homesportboost;

import static homesportboost.HomeSportBoost.map;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Aude
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Go = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        caseUserName = new javax.swing.JTextField();
        caseMDP = new javax.swing.JPasswordField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Connexion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 350, 70));

        Go.setBackground(new java.awt.Color(0, 102, 102));
        Go.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        Go.setForeground(new java.awt.Color(255, 255, 255));
        Go.setText("Go");
        Go.setBorder(null);
        Go.setOpaque(false);
        Go.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoMouseClicked(evt);
            }
        });
        jPanel1.add(Go, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 90, 50));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Je n'ai pas de compte");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 230, -1));

        caseUserName.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        caseUserName.setForeground(new java.awt.Color(255, 255, 255));
        caseUserName.setText("Nom d'utilisateur");
        caseUserName.setBorder(null);
        caseUserName.setOpaque(false);
        caseUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caseUserNameFocusGained(evt);
            }
        });
        caseUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseUserNameActionPerformed(evt);
            }
        });
        caseUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caseUserNameKeyPressed(evt);
            }
        });
        jPanel1.add(caseUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 310, -1));

        caseMDP.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        caseMDP.setForeground(new java.awt.Color(255, 255, 255));
        caseMDP.setText("Mot de passe");
        caseMDP.setBorder(null);
        caseMDP.setOpaque(false);
        caseMDP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caseMDPFocusGained(evt);
            }
        });
        caseMDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseMDPActionPerformed(evt);
            }
        });
        caseMDP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caseMDPKeyPressed(evt);
            }
        });
        jPanel1.add(caseMDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 280, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homesportboost/fondLoginBleu.png"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caseMDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseMDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseMDPActionPerformed

    private void caseUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caseUserNameFocusGained
        caseUserName.setText("");
    }//GEN-LAST:event_caseUserNameFocusGained

    private void caseMDPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caseMDPFocusGained
        caseMDP.setText("");
    }//GEN-LAST:event_caseMDPFocusGained

    private void GoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoMouseClicked
        String username = caseUserName.getText();           // recupere le nom de l'user
        String password = caseMDP.getText();     // recupere le mot de passe
        LoginFrame lg = new LoginFrame();   // to display error message
        
        // verifie que l'user et le mdp existent et correspondent bien
        if (!Controller.isUserValid(username)) {
            // JOptionPane.showMessageDialog(null, "Username: "+username+" does not exist!");
            JOptionPane.showMessageDialog(lg,"Il n'existe pas de "+username+" ici !","ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!Controller.matchPassword(password,map.get(username))) {
            // JOptionPane.showMessageDialog(null, "Password does not match!");
            JOptionPane.showMessageDialog(lg,"Le nom d'utilisateur ou le mot de passe est incorrect","ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            // ouverture de la fenetre accueil
            dispose();
            new Accueil2Frame(username).setVisible(true);
        }
    }//GEN-LAST:event_GoMouseClicked

    private void caseUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caseUserNameKeyPressed
        //Quand on clique sur entrer depuis le nom d'utilisateur
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String username = caseUserName.getText();           // recupere le nom de l'user
        String password = caseMDP.getText();     // recupere le mot de passe
        LoginFrame lg = new LoginFrame();   // to display error message
        
        // verifie que l'user et le mdp existent et correspondent bien
        if (!Controller.isUserValid(username)) {
            // JOptionPane.showMessageDialog(null, "Username: "+username+" does not exist!");
            JOptionPane.showMessageDialog(lg,"Il n'existe pas de "+username+" ici !","ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!Controller.matchPassword(password,map.get(username))) {
            // JOptionPane.showMessageDialog(null, "Password does not match!");
            JOptionPane.showMessageDialog(lg,"Le nom d'utilisateur ou le mot de passe est incorrect","ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            // ouverture de la fenetre accueil
            dispose();
            new Accueil2Frame(username).setVisible(true);
        }
        }
    }//GEN-LAST:event_caseUserNameKeyPressed

    private void caseMDPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caseMDPKeyPressed
        //Quand on clique sur entrer depuis le password
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String username = caseUserName.getText();           // recupere le nom de l'user
        String password = caseMDP.getText();     // recupere le mot de passe
        LoginFrame lg = new LoginFrame();   // to display error message
        
        // verifie que l'user et le mdp existent et correspondent bien
        if (!Controller.isUserValid(username)) {
            // JOptionPane.showMessageDialog(null, "Username: "+username+" does not exist!");
            JOptionPane.showMessageDialog(lg,"Il n'existe pas de "+username+" ici !","ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (!Controller.matchPassword(password,map.get(username))) {
            // JOptionPane.showMessageDialog(null, "Password does not match!");
            JOptionPane.showMessageDialog(lg,"Le nom d'utilisateur ou le mot de passe est incorrect","ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            // ouverture de la fenetre accueil
            dispose();
            new Accueil2Frame(username).setVisible(true);
        }
        }
    }//GEN-LAST:event_caseMDPKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
        new SignUpFrame().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void caseUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Go;
    private javax.swing.JPasswordField caseMDP;
    private javax.swing.JTextField caseUserName;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}