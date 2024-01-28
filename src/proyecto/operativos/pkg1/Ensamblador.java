/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.operativos.pkg1;

import Empresa.Drive;
import Trabajadores.Trabajador;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Sergionx
 */
public class Ensamblador extends Trabajador {

    private int capitulos_rate;
    private int capitulos_Para_PlotTwist;
    private Requerimientos_Capitulo requerimientos_Estandar;
    private Requerimientos_Capitulo requerimientos_Plot;

    public Ensamblador(Semaphore mutex, Drive drive, int capitulos_rate, Requerimientos_Capitulo requerimientos, Requerimientos_Capitulo requerimientos_Plot) {
        super(mutex, drive);
        this.capitulos_rate = capitulos_rate;
        this.capitulos_Para_PlotTwist = 0;
        this.requerimientos_Estandar = requerimientos;
        this.requerimientos_Plot = requerimientos_Plot;
    }

    @Override
    public void trabajar() {
        if (capitulos_Para_PlotTwist == capitulos_rate - 1) {
            subirCapitulo(true);
        } else {
            subirCapitulo(false);
            this.capitulos_Para_PlotTwist++;
        }
    }

    public void subirCapitulo(boolean plotTwist) {
        if (plotTwist) {
            if (!requerimientos_Plot.cumplirRequerimientos(drive)) {
                return;
            }
            
//            TODO - Subir capitulo
        } else {
            if (!requerimientos_Estandar.cumplirRequerimientos(drive)) {
                return;
            }
            //            TODO - Subir capitulo

            
        }
    }
}
