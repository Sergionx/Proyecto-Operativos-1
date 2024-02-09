/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.clases;

/**
 *
 * @author valeriazampetti
 */
public class Empresa_Trabajadores {

    public int guionista;
    public int disenador_escenario;
    public int animador;
    public int actor_doblaje;
    public int plot_twist;
    public int ensamblador;

    public Empresa_Trabajadores() {
        this.guionista = 0;
        this.disenador_escenario = 0;
        this.animador = 0;
        this.actor_doblaje = 0;
        this.plot_twist = 0;
        this.ensamblador = 0;
    }

    public Empresa_Trabajadores(int[] trabajador) {
        this.guionista = trabajador[0];
        this.disenador_escenario = trabajador[1];
        this.animador = trabajador[2];
        this.actor_doblaje = trabajador[3];
        this.plot_twist = trabajador[4];
        this.ensamblador = trabajador[5];

    }

    @Override
    public String toString() {
        return this.guionista + "," + this.animador + "," + this.actor_doblaje 
                + "," + this.disenador_escenario + "," + this.plot_twist
                + "," + this.ensamblador;
    }

}
