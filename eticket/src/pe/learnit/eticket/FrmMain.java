package pe.learnit.eticket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JORGE
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
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

        jmnMenuPrincipal = new javax.swing.JMenuBar();
        jmnArchivo = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmnMantenimiento = new javax.swing.JMenu();
        jmiProducto = new javax.swing.JMenuItem();
        jmiCliente = new javax.swing.JMenuItem();
        jmnVenta = new javax.swing.JMenu();
        jmiRegistrarVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmnArchivo.setText("Archivo");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmnArchivo.add(jmiSalir);

        jmnMenuPrincipal.add(jmnArchivo);

        jmnMantenimiento.setText("Mantenimiento");
        jmnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnMantenimientoActionPerformed(evt);
            }
        });

        jmiProducto.setText("Producto");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jmnMantenimiento.add(jmiProducto);

        jmiCliente.setText("Cliente");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        jmnMantenimiento.add(jmiCliente);

        jmnMenuPrincipal.add(jmnMantenimiento);

        jmnVenta.setText("Ventas");

        jmiRegistrarVentas.setText("Registrar Ventas");
        jmiRegistrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarVentasActionPerformed(evt);
            }
        });
        jmnVenta.add(jmiRegistrarVentas);

        jmnMenuPrincipal.add(jmnVenta);

        setJMenuBar(jmnMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmnMantenimientoActionPerformed

    private void jmiProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoActionPerformed
    FrmProducto frmProducto = new FrmProducto(this,true,false);
    frmProducto.setVisible(true);
    }//GEN-LAST:event_jmiProductoActionPerformed

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
        // TODO add your handling code here:
        FrmCliente frmCliente = new FrmCliente(this,true,false);
    frmCliente.setVisible(true);
    }//GEN-LAST:event_jmiClienteActionPerformed

    private void jmiRegistrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarVentasActionPerformed
        // TODO add your handling code here:
        FrmRegistrarVenta frmRegistrarVenta = new FrmRegistrarVenta(this,true);
        frmRegistrarVenta.setVisible(true);
    }//GEN-LAST:event_jmiRegistrarVentasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiProducto;
    private javax.swing.JMenuItem jmiRegistrarVentas;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenu jmnArchivo;
    private javax.swing.JMenu jmnMantenimiento;
    private javax.swing.JMenuBar jmnMenuPrincipal;
    private javax.swing.JMenu jmnVenta;
    // End of variables declaration//GEN-END:variables
}