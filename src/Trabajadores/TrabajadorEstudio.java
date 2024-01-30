/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import java.util.concurrent.Semaphore;
import Empresa.Drive;
import Utils.Constants;
import static java.lang.Thread.sleep;

/**
 *
 * @author Sergionx
 */
public class TrabajadorEstudio extends Trabajador {

    private int working_rate;
    private TipoTrabajador_Estudio tipo;

    public TrabajadorEstudio(TipoTrabajador_Estudio tipo, Semaphore mutex, Drive drive, int last_carnet) {
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
                    this.working_rate = 3 - last_carnet == 9 ? 2 : last_carnet / 3;
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

    /**
     * Solo los animadores y dobaladores completan su trabajo en menos de un día
     */
    @Override
    public void trabajar() {
        if (tipo == TipoTrabajador_Estudio.ANIMADOR || tipo == TipoTrabajador_Estudio.ACTOR_DOBLAJE) {
            this.drive.SubirDrive(tipo, this.working_rate);
        } else {
            this.drive.SubirDrive(tipo);
        }

    }

    /**
     * Solo los animadores y dobaladores completan su trabajo en menos de un día
     */
    public void descansar() {
        if (tipo == TipoTrabajador_Estudio.ANIMADOR || tipo == TipoTrabajador_Estudio.ACTOR_DOBLAJE) {
            sleep(Constants.DAY_DURATION);
        } else {
            sleep(Constants.DAY_DURATION * working_rate);
        }

    }

}
