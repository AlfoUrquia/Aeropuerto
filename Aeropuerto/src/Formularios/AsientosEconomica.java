/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AsientosEconomica extends javax.swing.JDialog {

    /**
     * Creates new form AsientosEconomica
     */
    public AsientosEconomica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        btnD2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnD1 = new javax.swing.JButton();
        btnE2 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnF1 = new javax.swing.JButton();
        btnF2 = new javax.swing.JButton();
        btnG1 = new javax.swing.JButton();
        btnG2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnD2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnD2.setText("D2");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione los asientos que desea:");

        btnD1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnD1.setText("D1");

        btnE2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnE2.setText("E2");

        btnE1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnE1.setText("E1");

        btnF1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnF1.setText("F1");
        btnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1ActionPerformed(evt);
            }
        });

        btnF2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnF2.setText("F2");

        btnG1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnG1.setText("G1");
        btnG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG1ActionPerformed(evt);
            }
        });

        btnG2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnG2.setText("G2");
        btnG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\Imagen8.png")); // NOI18N
        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnG1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnG2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnD1)
                                    .addComponent(btnE1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnE2)
                                    .addComponent(btnD2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnF1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnF2)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnD2)
                        .addComponent(jButton1))
                    .addComponent(btnD1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnE2)
                    .addComponent(btnE1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnF2)
                    .addComponent(btnF1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnG1)
                    .addComponent(btnG2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnF1ActionPerformed

    private void btnG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnG1ActionPerformed

    private void btnG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnG2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(VLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           // Logger.getLogger(VLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(VLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(VLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
           

        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AsientosEconomica dialog = new AsientosEconomica(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnD2;
    private javax.swing.JButton btnE1;
    private javax.swing.JButton btnE2;
    private javax.swing.JButton btnF1;
    private javax.swing.JButton btnF2;
    private javax.swing.JButton btnG1;
    private javax.swing.JButton btnG2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}