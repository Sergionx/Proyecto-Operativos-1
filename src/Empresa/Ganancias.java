/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Interfaces.clases.Ganancias_Labels;

/**
 *
 * @author Sergionx
 */
public class Ganancias {

    private int ganancias_Bruto;
    private int costos_Operativos;
    private int utilidad_Total;

    public final Ganancias_Labels labels;

    public Ganancias(Ganancias_Labels labels) {
        this.labels = labels;

        this.setCostos_Operativos(0);
        this.setGanancias_Bruto(0);
    }

    public void setGanancias_Bruto(int ganancias_Bruto) {
        this.ganancias_Bruto += ganancias_Bruto * 1000;
        this.labels.field_ganancias.setText(this.ganancias_Bruto + "$");
        this.setUtilidad_Total();
    }

    public void setCostos_Operativos(int costos_Operativos) {
        this.costos_Operativos += costos_Operativos;
        this.labels.field_costos.setText(-this.costos_Operativos + "$");
        this.setUtilidad_Total();
    }

    private void setUtilidad_Total() {
        this.utilidad_Total = ganancias_Bruto - costos_Operativos;
        this.labels.field_utilidades.setText(this.utilidad_Total + "$");
    }

    public int getUtilidad_Total() {
        return utilidad_Total;
    }
}
