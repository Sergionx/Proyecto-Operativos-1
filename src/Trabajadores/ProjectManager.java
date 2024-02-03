/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import Empresa.Drive;
import Utils.Constants;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author valeriazampetti
 */
public class ProjectManager extends Trabajador {

    private boolean viendo_Anime = false;
    private final Contador contador;
    public int tiempo_Para_Contador = 32;

    public ProjectManager(Semaphore mutex, Drive drive, Contador contador) {
        super(mutex, drive);
        this.sueldo = 40;
        this.contador = contador;
    }

    @Override
    public void run() {
        while (true) {
            trabajar();
            System.out.println("Trabajador: " + " gana: " + this.sueldoTotal + "$");
            descansar();
        }
    }

    @Override
    public void trabajar() {
        while (this.tiempo_Para_Contador != 0) {
            this.viendo_Anime = !viendo_Anime;
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
        this.sueldoTotal = sueldo * 24;
    }
    
    public boolean viendo_anime(){
        return this.viendo_Anime;
    }
}
