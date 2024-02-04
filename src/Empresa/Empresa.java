/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Trabajadores.Contador;
import Trabajadores.Director;
import Trabajadores.Ensambladores.Ensamblador;
import Trabajadores.Ensambladores.Requerimientos_Capitulo;
import Trabajadores.ProjectManager;
import Trabajadores.TipoTrabajador_Estudio;
import Trabajadores.Trabajador;
import Trabajadores.TrabajadorEstudio;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.concurrent.Semaphore;
import javax.swing.JTextField;

/**
 *
 * @author valeriazampetti
 */
public class Empresa {

    private Trabajador empleados[];
    private ProjectManager manager;
    private Director director;
    private Contador contador;

    private int capitulos_rate;
    private Requerimientos_Capitulo requerimiento_Estandar;
    private Requerimientos_Capitulo requerimiento_PlotTwist;

    private final Ganancias ganancias;

    private final JTextField field_Estandar;
    private final JTextField field_PlotTwist;

    private final int last_carnet;
    public String nombre;
    private final Drive drive;
    private final Semaphore mutex;

    public Empresa(int last_carnet, String nombre,
            JTextField field_Estandar, JTextField field_PlotTwist) {
        this.empleados = new Trabajador[last_carnet + 10];
        this.last_carnet = last_carnet;
        this.nombre = nombre;

        this.field_Estandar = field_Estandar;
        this.field_PlotTwist = field_PlotTwist;

        this.ganancias = new Ganancias();
        this.drive = new Drive(field_Estandar, field_PlotTwist);
        this.mutex = new Semaphore(1);

        this.initalizeEmpresaEspecifica(nombre);
        this.initalizeEmpleados();
    }

    private void initalizeEmpresaEspecifica(String nombre) {
        if (nombre == "Star Channel") {
            this.capitulos_rate = 2;
            this.requerimiento_Estandar = new Requerimientos_Capitulo(2, 3, 4, 6, 0, 350);
            this.requerimiento_PlotTwist = new Requerimientos_Capitulo(2, 3, 4, 6, 3, 800);
        } else {
            this.capitulos_rate = 2;
            this.requerimiento_Estandar = new Requerimientos_Capitulo(1, 1, 2, 4, 0, 250);
            this.requerimiento_PlotTwist = new Requerimientos_Capitulo(1, 1, 2, 4, 3, 600);
        }
    }

    private void initalizeEmpleados() {
        this.manager = new ProjectManager(this.mutex, this.drive, ganancias, this.contador);
        this.director = new Director(this.mutex, this.drive, ganancias, this.contador, this.manager);

        var trabajador = new TrabajadorEstudio(
                TipoTrabajador_Estudio.GUIONISTA, mutex, drive,
                ganancias, last_carnet);

        var trabajdor2 = new TrabajadorEstudio(
                TipoTrabajador_Estudio.ACTOR_DOBLAJE, mutex, drive,
                ganancias, last_carnet);

        var trabajdor3 = new TrabajadorEstudio(
                TipoTrabajador_Estudio.ANIMADOR, mutex, drive,
                ganancias, last_carnet);

        var trabajdor4 = new TrabajadorEstudio(
                TipoTrabajador_Estudio.DISENADOR_ESCENARIO, mutex, drive,
                ganancias, last_carnet);

        var trabajdor5 = new TrabajadorEstudio(
                TipoTrabajador_Estudio.PLOT_TWIST, mutex, drive,
                ganancias, last_carnet);

        var ensamblador = new Ensamblador(mutex, drive, ganancias,
                this.capitulos_rate, requerimiento_Estandar, requerimiento_PlotTwist);
        trabajador.start();
        trabajdor2.start();
        trabajdor3.start();
        trabajdor4.start();
        trabajdor5.start();
        ensamblador.start();

        for (int i = 0; i < empleados.length; i++) {
//            var trabajador = new TrabajadorEstudio(
//                    TipoTrabajador_Estudio.GUIONISTA, mutex, drive,
//                    ganancias, last_carnet);
//            trabajador.start();
//            this.empleados[i] = trabajador;
        }

    }
}
