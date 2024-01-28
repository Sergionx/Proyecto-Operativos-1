/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.operativos.pkg1;

import Empresa.Drive;

/**
 *
 * @author Sergionx
 */
public class Requerimientos_Capitulo {

    private int guiones;
    private int escenarios;
    private int animaciones;
    private int doblajes;
    private int plotTwists;

    public Requerimientos_Capitulo(int guiones, int escenarios, int animaciones, int doblajes, int plotTwists) {
        this.guiones = guiones;
        this.escenarios = escenarios;
        this.animaciones = animaciones;
        this.doblajes = doblajes;
        this.plotTwists = plotTwists;
    }

    public boolean cumplirRequerimientos(Drive drive) {
        return !(this.guiones < drive.guiones
                || this.escenarios < drive.escenarios
                || this.animaciones < drive.animaciones
                || this.doblajes < drive.doblajes
                || this.plotTwists < drive.plot_twist);
    }

}
