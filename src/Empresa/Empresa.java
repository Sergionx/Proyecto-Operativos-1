/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Trabajadores.Contador;
import Trabajadores.Director;
import Trabajadores.ProjectManager;
import Trabajadores.TipoTrabajador_Estudio;
import Trabajadores.Trabajador;
import Trabajadores.TrabajadorEstudio;
import java.util.concurrent.Semaphore;

/**
 *
 * @author valeriazampetti
 */
public class Empresa {

    private Trabajador empleados[];
    private ProjectManager manager;
    private Director director;
    private Contador contador;

    private final Ganancias ganancias;

    private final int last_carnet;
    public String nombre;
    private final Drive drive;
    private final Semaphore mutex;

    public Empresa(int last_carnet, String nombre) {
        this.empleados = new Trabajador[last_carnet + 10];
        this.last_carnet = last_carnet;
        this.nombre = nombre;

        this.ganancias = new Ganancias();
        this.drive = new Drive();
        this.mutex = new Semaphore(1);

        this.initalizeEmpleados();
    }

    private void initalizeEmpleados() {
        this.manager = new ProjectManager(this.mutex, this.drive, ganancias, this.contador);
        this.director = new Director(this.mutex, this.drive, ganancias, this.contador, this.manager);

        var trabajador = new TrabajadorEstudio(
                TipoTrabajador_Estudio.GUIONISTA, mutex, drive,
                ganancias, last_carnet);
        trabajador.start();
        for (int i = 0; i < empleados.length; i++) {
//            var trabajador = new TrabajadorEstudio(
//                    TipoTrabajador_Estudio.GUIONISTA, mutex, drive,
//                    ganancias, last_carnet);
//            trabajador.start();
//            this.empleados[i] = trabajador;
        }

    }

    public int getCapitulosListos(boolean isPlotTwist) {
        if (isPlotTwist) {
            return this.drive.capitulos_PlotTwist;
        } else {
            return this.drive.capitulos_Estandar;
        }
    }
}
