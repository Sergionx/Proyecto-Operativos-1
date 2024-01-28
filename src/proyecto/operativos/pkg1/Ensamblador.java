/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.operativos.pkg1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Sergionx
 */
public class Ensamblador extends Trabajador {
    private int capitulos_rate;
    private int capitulos_Para_PlotTwist;

    public Ensamblador(Semaphore mutex, Drive drive, int capitulos_rate) {
        super(mutex, drive);
        this.capitulos_rate = capitulos_rate;
        this.capitulos_Para_PlotTwist = 0;
    }
    
    @Override
    public void trabajar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
