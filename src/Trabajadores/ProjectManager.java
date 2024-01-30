/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import Empresa.Drive;
import java.util.concurrent.Semaphore;

/**
 *
 * @author valeriazampetti
 */
public class ProjectManager extends Trabajador {
    
    private boolean viendo_Anime= false;
    private int contador;
    

    public ProjectManager(Semaphore mutex, Drive drive) {
        super(mutex, drive);
        this.sueldo=40;
        
    }

    @Override
    public void trabajar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void descansar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
