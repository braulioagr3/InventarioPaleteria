
package paleteria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static paleteria.Inventario.DataClientes;
import static paleteria.Inventario.DataInventario;
import static paleteria.Inventario.DataVenta;
import static paleteria.Inventario.rt;
import static paleteria.Inventario.st;


public class ModificaCliente extends javax.swing.JFrame {

   private static String idCliente, nombre1, telefono1, tipo1, descuento1;
   private static Connection Conexion = null;
   public static Statement st = null;
   public static ResultSet rt;
   
    public ModificaCliente(String idC) {
        initComponents();
        
        idCliente = idC;
        Conexion = Nexo.conex();
        ObtienedatosCliente();
        this.nombretext.setText(nombre1);
        this.telefonotext.setText(telefono1);
        if(tipo1 == "Mayoreo")
        {
            this.tipocbox.setSelectedIndex(1);
        }
        else
        {
            this.tipocbox.setSelectedIndex(0);
        }
        this.descuentotext.setValue(Integer.parseInt(descuento1));
    }
    
     public static void ObtienedatosCliente(){

        try{
            String Qery = "SELECT * FROM empleado.Cliente WHERE idCliente = " + idCliente;
            st = Conexion.createStatement();
            rt = st.executeQuery(Qery);
            while(rt.next()){
                nombre1 = rt.getString(2);
                telefono1 = rt.getString(3);
                tipo1 = rt.getString(4);
                descuento1 = rt.getString(5);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aceptarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        nombretext = new javax.swing.JTextField();
        tipoc = new javax.swing.JLabel();
        tipocbox = new javax.swing.JComboBox<>();
        telefono = new javax.swing.JLabel();
        telefonotext = new javax.swing.JTextField();
        descuento = new javax.swing.JLabel();
        descuentotext = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modifica cliente");

        aceptarbtn.setText("Aceptar");
        aceptarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtnActionPerformed(evt);
            }
        });

        cancelarbtn.setText("Cancelar");
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });

        nombre.setText("Nombre");
        nombre.setName("nombre"); // NOI18N

        nombretext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretextActionPerformed(evt);
            }
        });

        tipoc.setText("Tipo de Cliente");
        tipoc.setName("nombre"); // NOI18N

        tipocbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayoreo", "Menudeo" }));

        telefono.setText("Teléfono");
        telefono.setName("nombre"); // NOI18N

        telefonotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonotextActionPerformed(evt);
            }
        });

        descuento.setText("Descuento");
        descuento.setName("nombre"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tipocbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descuentotext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombretext, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonotext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(descuento, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoc)
                .addGap(9, 9, 9)
                .addComponent(tipocbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonotext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descuento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descuentotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarbtn)
                    .addComponent(aceptarbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbtnActionPerformed
        Nexo.ejecutaSQL("UPDATE empleado.Cliente SET NombreCliente = '" + this.nombretext.getText() + "', Telefono = '" + this.telefonotext.getText() + "', tipocliente = '"+ this.tipocbox.getSelectedItem().toString() + "', descuento = '"+ this.descuentotext.getValue().toString() + "' WHERE idCliente = "+ idCliente, false);
        Inventario.ActualizagridCliente();
        this.dispose();
        JOptionPane.showMessageDialog(this, "Actualización Correcta");

    }//GEN-LAST:event_aceptarbtnActionPerformed

    private void nombretextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretextActionPerformed

    private void telefonotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonotextActionPerformed

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ModificaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaCliente(idCliente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarbtn;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JLabel descuento;
    private javax.swing.JSpinner descuentotext;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombretext;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefonotext;
    private javax.swing.JLabel tipoc;
    private javax.swing.JComboBox<String> tipocbox;
    // End of variables declaration//GEN-END:variables
}
