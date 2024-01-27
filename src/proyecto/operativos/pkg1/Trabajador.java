/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.operativos.pkg1;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Sergionx
 */
public abstract class Trabajador extends Thread {
    protected int sueldo;
    private float salaryAcc;
    private Semaphore mutex;    
    private Drive drive;


    public Trabajador(Semaphore mutex, Drive drive) {
        this.salaryAcc = 0;
        this.mutex = mutex;
        this.drive = drive;
    }
    
    @Override
    public void run(){
        while(true) {
            try {
                trabajar();
                System.out.println("Trabajador: " + " gana: "+this.salaryAcc+"$");
                sleep(Constants.DAY_DURATION);
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public abstract void trabajar(
// TODO - Codigo para cobrar dinero
    );
    
}
