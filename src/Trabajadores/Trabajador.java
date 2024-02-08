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

    protected final Semaphore mutex_Drive;
    protected final Semaphore mutex_Ganancias;

    protected Drive drive;
    private final Ganancias ganancias;

    public Trabajador(Semaphore mutex_Drive, Semaphore mutex_Ganancias, Drive drive, Ganancias ganancias) {
        this.sueldoTotal = 0;
        this.mutex_Drive = mutex_Drive;
        this.mutex_Ganancias = mutex_Ganancias;
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

    public void pagarSueldo(int cantidad) {
        try {
            this.mutex_Ganancias.acquire();
            this.sueldoTotal += cantidad;
            this.ganancias.setCostos_Operativos(cantidad);
            this.mutex_Ganancias.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void descontarSueldo(int cantidad) {
        try {
            this.mutex_Ganancias.acquire();
            this.sueldoTotal -= cantidad;
            this.ganancias.setCostos_Operativos(-cantidad);
            this.mutex_Ganancias.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public abstract void descansar();

    public abstract void trabajar();

}
