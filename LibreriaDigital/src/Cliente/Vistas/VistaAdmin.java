/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Vistas;

import Cliente.Controladores.Controlador;

import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Luis
 */
public class VistaAdmin extends javax.swing.JFrame {
    
    private boolean autorizado;
    private Controlador controlador_cliente;

    /**
     * Creates new form VistaAdmin
     */
    public VistaAdmin() {
        initComponents();
        controlador_cliente = new Controlador();
        //controlador_cliente.ejecutarCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        buttonAddBook = new javax.swing.JButton();
        buttonDeleteBook = new javax.swing.JButton();
        buttonFindBook = new javax.swing.JButton();
        buttonEditBook = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        buttonAddOferta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        buttonAddAdmin = new javax.swing.JButton();
        buttonDeleteAdmin = new javax.swing.JButton();
        buttonFindAdmin = new javax.swing.JButton();
        buttonEditAdmin = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addBookButton.png"))); // NOI18N
        buttonAddBook.setText("Agregar");
        buttonAddBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddBookActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 10, 0);
        jPanel1.add(buttonAddBook, gridBagConstraints);

        buttonDeleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deleteBookButton.png"))); // NOI18N
        buttonDeleteBook.setText("Eliminar");
        buttonDeleteBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDeleteBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteBookActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 10, 0);
        jPanel1.add(buttonDeleteBook, gridBagConstraints);

        buttonFindBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/findBookButton.png"))); // NOI18N
        buttonFindBook.setText("Consultar");
        buttonFindBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonFindBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonFindBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFindBookActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 10, 0);
        jPanel1.add(buttonFindBook, gridBagConstraints);

        buttonEditBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editBookButton.png"))); // NOI18N
        buttonEditBook.setText("Editar");
        buttonEditBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEditBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonEditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditBookActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 10, 48);
        jPanel1.add(buttonEditBook, gridBagConstraints);

        jTabbedPane1.addTab("Libros", jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addReaderButton.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 47, 8, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deleteReaderButton.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 8, 0);
        jPanel2.add(jButton2, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/findReaderButton.png"))); // NOI18N
        jButton3.setText("Consultar");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 8, 0);
        jPanel2.add(jButton3, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editReaderButton.png"))); // NOI18N
        jButton4.setText("Editar");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 8, 54);
        jPanel2.add(jButton4, gridBagConstraints);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new java.awt.GridBagConstraints());

        jTabbedPane1.addTab("Usuarios lectores", jPanel2);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        buttonAddOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addDiscountOfferButton.png"))); // NOI18N
        buttonAddOferta.setText("Agregar");
        buttonAddOferta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddOferta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 211, 6, 208);
        jPanel4.add(buttonAddOferta, gridBagConstraints);

        jTabbedPane1.addTab("Periodos de oferta", jPanel4);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        buttonAddAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addAdminButton.png"))); // NOI18N
        buttonAddAdmin.setText("Agregar");
        buttonAddAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 65, 8, 0);
        jPanel5.add(buttonAddAdmin, gridBagConstraints);

        buttonDeleteAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deleteAdminButton.png"))); // NOI18N
        buttonDeleteAdmin.setText("Eliminar");
        buttonDeleteAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDeleteAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonDeleteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 8, 0);
        jPanel5.add(buttonDeleteAdmin, gridBagConstraints);

        buttonFindAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/findAdminButton.png"))); // NOI18N
        buttonFindAdmin.setText("Consultar");
        buttonFindAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonFindAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonFindAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFindAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 8, 0);
        jPanel5.add(buttonFindAdmin, gridBagConstraints);

        buttonEditAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editAdminButton.png"))); // NOI18N
        buttonEditAdmin.setText("Editar");
        buttonEditAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEditAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonEditAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 8, 65);
        jPanel5.add(buttonEditAdmin, gridBagConstraints);

        jTabbedPane1.addTab("Usuarios administradores", jPanel5);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desktopPane)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddBookActionPerformed
        InternalAddBook add = new InternalAddBook(controlador_cliente);
        this.desktopPane.add(add);
        add.setVisible(true);
    }//GEN-LAST:event_buttonAddBookActionPerformed

    private void buttonDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteBookActionPerformed
        InternalDeleteBook del = new InternalDeleteBook(controlador_cliente);
        this.desktopPane.add(del);
        del.setVisible(true);
    }//GEN-LAST:event_buttonDeleteBookActionPerformed

    private void buttonFindBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFindBookActionPerformed
        InternalFindBook find = new InternalFindBook(controlador_cliente);
        this.desktopPane.add(find);
        find.setVisible(true);
    }//GEN-LAST:event_buttonFindBookActionPerformed

    private void buttonEditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditBookActionPerformed
      
    }//GEN-LAST:event_buttonEditBookActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InternalVistaLectura lect = new InternalVistaLectura(controlador_cliente); 
        this.desktopPane.add(lect); 
        lect.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttonAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddAdminActionPerformed
        InternalAddAdmin add = new InternalAddAdmin(controlador_cliente);
        this.desktopPane.add(add);
        add.setVisible(true);
    }//GEN-LAST:event_buttonAddAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InternalAddLector add = new InternalAddLector(controlador_cliente);
        this.desktopPane.add(add);
        add.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonDeleteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteAdminActionPerformed
        InternalDeleteAdmin del = new InternalDeleteAdmin(controlador_cliente);
        this.desktopPane.add(del);
        del.setVisible(true);
    }//GEN-LAST:event_buttonDeleteAdminActionPerformed

    private void buttonFindAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFindAdminActionPerformed
        InternalFindAdmin find = new InternalFindAdmin(controlador_cliente);
        this.desktopPane.add(find);
        find.setVisible(true);
    }//GEN-LAST:event_buttonFindAdminActionPerformed

    private void buttonEditAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditAdminActionPerformed
        InternalEditAdmin edit = new InternalEditAdmin(controlador_cliente);
        this.desktopPane.add(edit);
        edit.setVisible(true);
    }//GEN-LAST:event_buttonEditAdminActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddAdmin;
    private javax.swing.JButton buttonAddBook;
    private javax.swing.JButton buttonAddOferta;
    private javax.swing.JButton buttonDeleteAdmin;
    private javax.swing.JButton buttonDeleteBook;
    private javax.swing.JButton buttonEditAdmin;
    private javax.swing.JButton buttonEditBook;
    private javax.swing.JButton buttonFindAdmin;
    private javax.swing.JButton buttonFindBook;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
