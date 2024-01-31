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
    private Contador contador;
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
        try {
            if (this.tiempo_Para_Contador == 0) {
                this.contador.dias_faltantes -= 1;
                sleep(Constants.HOUR_DURATION * 8);
            } else {
                this.viendo_Anime = !viendo_Anime;
                sleep(Constants.MINUTE_DURATION * 30);
                this.tiempo_Para_Contador -= 1;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void descansar() {
        
    }
}
