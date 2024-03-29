/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Interfaces.clases.Empresa_Trabajadores_Iniciales;
import Utils.Constants;
import Utils.Funciones;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;

/**
 *
 * @author valeriazampetti
 */
public class InterfazInicial extends javax.swing.JFrame {

    static Empresa_Trabajadores_Iniciales trabajadores_Disney_Channel;
    static Empresa_Trabajadores_Iniciales trabajadores_Star_Channel;

    static int segundos_Contador;
    static int dias_Contador;

    /**
     * Creates new form InterfazInicial
     */
    public InterfazInicial() {
        this.setLocationRelativeTo(null);
        initComponents();

        trabajadores_Disney_Channel = new Empresa_Trabajadores_Iniciales();
        trabajadores_Star_Channel = new Empresa_Trabajadores_Iniciales();

        segundos_Spinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            segundos_Contador = (int) segundos_Spinner.getValue();
        });

        contador_Spinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            dias_Contador = (int) contador_Spinner.getValue();
        });

        conectarSpinnersEmpresa(new JSpinner[]{guionista_Star_Spinner,
            disenador_Star_Spinner, animador_Star_Spinner, doblaje_Star_Spinner,
            plotTwist_Star_Spinner
        }, trabajadores_Star_Channel);

        conectarSpinnersEmpresa(new JSpinner[]{guionista_Disney_Spinner,
            disenador_Disney_Spinner, animador_Disney_Spinner, doblaje_Disney_Spinner,
            plotTwist_Disney_Spinner
        }, trabajadores_Disney_Channel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        guionista_Star_Spinner = new javax.swing.JSpinner();
        animador_Star_Spinner = new javax.swing.JSpinner();
        plotTwist_Star_Spinner = new javax.swing.JSpinner();
        doblaje_Star_Spinner = new javax.swing.JSpinner();
        disenador_Star_Spinner = new javax.swing.JSpinner();
        guionista_Disney_Spinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        segundos_Spinner = new javax.swing.JSpinner();
        animador_Disney_Spinner = new javax.swing.JSpinner();
        doblaje_Disney_Spinner = new javax.swing.JSpinner();
        plotTwist_Disney_Spinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        trabajadores_Guardar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        trabajadores_Cargar = new javax.swing.JButton();
        segundos_Cargar = new javax.swing.JButton();
        segundos_Guardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        disenador_Disney_Spinner = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        contador_Spinner = new javax.swing.JSpinner();
        contador_Cargar = new javax.swing.JButton();
        contador_Guardar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        fondoprincipal = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoprincipaaal.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));
        getContentPane().add(guionista_Star_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        getContentPane().add(animador_Star_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        getContentPane().add(plotTwist_Star_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));
        getContentPane().add(doblaje_Star_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        getContentPane().add(disenador_Star_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        getContentPane().add(guionista_Disney_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guionista");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Diseñador escenario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Animador");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Actor Doblaje");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 20));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Plot Twist");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));
        getContentPane().add(segundos_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 90, -1));
        getContentPane().add(animador_Disney_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));
        getContentPane().add(doblaje_Disney_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
        getContentPane().add(plotTwist_Disney_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Guionista");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Diseñador escenario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Duración de un segundo");
        jLabel9.setMaximumSize(new java.awt.Dimension(149, 60));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 80, 40));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Actor Doblaje");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Plot Twist");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        trabajadores_Guardar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        trabajadores_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        trabajadores_Guardar.setText("Guardar");
        trabajadores_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadores_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(trabajadores_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disney-logo-transparent-free-png.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 220, 80));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1366_521.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 80));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        trabajadores_Cargar.setText("Cargar");
        trabajadores_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadores_CargarActionPerformed(evt);
            }
        });
        getContentPane().add(trabajadores_Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        segundos_Cargar.setText("Cargar");
        segundos_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundos_CargarActionPerformed(evt);
            }
        });
        getContentPane().add(segundos_Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        segundos_Guardar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        segundos_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        segundos_Guardar.setText("Guardar");
        segundos_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundos_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(segundos_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Animador");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Trabajadores");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));
        getContentPane().add(disenador_Disney_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Dias del contador");
        jLabel17.setMaximumSize(new java.awt.Dimension(149, 60));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 80, 40));
        getContentPane().add(contador_Spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 90, -1));

        contador_Cargar.setText("Cargar");
        contador_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contador_CargarActionPerformed(evt);
            }
        });
        getContentPane().add(contador_Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        contador_Guardar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        contador_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        contador_Guardar.setText("Guardar");
        contador_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contador_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(contador_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        fondoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoprincipaaal.png"))); // NOI18N
        fondoprincipal.setText("jLabel2");
        getContentPane().add(fondoprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 790, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trabajadores_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadores_GuardarActionPerformed
        trabajadores_Cargar.setBackground(new java.awt.Color(255, 204, 204));
        JFileChooser fx = new JFileChooser();

        int seleccion = fx.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = fx.getSelectedFile();
            Funciones.write_txt_int(fichero, trabajadores_Disney_Channel);
        }


    }//GEN-LAST:event_trabajadores_GuardarActionPerformed

    private void trabajadores_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadores_CargarActionPerformed

        trabajadores_Cargar.setBackground(new java.awt.Color(255, 204, 204));
        JFileChooser fx = new JFileChooser();

        int seleccion = fx.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = fx.getSelectedFile();
            var hola = Funciones.Leer_txt_trabajadores(fichero.getAbsolutePath());
//            TODO HAcer lo de leer
        }
    }//GEN-LAST:event_trabajadores_CargarActionPerformed

    private void segundos_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundos_CargarActionPerformed
        segundos_Cargar.setBackground(new java.awt.Color(255, 204, 204));
        JFileChooser fx = new JFileChooser();

        int seleccion = fx.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = fx.getSelectedFile();
            int segundos = Funciones.Leer_txt_Int(fichero.getAbsolutePath());
            segundos_Spinner.setValue(segundos);
        }
    }//GEN-LAST:event_segundos_CargarActionPerformed

    private void segundos_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundos_GuardarActionPerformed
        segundos_Cargar.setBackground(new java.awt.Color(255, 204, 204));
        JFileChooser fx = new JFileChooser();

        int seleccion = fx.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = fx.getSelectedFile();

            Funciones.write_txt_int(fichero, segundos_Contador);
        }

    }//GEN-LAST:event_segundos_GuardarActionPerformed

    private void contador_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contador_CargarActionPerformed
        contador_Cargar.setBackground(new java.awt.Color(255, 204, 204));
        JFileChooser fx = new JFileChooser();

        int seleccion = fx.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fx.getSelectedFile();
            int dias = Funciones.Leer_txt_Int(fichero.getAbsolutePath());
            contador_Spinner.setValue(dias);
        }
    }//GEN-LAST:event_contador_CargarActionPerformed

    private void contador_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contador_GuardarActionPerformed
        contador_Cargar.setBackground(new java.awt.Color(255, 204, 204));
        JFileChooser fx = new JFileChooser();

        int seleccion = fx.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fx.getSelectedFile();
            Funciones.write_txt_int(fichero, segundos_Contador);
        }
    }//GEN-LAST:event_contador_GuardarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        this.setVisible(false);

        Constants.setSecond(segundos_Contador);
        Interfaz1 interfaz = new Interfaz1(trabajadores_Disney_Channel, trabajadores_Star_Channel);
        interfaz.show();
        
    }//GEN-LAST:event_siguienteActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicial().setVisible(true);

            }
        });
    }

    private void conectarSpinnersEmpresa(javax.swing.JSpinner[] spinners,
            Empresa_Trabajadores_Iniciales trabajadores_iniciales) {
        spinners[0].addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            trabajadores_iniciales.guionista = (int) spinners[0].getValue();
        });

        spinners[1].addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            trabajadores_iniciales.disenador_escenario = (int) spinners[1].getValue();
        });

        spinners[2].addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            trabajadores_iniciales.animador = (int) spinners[2].getValue();
        });

        spinners[3].addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            trabajadores_iniciales.actor_doblaje = (int) spinners[3].getValue();
        });

        spinners[4].addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            trabajadores_iniciales.plot_twist = (int) spinners[4].getValue();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner animador_Disney_Spinner;
    private javax.swing.JSpinner animador_Star_Spinner;
    private javax.swing.JButton contador_Cargar;
    private javax.swing.JButton contador_Guardar;
    private javax.swing.JSpinner contador_Spinner;
    private javax.swing.JSpinner disenador_Disney_Spinner;
    private javax.swing.JSpinner disenador_Star_Spinner;
    private javax.swing.JSpinner doblaje_Disney_Spinner;
    private javax.swing.JSpinner doblaje_Star_Spinner;
    private javax.swing.JLabel fondoprincipal;
    private javax.swing.JSpinner guionista_Disney_Spinner;
    private javax.swing.JSpinner guionista_Star_Spinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JSpinner plotTwist_Disney_Spinner;
    private javax.swing.JSpinner plotTwist_Star_Spinner;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JButton segundos_Cargar;
    private javax.swing.JButton segundos_Guardar;
    private javax.swing.JSpinner segundos_Spinner;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton trabajadores_Cargar;
    private javax.swing.JButton trabajadores_Guardar;
    // End of variables declaration//GEN-END:variables
}
