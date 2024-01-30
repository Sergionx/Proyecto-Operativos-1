/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Trabajadores.Trabajador;
import java.util.concurrent.Semaphore;

/**
 *
 * @author valeriazampetti
 */
public class Empresa {
    private Trabajador empleados[];
    private int last_carnet;
    private String nombre;
    private Drive drive;
    private Semaphore mutex;
    
    public Empresa(Trabajador[] empleados, int last_carnet, String nombre, Drive drive, Semaphore mutex) {
        this.empleados = empleados;
        this.last_carnet = last_carnet;
        this.nombre = nombre;
        this.drive = drive;
        this.mutex = mutex;
    }
    
    
    
    
}
