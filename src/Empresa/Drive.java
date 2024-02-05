/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Interfaces.clases.Drive_Labels;
import Trabajadores.Ensambladores.Requerimientos_Capitulo;
import Trabajadores.TipoTrabajador_Estudio;
import javax.swing.JTextField;

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

    private final Drive_Labels labels;

    public int guiones;
    public int escenarios;
    public int animaciones;
    public int doblajes;
    public int plot_twist;

    private int capitulos_Estandar;
    private int capitulos_PlotTwist;

    public Drive(Drive_Labels labels) {
        this.guiones = 0;
        this.escenarios = 0;
        this.animaciones = 0;
        this.doblajes = 0;
        this.plot_twist = 0;
        this.capitulos_Estandar = 0;
        this.capitulos_PlotTwist = 0;

        this.labels = labels;
    }

    public void SubirDrive(TipoTrabajador_Estudio tipo) {
        SubirDrive(tipo, 1);
    }

    @Override
    public String toString() {
        return "Drive{" + "guiones=" + guiones + ", escenarios=" + escenarios + ", animaciones=" + animaciones + ", doblajes=" + doblajes + ", plot_twist=" + plot_twist + ", capitulos_Estandar=" + capitulos_Estandar + ", capitulos_PlotTwist=" + capitulos_PlotTwist + '}';
    }

    public void SubirDrive(TipoTrabajador_Estudio tipo, int cantidad) {
        switch (tipo) {
            case GUIONISTA -> {
                if (this.guiones < GUIONES_MAX) {
                    this.setGuiones(guiones + cantidad);
                }
            }

            case DISENADOR_ESCENARIO -> {
                if (this.escenarios < ESCENARIOS_MAX) {
                    this.setEscenarios(escenarios + cantidad);
                }
            }

            case ANIMADOR -> {
                if (this.animaciones < ANIMACIONES_MAX) {
                    this.setAnimaciones(animaciones + cantidad);
                }
            }
            case ACTOR_DOBLAJE -> {
                if (this.doblajes < DOBLAJES_MAX) {
                    this.setDoblajes(doblajes + cantidad);
                }
            }

            case PLOT_TWIST -> {
                if (this.plot_twist < PLOT_TWIST_MAX) {
                    this.setPlot_twist(plot_twist + cantidad);
                }
            }
            default ->
                throw new AssertionError(tipo.name());
        }
    }

    public void SubirCapitulo(Requerimientos_Capitulo requerimientos, boolean isPlotTwist) {
        this.guiones -= requerimientos.guiones;
        this.doblajes -= requerimientos.doblajes;
        this.animaciones -= requerimientos.animaciones;
        this.escenarios -= requerimientos.escenarios;
        this.plot_twist -= requerimientos.plotTwists;

        System.out.println("capitulo subiendo");
        if (isPlotTwist) {
            this.setCapitulos_PlotTwist(capitulos_PlotTwist + 1);
        } else {
            this.setCapitulos_Estandar(capitulos_Estandar + 1);

        }
    }

    public void setCapitulos_Estandar(int capitulos_Estandar) {
        this.capitulos_Estandar = capitulos_Estandar;
        System.out.println("CAPITULO ESTANDAR" + capitulos_Estandar);
        this.labels.field_Estandar.setText("" + this.capitulos_Estandar);
    }

    public void setCapitulos_PlotTwist(int capitulos_PlotTwist) {
        this.capitulos_PlotTwist = capitulos_PlotTwist;
        this.labels.field_PlotTwist.setText("" + this.capitulos_PlotTwist);
    }

    public void setGuiones(int guiones) {
        this.guiones = guiones;
        this.labels.field_Guiones_actual.setText("" + this.guiones);
    }

    public void setEscenarios(int escenarios) {
        this.escenarios = escenarios;
        this.labels.field_Escenarios_actual.setText("" + this.escenarios);
    }

    public void setAnimaciones(int animaciones) {
        this.animaciones = animaciones;
        this.labels.field_Animaciones_actual.setText("" + this.animaciones);
    }

    public void setDoblajes(int doblajes) {
        this.doblajes = doblajes;
        this.labels.field_Doblajes_actual.setText("" + this.doblajes);
    }

    public void setPlot_twist(int plot_twist) {
        this.plot_twist = plot_twist;
        this.labels.field_PlotTwist_actual.setText("" + this.escenarios);
    }
}
