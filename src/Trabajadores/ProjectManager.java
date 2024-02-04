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
    
    private JTextField field_Viendo_Anime;


    public ProjectManager(Semaphore mutex, Drive drive, Ganancias ganancias, 
            Contador contador, JTextField field_Viendo_Anime) {
        super(mutex, drive, ganancias);
        this.sueldo = 40;
        this.contador = contador;
        this.field_Viendo_Anime= field_Viendo_Anime;
    }

    @Override
    public void trabajar() {
        while (this.tiempo_Para_Contador != 0) {
            this.setViendo_Anime(!isViendo_Anime());
            try {
                sleep(Constants.MINUTE_DURATION * 30);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.tiempo_Para_Contador -= 1;
        }
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
    
    public boolean viendo_anime(){
        return this.isViendo_Anime();
    }

    /**
     * @return the viendo_Anime
     */
    public boolean isViendo_Anime() {
        return viendo_Anime;
    }

    /**
     * @param viendo_Anime the viendo_Anime to set
     */
    public void setViendo_Anime(boolean viendo_Anime) {
        this.viendo_Anime = viendo_Anime;
        
        if (viendo_Anime) {
            this.field_Viendo_Anime.setText("Viendo anime");
            this.field_Viendo_Anime.setBackground(Color.GREEN);
        }else{
            this.field_Viendo_Anime.setText("No esta viendo anime");
            this.field_Viendo_Anime.setBackground(Color.red);
        }
    }
    
    
}
