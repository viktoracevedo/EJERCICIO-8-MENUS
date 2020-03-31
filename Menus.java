/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author vikto
 */
public class Menus extends javax.swing.JFrame {

    /**
     * Creates new form Menus
     */
    public Menus() {
        initComponents();
         imgUno.setVisible(false);
         imgDos.setVisible(false);
         imgTres.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        imgUno = new javax.swing.JLabel();
        imgDos = new javax.swing.JLabel();
        imgTres = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mmNuevo = new javax.swing.JMenuItem();
        mmAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mmSalir = new javax.swing.JMenuItem();
        mmChkOpccion = new javax.swing.JCheckBoxMenuItem();
        mmRbPrimero = new javax.swing.JRadioButtonMenuItem();
        mmRbSegundo = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mmBtnAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gato1.png"))); // NOI18N
        getContentPane().add(imgUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        imgDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gato2.png"))); // NOI18N
        getContentPane().add(imgDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        imgTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gato3.png"))); // NOI18N
        getContentPane().add(imgTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        imgTres.getAccessibleContext().setAccessibleName("hola");
        imgTres.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("File");

        mmNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        mmNuevo.setText("Nuevo");
        mmNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mmNuevo);

        mmAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, 0));
        mmAbrir.setText("Abrir");
        mmAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mmAbrir);
        jMenu1.add(jSeparator1);

        mmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, 0));
        mmSalir.setText("Salir");
        mmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mmSalir);

        mmChkOpccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, 0));
        mmChkOpccion.setText("Opccion");
        mmChkOpccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmChkOpccionActionPerformed(evt);
            }
        });
        jMenu1.add(mmChkOpccion);

        mmRbPrimero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, 0));
        buttonGroup2.add(mmRbPrimero);
        mmRbPrimero.setText("Primero");
        mmRbPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmRbPrimeroActionPerformed(evt);
            }
        });
        jMenu1.add(mmRbPrimero);

        mmRbSegundo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, 0));
        buttonGroup2.add(mmRbSegundo);
        mmRbSegundo.setText("Segundo");
        mmRbSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmRbSegundoActionPerformed(evt);
            }
        });
        jMenu1.add(mmRbSegundo);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ayuda");

        mmBtnAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, 0));
        mmBtnAcerca.setText("Acerca de..");
        jMenu3.add(mmBtnAcerca);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mmSalirActionPerformed

    private void mmNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmNuevoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "VAS A CREAR ALGO NUEVO", "NEW", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mmNuevoActionPerformed

    private void mmAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmAbrirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "VAS A ABRIR ALGO", "OPEN", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_mmAbrirActionPerformed

    private void mmChkOpccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmChkOpccionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "OPCION DE PSICOSIS ACTIVADA", "#HOLA#", JOptionPane.WARNING_MESSAGE);
        if(mmChkOpccion.isSelected()){
            imgTres.setVisible(true);
            imgDos.setVisible(false);
            imgUno.setVisible(false);
        }
        else{
            imgTres.setVisible(false);
            
        }
    }//GEN-LAST:event_mmChkOpccionActionPerformed

    private void mmRbPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmRbPrimeroActionPerformed
        // TODO add your handling code here:
        if(mmRbPrimero.isSelected()){
        imgUno.setVisible(true);
        imgDos.setVisible(false);
          imgTres.setVisible(false);
        }
        else {
        }
    }//GEN-LAST:event_mmRbPrimeroActionPerformed

    private void mmRbSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmRbSegundoActionPerformed
        // TODO add your handling code here:
        if(mmRbSegundo.isSelected()){
        imgDos.setVisible(true);
        imgUno.setVisible(false);
        imgTres.setVisible(false);
        }
        else {
        }
    }//GEN-LAST:event_mmRbSegundoActionPerformed

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel imgDos;
    private javax.swing.JLabel imgTres;
    private javax.swing.JLabel imgUno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mmAbrir;
    private javax.swing.JMenuItem mmBtnAcerca;
    private javax.swing.JCheckBoxMenuItem mmChkOpccion;
    private javax.swing.JMenuItem mmNuevo;
    private javax.swing.JRadioButtonMenuItem mmRbPrimero;
    private javax.swing.JRadioButtonMenuItem mmRbSegundo;
    private javax.swing.JMenuItem mmSalir;
    // End of variables declaration//GEN-END:variables
}
