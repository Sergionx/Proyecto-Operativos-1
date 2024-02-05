/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores.Ensambladores;

import Empresa.Drive;

/**
 *
 * @author Sergionx
 */
public class Requerimientos_Capitulo {

    public int guiones;
    public int escenarios;
    public int animaciones;
    public int doblajes;
    public int plotTwists;

    public int ganancia;

    public Requerimientos_Capitulo(int guiones, int escenarios, int animaciones,
            int doblajes, int plotTwists, int ganancia) {
        this.guiones = guiones;
        this.escenarios = escenarios;
        this.animaciones = animaciones;
        this.doblajes = doblajes;
        this.plotTwists = plotTwists;
        this.ganancia = ganancia * 1000;
    }

    @Override
    public String toString() {
        return "Requerimientos_Capitulo{" + "guiones=" + guiones + ", escenarios=" + escenarios + ", animaciones=" + animaciones + ", doblajes=" + doblajes + ", plotTwists=" + plotTwists + '}';
    }

    public boolean cumplirRequerimientos(Drive drive) {
        return !(this.guiones > drive.guiones
                || this.escenarios > drive.escenarios
                || this.animaciones > drive.animaciones
                || this.doblajes > drive.doblajes
                || (this.plotTwists != 0 && this.plotTwists > drive.plot_twist));
    }

}
