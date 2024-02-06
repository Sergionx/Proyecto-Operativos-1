/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.clases;

/**
 *
 * @author valeriazampetti
 */
public class Empresa_Trabajadores_Iniciales {
    public int guionista;
    public int disenador_escenario;
    public int animador;
    public int actor_doblaje;
    public int plot_twist;

    public Empresa_Trabajadores_Iniciales(int guionista, int disenador_escenario, int animador, int actor_doblaje, int plot_twist) {
        this.guionista = guionista;
        this.disenador_escenario = disenador_escenario;
        this.animador = animador;
        this.actor_doblaje = actor_doblaje;
        this.plot_twist = plot_twist;
    }
    
    public Empresa_Trabajadores_Iniciales(int [] trabajador) {
        this.guionista = trabajador[0];
        this.disenador_escenario= trabajador[1];
        this.animador= trabajador[2];
        this.actor_doblaje= trabajador[3];
        this.plot_twist= trabajador[4];
    }
        
        
       
    
    
}
