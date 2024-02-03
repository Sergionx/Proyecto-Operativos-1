/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Trabajadores.Ensambladores.Requerimientos_Capitulo;
import Trabajadores.TipoTrabajador_Estudio;

/**
 *
 * @author Sergionx
 */
public class Drive {

    public static final int GUIONES_MAX = 25;
    public static final int ESCENARIOS_MAX = 20;
    public static final int ANIMACIONES_MAX = 55;
    public static final int DOBLAJES_MAX = 35;
    public static final int PLOT_TWIST_MAX = 10;

    public int guiones;
    public int escenarios;
    public int animaciones;
    public int doblajes;
    public int plot_twist;
    
    public int capitulos;

    public Drive() {
        this.guiones = 0;
        this.escenarios = 0;
        this.animaciones = 0;
        this.doblajes = 0;
        this.plot_twist = 0;
        this.capitulos = 0;
    }

    public void SubirDrive(TipoTrabajador_Estudio tipo) {
        SubirDrive(tipo, 1);
    }
    
     public void SubirDrive(TipoTrabajador_Estudio tipo, int cantidad) {
        switch (tipo) {
            case GUIONISTA -> {
                if (this.guiones < GUIONES_MAX) {
                    this.guiones += cantidad;
                }
            }

            case DISENADOR_ESCENARIO -> {
                if (this.escenarios < ESCENARIOS_MAX) {
                    this.escenarios += cantidad;;
                }
            }

            case ANIMADOR -> {
                if (this.animaciones < ANIMACIONES_MAX) {
                    this.animaciones += cantidad;
                }
            }
            case ACTOR_DOBLAJE -> {
                if (this.doblajes < DOBLAJES_MAX) {
                    this.doblajes += cantidad;
                }
            }

            case PLOT_TWIST -> {
                if (this.plot_twist < PLOT_TWIST_MAX) {
                    this.plot_twist += cantidad;
                }
            }
            default ->
                throw new AssertionError(tipo.name());
        }
    }
    
    public void SubirCapitulo(Requerimientos_Capitulo requerimientos){
        this.guiones-= requerimientos.guiones;
        this.doblajes -= requerimientos.doblajes;
        this.animaciones -= requerimientos.animaciones;
        this.escenarios -= requerimientos.escenarios;
        this.plot_twist -= requerimientos.plotTwists;
        this.capitulos ++;
     
        
    }

}
