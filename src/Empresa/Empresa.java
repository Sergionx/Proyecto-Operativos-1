/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Interfaces.clases.Empresa_Labels;
import Interfaces.clases.Empresa_Trabajadores_Iniciales;
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
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private final Empresa_Labels empresa_Labels;

    private final int last_carnet;
    public String nombre;
    private final Drive drive;

    private final Semaphore mutex_Drive;
    private final Semaphore mutex_Ganancias;

    private final int[] utilidades_En_El_Tiempo;

    public Empresa(int last_carnet, String nombre,
            Empresa_Labels empresa_Labels,
            Empresa_Trabajadores_Iniciales trabajadores_Iniciales,
            int[] ganancias_Daily, GraficoEmpresa funcionesGrafico,
            int contador_Duracion) {
        this.empleados = new Trabajador[last_carnet + 10];
        this.last_carnet = last_carnet;
        this.nombre = nombre;

        this.empresa_Labels = empresa_Labels;

        this.ganancias = new Ganancias(empresa_Labels.ganancias_Labels);
        this.contador = new Contador(this.empresa_Labels.field_Contador,
                funcionesGrafico, this, contador_Duracion);
        this.drive = new Drive(empresa_Labels.drive_Labels);
        this.mutex_Drive = new Semaphore(1);
        this.mutex_Ganancias = new Semaphore(1);

        this.utilidades_En_El_Tiempo = ganancias_Daily;

        System.out.println(trabajadores_Iniciales);
        this.initalizeEmpresaEspecifica(nombre);
        this.initalizeEmpleados(trabajadores_Iniciales);

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

    public void registrarUtilidades(int day, int ganancias) {
        try {
            this.mutex_Ganancias.acquire();
            this.ganancias.setGanancias_Bruto(ganancias);

            this.utilidades_En_El_Tiempo[day] = this.ganancias.getUtilidad_Total();

            this.mutex_Ganancias.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void initalizeEmpleados(Empresa_Trabajadores_Iniciales trabajadores_Iniciales) {
        this.manager = new ProjectManager(this.mutex_Drive, this.mutex_Ganancias,
                this.drive, ganancias,
                this.contador, this.empresa_Labels.field_Viendo_Anime,
                this.empresa_Labels.field_faltasPM, this.empresa_Labels.field_DescontadoPM
        );
        this.director = new Director(this.mutex_Drive, this.mutex_Ganancias,
                this.drive, this, ganancias,
                this.contador, this.manager, this.empresa_Labels.field_vigilando);

        int comienzoFor = 0;

        this.crearEmpleados(comienzoFor, trabajadores_Iniciales.guionista,
                TipoTrabajador_Estudio.GUIONISTA);
        comienzoFor += trabajadores_Iniciales.guionista;

        this.crearEmpleados(comienzoFor, trabajadores_Iniciales.actor_doblaje,
                TipoTrabajador_Estudio.ACTOR_DOBLAJE);
        comienzoFor += trabajadores_Iniciales.actor_doblaje;

        this.crearEmpleados(comienzoFor, trabajadores_Iniciales.animador,
                TipoTrabajador_Estudio.ANIMADOR);
        comienzoFor += trabajadores_Iniciales.animador;

        this.crearEmpleados(comienzoFor, trabajadores_Iniciales.disenador_escenario,
                TipoTrabajador_Estudio.DISENADOR_ESCENARIO);
        comienzoFor += trabajadores_Iniciales.disenador_escenario;

        this.crearEmpleados(comienzoFor, trabajadores_Iniciales.plot_twist,
                TipoTrabajador_Estudio.PLOT_TWIST);

//        TODO - Pensar si esto es dinamico tambiern
        var ensamblador = new Ensamblador(mutex_Drive, this.mutex_Ganancias,
                drive, ganancias,
                this.capitulos_rate, requerimiento_Estandar, requerimiento_PlotTwist);

        ensamblador.start();

        this.manager.start();
        this.director.start();
    }

    private void crearEmpleados(int comienzo, int cantidad, TipoTrabajador_Estudio tipo) {
        for (int i = comienzo; i < comienzo + cantidad; i++) {
            var trabajador = new TrabajadorEstudio(
                    tipo, mutex_Drive, this.mutex_Ganancias, drive, ganancias, last_carnet);
            this.empleados[i] = trabajador;
            trabajador.start();
        }
    }

    public int[] getUtilidades_En_El_Tiempo() {
        return utilidades_En_El_Tiempo;
    }

}
