/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Empresa.Empresa;
import Interfaces.clases.Drive_Labels;
import Interfaces.clases.Empresa_Labels;
import Interfaces.clases.Empresa_Trabajadores_Iniciales;

/**
 *
 * @author valeriazampetti
 */
public class Interfaz1 extends javax.swing.JFrame {

    static Empresa[] empresas;

    /**
     * Creates new form Interfaz1
     * @param trabajadores_Disney
     * @param trabajadores_Star_Channel
     */
    public Interfaz1(Empresa_Trabajadores_Iniciales trabajadores_Disney,
            Empresa_Trabajadores_Iniciales trabajadores_Star_Channel) {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.crearEmpresas(trabajadores_Disney, trabajadores_Star_Channel);

    }

    private void crearEmpresas(Empresa_Trabajadores_Iniciales trabajadores_Disney,
            Empresa_Trabajadores_Iniciales trabajadores_Star_Channel) {
        var labels = new Empresa_Labels[]{
            new Empresa_Labels(
            new Drive_Labels(Star_Estandar_Field, Star_PlotTwist_Field,
            guiones_Field, doblajes_Field, escenarios_Field,
            animaciones_Field, plotTwist_Field),
            field_Viendo_Anime, field_VigilandoDirector
            ),
//            new Empresa_Labels(
//            new Drive_Labels(Star_Estandar_Field, Star_PlotTwist_Field,
//            guiones_Field, doblajes_Field, escenarios_Field,
//            animaciones_Field, plotTwist_Field)
//            ) // Poner labels de disney
        };

        empresas = new Empresa[]{
            new Empresa(6, "Star Channel", labels[0], trabajadores_Star_Channel),
//            new Empresa(1, "Disney Channel", labels[1], trabajadores_Disney)
        };

        for (int i = 0; i < empresas.length; i++) {
            var empresa = empresas[i];
            this.TabbedPane_principal.setTitleAt(i, empresa.nombre);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        TabbedPane_principal = new javax.swing.JTabbedPane();
        Star_Pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Star_PlotTwist_Field = new javax.swing.JTextField();
        escenarios_Field = new javax.swing.JTextField();
        starfondo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Star_Estandar_Field = new javax.swing.JTextField();
        animaciones_Field = new javax.swing.JTextField();
        doblajes_Field = new javax.swing.JTextField();
        plotTwist_Field = new javax.swing.JTextField();
        guiones_Field = new javax.swing.JTextField();
        guiones_FieldMAX = new javax.swing.JTextField();
        escenarios_FieldMAX = new javax.swing.JTextField();
        animaciones_FieldMAX = new javax.swing.JTextField();
        doblajes_FieldMAX = new javax.swing.JTextField();
        plotTwist_FieldMAX = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        field_Viendo_Anime = new javax.swing.JTextField();
        field_VigilandoDirector = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Disney_Pane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedPane_principal.setAutoscrolls(true);

        Star_Pane.setAutoscrolls(true);
        Star_Pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Capitulos listos para entregar");
        Star_Pane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jLabel2.setText("Plot Twist");
        Star_Pane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        jLabel3.setText("Estándar");
        Star_Pane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        Star_PlotTwist_Field.setEditable(false);
        Star_PlotTwist_Field.setText("0");
        Star_PlotTwist_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Star_PlotTwist_FieldActionPerformed(evt);
            }
        });
        Star_Pane.add(Star_PlotTwist_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        escenarios_Field.setEditable(false);
        escenarios_Field.setText("0");
        escenarios_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escenarios_FieldActionPerformed(evt);
            }
        });
        Star_Pane.add(escenarios_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        starfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/starplusimagenes.jpg"))); // NOI18N
        starfondo.setText("jLabel4");
        Star_Pane.add(starfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 790, 1090));

        jLabel6.setText("Recurssos del Drive");
        Star_Pane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jLabel7.setText("Actuales");
        Star_Pane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel8.setText("Máximo");
        Star_Pane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        Star_Estandar_Field.setEditable(false);
        Star_Estandar_Field.setText("0");
        Star_Estandar_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Star_Estandar_FieldActionPerformed(evt);
            }
        });
        Star_Pane.add(Star_Estandar_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        animaciones_Field.setEditable(false);
        animaciones_Field.setText("0");
        animaciones_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animaciones_FieldActionPerformed(evt);
            }
        });
        Star_Pane.add(animaciones_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        doblajes_Field.setEditable(false);
        doblajes_Field.setText("0");
        doblajes_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doblajes_FieldActionPerformed(evt);
            }
        });
        Star_Pane.add(doblajes_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        plotTwist_Field.setEditable(false);
        plotTwist_Field.setText("0");
        plotTwist_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotTwist_FieldActionPerformed(evt);
            }
        });
        Star_Pane.add(plotTwist_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        guiones_Field.setEditable(false);
        guiones_Field.setText("0");
        guiones_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiones_FieldActionPerformed(evt);
            }
        });
        Star_Pane.add(guiones_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        guiones_FieldMAX.setEditable(false);
        guiones_FieldMAX.setText("25");
        guiones_FieldMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiones_FieldMAXActionPerformed(evt);
            }
        });
        Star_Pane.add(guiones_FieldMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        escenarios_FieldMAX.setEditable(false);
        escenarios_FieldMAX.setText("20");
        escenarios_FieldMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escenarios_FieldMAXActionPerformed(evt);
            }
        });
        Star_Pane.add(escenarios_FieldMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        animaciones_FieldMAX.setEditable(false);
        animaciones_FieldMAX.setText("55");
        animaciones_FieldMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animaciones_FieldMAXActionPerformed(evt);
            }
        });
        Star_Pane.add(animaciones_FieldMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        doblajes_FieldMAX.setEditable(false);
        doblajes_FieldMAX.setText("35");
        doblajes_FieldMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doblajes_FieldMAXActionPerformed(evt);
            }
        });
        Star_Pane.add(doblajes_FieldMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));

        plotTwist_FieldMAX.setEditable(false);
        plotTwist_FieldMAX.setText("10");
        plotTwist_FieldMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotTwist_FieldMAXActionPerformed(evt);
            }
        });
        Star_Pane.add(plotTwist_FieldMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        jLabel9.setText("Escenarios");
        Star_Pane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel10.setText("Guiones");
        Star_Pane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel11.setText("Plot Twists");
        Star_Pane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel12.setText("Doblajes");
        Star_Pane.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabel13.setText("Animaciones");
        Star_Pane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        field_Viendo_Anime.setEditable(false);
        field_Viendo_Anime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_Viendo_AnimeActionPerformed(evt);
            }
        });
        Star_Pane.add(field_Viendo_Anime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, -1));

        field_VigilandoDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_VigilandoDirectorActionPerformed(evt);
            }
        });
        Star_Pane.add(field_VigilandoDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/starplusfondo2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        Star_Pane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 810, 450));

        TabbedPane_principal.addTab("tab2", Star_Pane);

        Disney_Pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disneyfondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        Disney_Pane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 760, 410));

        TabbedPane_principal.addTab("tab2", Disney_Pane);

        getContentPane().add(TabbedPane_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escenarios_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escenarios_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escenarios_FieldActionPerformed

    private void Star_PlotTwist_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Star_PlotTwist_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Star_PlotTwist_FieldActionPerformed

    private void Star_Estandar_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Star_Estandar_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Star_Estandar_FieldActionPerformed

    private void animaciones_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animaciones_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animaciones_FieldActionPerformed

    private void doblajes_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doblajes_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doblajes_FieldActionPerformed

    private void plotTwist_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotTwist_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plotTwist_FieldActionPerformed

    private void guiones_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiones_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiones_FieldActionPerformed

    private void guiones_FieldMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiones_FieldMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiones_FieldMAXActionPerformed

    private void escenarios_FieldMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escenarios_FieldMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escenarios_FieldMAXActionPerformed

    private void animaciones_FieldMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animaciones_FieldMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animaciones_FieldMAXActionPerformed

    private void doblajes_FieldMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doblajes_FieldMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doblajes_FieldMAXActionPerformed

    private void plotTwist_FieldMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotTwist_FieldMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plotTwist_FieldMAXActionPerformed

    private void field_Viendo_AnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_Viendo_AnimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_Viendo_AnimeActionPerformed

    private void field_VigilandoDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_VigilandoDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_VigilandoDirectorActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Empresa_Trabajadores_Iniciales trabajadores_Disney,
                    Empresa_Trabajadores_Iniciales trabajadores_Star_Channel) {
                new Interfaz1(trabajadores_Disney, trabajadores_Star_Channel).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    private void crearGrafico() {
//        TODO
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Disney_Pane;
    private javax.swing.JTextField Star_Estandar_Field;
    private javax.swing.JPanel Star_Pane;
    private javax.swing.JTextField Star_PlotTwist_Field;
    private javax.swing.JTabbedPane TabbedPane_principal;
    private javax.swing.JTextField animaciones_Field;
    private javax.swing.JTextField animaciones_FieldMAX;
    private javax.swing.JTextField doblajes_Field;
    private javax.swing.JTextField doblajes_FieldMAX;
    private javax.swing.JTextField escenarios_Field;
    private javax.swing.JTextField escenarios_FieldMAX;
    private javax.swing.JTextField field_Viendo_Anime;
    private javax.swing.JTextField field_VigilandoDirector;
    private javax.swing.JTextField guiones_Field;
    private javax.swing.JTextField guiones_FieldMAX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField plotTwist_Field;
    private javax.swing.JTextField plotTwist_FieldMAX;
    private javax.swing.JLabel starfondo;
    // End of variables declaration//GEN-END:variables
}
