/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;
import Utils.Constants;
import Empresa.Drive;
import Empresa.Ganancias;

/**
 *
 * @author Sergionx
 */
public abstract class Trabajador extends Thread {

    protected int sueldo;
    private int sueldoTotal;
    protected final Semaphore mutex;
    protected Drive drive;
    private final Ganancias ganancias;

    public Trabajador(Semaphore mutex, Drive drive, Ganancias ganancias) {
        this.sueldoTotal = 0;
        this.mutex = mutex;
        this.drive = drive;
        this.ganancias = ganancias;
    }

    @Override
    public void run() {
        while (true) {
            trabajar();
            descansar();
        }
    }

    public void pagarSueldo(int cantidad){
        this.sueldoTotal += cantidad;
        this.ganancias.costos_Operativos += cantidad;
    }
    
    public void descontarSueldo(int cantidad){
        this.sueldoTotal -= cantidad;
        this.ganancias.costos_Operativos -= cantidad;
    }
    
    public abstract void descansar();

    public abstract void trabajar();

}
