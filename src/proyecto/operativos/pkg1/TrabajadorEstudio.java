/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.operativos.pkg1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Sergionx
 */
public class TrabajadorEstudio extends Trabajador {

    private int working_rate;
    private TipoTrabajador_Estudio tipo;

    public TrabajadorEstudio(TipoTrabajador_Estudio tipo, Semaphore mutex, Drive drive) {
        super(mutex, drive);
        this.tipo = tipo;
        this.asignarSueldo(tipo);
    }
  

    private void asignarSueldo(TipoTrabajador_Estudio tipo) {
        if (null != tipo) switch (tipo) {
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

    @Override
    public void trabajar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
