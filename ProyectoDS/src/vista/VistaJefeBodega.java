 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author vielka
 */
public class VistaJefeBodega extends javax.swing.JFrame {

    /**
     * Creates new form JefeBodega
     */
    public VistaJefeBodega() {
        initComponents();
    }

    public JButton getBotonAsignarR() {
        return botonAsignarR;
    }

    public JButton getBotonConsulta() {
        return botonConsulta;
    }

    public JButton getBotonLiberarR() {
        return botonLiberarR;
    }

    public JButton getBotonReportes() {
        return botonReportes;
    }

    public JButton getBotonStock() {
        return botonStock;
    }

    public JInternalFrame getjInternalFrame1() {
        return jInternalFrame1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        botonConsulta = new javax.swing.JButton();
        botonStock = new javax.swing.JButton();
        botonAsignarR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonReportes = new javax.swing.JButton();
        botonLiberarR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        botonConsulta.setText("Consultar");
        botonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaActionPerformed(evt);
            }
        });

        botonStock.setText("Enviar stock");

        botonAsignarR.setText("Asignar repartidor");
        botonAsignarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsignarRActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Jefe de Bodega");

        botonReportes.setText("Ver reporte repartidores");
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        botonLiberarR.setText("Liberar repartidor");
        botonLiberarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLiberarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonStock, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAsignarR, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLiberarR, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonStock, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAsignarR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonLiberarR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAsignarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsignarRActionPerformed
        evt.getID();
        VistaAsginarRepartidor vb = new VistaAsginarRepartidor();
        vb.setVisible(true);
        vb.getBotonRegresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(vb.getBotonRegresar())){
                    vb.setVisible(false);
                   }
            }
        });
    }//GEN-LAST:event_botonAsignarRActionPerformed

    private void botonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaActionPerformed
        evt.getID();
        VistaBusqueda vb = new VistaBusqueda();
        vb.setVisible(true);
        vb.getBotonRegresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(vb.getBotonRegresar())){
                    vb.setVisible(false);
                   }
            }
        });
    }//GEN-LAST:event_botonConsultaActionPerformed

    private void botonLiberarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLiberarRActionPerformed
        evt.getID();
        VistaAsginarRepartidor vb = new VistaAsginarRepartidor();
        vb.setVisible(true);
        vb.getBotonRegresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(vb.getBotonRegresar())){
                    vb.setVisible(false);
                   }
            }
        });
    }//GEN-LAST:event_botonLiberarRActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        evt.getID();
        VistaReportesRepartidores vb = new VistaReportesRepartidores();
        vb.setVisible(true);
        vb.getBotonRegresar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(vb.getBotonRegresar())){
                    vb.setVisible(false);
                   }
            }
        });
    }//GEN-LAST:event_botonReportesActionPerformed

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
            java.util.logging.Logger.getLogger(VistaJefeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJefeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJefeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJefeBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJefeBodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAsignarR;
    private javax.swing.JButton botonConsulta;
    private javax.swing.JButton botonLiberarR;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton botonStock;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
