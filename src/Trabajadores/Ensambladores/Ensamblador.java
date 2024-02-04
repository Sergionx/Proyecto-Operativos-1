/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores.Ensambladores;

import Empresa.Drive;
import Empresa.Ganancias;
import Trabajadores.Trabajador;
import Utils.Constants;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergionx
 */
public class Ensamblador extends Trabajador {

    private int capitulos_rate;
    private int capitulos_Para_PlotTwist;
    private Requerimientos_Capitulo requerimientos_Estandar;
    private Requerimientos_Capitulo requerimientos_Plot;

    public Ensamblador(Semaphore mutex, Drive drive, Ganancias ganancias, int capitulos_rate, Requerimientos_Capitulo requerimientos, Requerimientos_Capitulo requerimientos_Plot) {
        super(mutex, drive, ganancias);
        this.capitulos_rate = capitulos_rate;
        this.capitulos_Para_PlotTwist = 0;
        this.requerimientos_Estandar = requerimientos;
        this.requerimientos_Plot = requerimientos_Plot;
        this.sueldo = 50;
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
            if (requerimientos_Plot.cumplirRequerimientos(drive)) {
                this.drive.SubirCapitulo(requerimientos_Plot, plotTwist);
            }
        } else {
            if (requerimientos_Estandar.cumplirRequerimientos(drive)) {
                this.drive.SubirCapitulo(requerimientos_Estandar, plotTwist);
            }

        }
    }

    @Override
    public void descansar() {
        try {
            this.pagarSueldo(sueldo * 24 * 2);
            sleep(Constants.DAY_DURATION * 2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
