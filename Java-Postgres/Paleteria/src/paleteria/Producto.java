/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paleteria;

/**
 *
 * @author ulise
 */
public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form Producto
     */
    public Producto() {
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

        aceptarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        nombretext = new javax.swing.JTextField();
        tipoc = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        telefonotext = new javax.swing.JTextField();
        telefonotext1 = new javax.swing.JTextField();
        aceptarbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aceptarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccionar.png"))); // NOI18N
        aceptarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtnActionPerformed(evt);
            }
        });

        cancelarbtn.setText("Cancelar");

        nombre.setText("Categoria");
        nombre.setName("nombre"); // NOI18N

        nombretext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretextActionPerformed(evt);
            }
        });

        tipoc.setText("Precio");
        tipoc.setName("nombre"); // NOI18N

        telefono.setText("Sabor");
        telefono.setName("nombre"); // NOI18N

        telefonotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonotextActionPerformed(evt);
            }
        });

        telefonotext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonotext1ActionPerformed(evt);
            }
        });

        aceptarbtn1.setText("Aceptar");
        aceptarbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonotext1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelarbtn)
                            .addGap(101, 101, 101)
                            .addComponent(aceptarbtn1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonotext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aceptarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tipoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonotext1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonotext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarbtn)
                    .addComponent(aceptarbtn1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarbtnActionPerformed

    private void nombretextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretextActionPerformed

    private void telefonotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonotextActionPerformed

    private void telefonotext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonotext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonotext1ActionPerformed

    private void aceptarbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarbtn;
    private javax.swing.JButton aceptarbtn1;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombretext;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefonotext;
    private javax.swing.JTextField telefonotext1;
    private javax.swing.JLabel tipoc;
    // End of variables declaration//GEN-END:variables
}
