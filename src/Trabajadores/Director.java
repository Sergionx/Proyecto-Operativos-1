/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import Empresa.Drive;
import java.util.concurrent.Semaphore;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import Utils.Constants;
import java.util.Random;

/**
 *
 * @author valeriazampetti
 */
public class Director extends Trabajador {
    
    private final Contador contador;
    private final ProjectManager projectmanager;
    
    public Director(Semaphore mutex, Drive drive, Contador contador, ProjectManager projectmanager) {
        super(mutex, drive);
        this.sueldo = 60;
        this.contador = contador;
        this.projectmanager = projectmanager;
    }
    
    @Override
    public void run() {
        while (true) {
            trabajar();
            System.out.println("Trabajador: " + " gana: " + this.sueldoTotal + "$");
        }
    }
    
    @Override
    public void descansar() {
        try {
            sleep(Constants.HOUR_DURATION * 24);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void trabajar() {
        if (this.contador.finalizo()) {
            this.enviarCapitulos();
        } else {
            this.trabajar_administrativo();
        }
    }
    
    private void enviarCapitulos() {
        this.descansar();
        this.sueldoTotal = sueldo * 24;
        this.contador.reset();
//        ENviarcapitulos al drive

    }
    
    private void trabajar_administrativo() {
        var randomHour = this.chooseRandomHour();
        try {
            sleep(Constants.HOUR_DURATION * randomHour);
            comenzarVigilancia();
            var descanso_Restante = Constants.HOUR_DURATION * (24 - randomHour)
                    - Constants.MINUTE_DURATION * 35;
            sleep(descanso_Restante);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.sueldoTotal = sueldo * 24;
        
    }
    
    private void comenzarVigilancia() {
        try {
            int tiempo_chequeo = 35;
            while (tiempo_chequeo != 0) {
                this.vigilar_ProjectManager();
                
                sleep(Constants.MINUTE_DURATION);
                tiempo_chequeo--;
                
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void vigilar_ProjectManager() {
        if (this.projectmanager.viendo_anime()) {
            this.projectmanager.sueldoTotal -= 100;
        }
    }

    /**
     * @return A number between 0 and 23
     */
    private int chooseRandomHour() {
        var rand = new Random();
        
        return rand.nextInt(23);
    }
    
}
