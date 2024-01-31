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

/**
 *
 * @author Sergionx
 */
public abstract class Trabajador extends Thread {

    protected int sueldo;
    protected float sueldoTotal;
    private Semaphore mutex;
    protected Drive drive;

    public Trabajador(Semaphore mutex, Drive drive) {
        this.sueldoTotal = 0;
        this.mutex = mutex;
        this.drive = drive;
    }

    @Override
    public void run() {
        while (true) {
            trabajar();
            System.out.println("Trabajador: " + " gana: " + this.sueldoTotal + "$");
            descansar();
        }
    }

    public abstract void descansar();

    public abstract void trabajar();

}
