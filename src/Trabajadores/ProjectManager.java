/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import Empresa.Drive;
import Empresa.Ganancias;
import Utils.Constants;
import java.awt.Color;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author valeriazampetti
 */
public class ProjectManager extends Trabajador {

    private boolean viendo_Anime = false;
    private final Contador contador;
    public int tiempo_Para_Contador = 32;

    private int faltas = 0;
    private int dinero_Descontado = 0;

    private JTextField field_Viendo_Anime;
    private final JTextField field_faltasPM;
    private final JTextField field_DineroPM;

    public ProjectManager(Semaphore mutex, Drive drive, Ganancias ganancias,
            Contador contador,
            JTextField field_Viendo_Anime, JTextField field_faltasPM,
            JTextField field_DineroPM) {
        super(mutex, drive, ganancias);
        this.sueldo = 40;
        this.contador = contador;

        this.field_Viendo_Anime = field_Viendo_Anime;
        this.field_faltasPM = field_faltasPM;
        this.field_DineroPM = field_DineroPM;

        this.field_DineroPM.setText("0$");
        this.field_faltasPM.setText("0");

    }

    @Override
    public void trabajar() {
//        System.out.println("Comienza viendo anime");
        while (this.tiempo_Para_Contador != 0) {
//            System.out.println("Tiempo para contador" + this.tiempo_Para_Contador);
            this.setViendo_Anime(!this.getViendo_anime());
            try {
                sleep(Constants.MINUTE_DURATION * 30);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.tiempo_Para_Contador -= 1;
        }
        this.tiempo_Para_Contador = 32;
    }

    @Override
    public void descansar() {
        this.contador.siguiente_Dia();
        try {
            sleep(Constants.HOUR_DURATION * 8);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.pagarSueldo(sueldo * 24);
    }

    public boolean getViendo_anime() {
        return this.viendo_Anime;
    }

    /**
     * @param viendo_Anime the viendo_Anime to set
     */
    public void setViendo_Anime(boolean viendo_Anime) {
        this.viendo_Anime = viendo_Anime;

        if (viendo_Anime) {
            this.field_Viendo_Anime.setText("Viendo anime");
            this.field_Viendo_Anime.setBackground(Color.GREEN);
        } else {
            this.field_Viendo_Anime.setText("No esta viendo anime");
            this.field_Viendo_Anime.setBackground(Color.red);
        }
    }

    @Override
    public void descontarSueldo(int cantidad) {
        this.dinero_Descontado += cantidad;
        this.field_DineroPM.setText(this.dinero_Descontado + "$");

        this.faltas++;
        this.field_faltasPM.setText("" + this.faltas);
        super.descontarSueldo(cantidad);

    }
}
