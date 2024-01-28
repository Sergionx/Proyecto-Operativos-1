/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import Trabajadores.Trabajador;
import Trabajadores.TipoTrabajador_Estudio;
import java.util.concurrent.Semaphore;
import Empresa.Drive;

/**
 *
 * @author Sergionx
 */
public class TrabajadorEstudio extends Trabajador {

    private int working_rate;
    private TipoTrabajador_Estudio tipo;

    public TrabajadorEstudio(int last_carnet, TipoTrabajador_Estudio tipo, Semaphore mutex, Drive drive) {
        super(mutex, drive);
        this.tipo = tipo;
        this.asignarSueldo(tipo);
        this.asignarWorkingRate(tipo, last_carnet);
    }

    private void asignarSueldo(TipoTrabajador_Estudio tipo) {
        if (null != tipo) {
            switch (tipo) {
                case GUIONISTA:
                    this.sueldo = 20;
                    break;
                case DISENADOR_ESCENARIO:
                    this.sueldo = 26;
                    break;
                case ANIMADOR:
                    this.sueldo = 40;
                    break;
                case ACTOR_DOBLAJE:
                    this.sueldo = 16;
                    break;
                case PLOT_TWIST:
                    this.sueldo = 34;
                    break;
                default:
                    break;
            }
        }
    }

    private void asignarWorkingRate(TipoTrabajador_Estudio tipo, int last_carnet) {
        if (null != tipo) {
            switch (tipo) {
                case GUIONISTA:
                    this.working_rate = 2 + last_carnet == 9 ? 2 : last_carnet / 3;
                    break;
                case DISENADOR_ESCENARIO:
                    this.working_rate = 2 + last_carnet == 9 ? 2 : last_carnet / 3;
                    break;
                case ANIMADOR:
                    this.working_rate = 3 - last_carnet == 9 ? 1 : last_carnet / 3;
                    break;
                case ACTOR_DOBLAJE:
                    this.working_rate = last_carnet < 5 ? 3 : 5;
                    break;
                case PLOT_TWIST:
                    this.working_rate = last_carnet < 5 ? 3 : 2;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void trabajar() {
        this.drive.SubirDrive(tipo);
    }

}
