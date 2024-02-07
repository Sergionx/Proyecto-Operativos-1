/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Sergionx
 */
public class Contador {

    private final int duracion;
    private int dias_Faltantes;
    private int dia_Real;

    public final JTextField field_Contador;

    public Contador(JTextField field_Contador) {
        this.field_Contador = field_Contador;
        this.duracion = leerTxt();
        this.setDias_faltantes(this.duracion);
    }

    private int leerTxt() {
//        TODO - Logica para leer txt
        return 2;
    }

    public void siguiente_Dia() {
        System.out.println("SIGUIENTE DIA");
        this.setDias_faltantes(dias_Faltantes - 1);
        this.dia_Real++;
    }

//    Review pensar mejor nombre
    public boolean finalizo() {
        return this.dias_Faltantes == 0;
    }

    public void reset() {
        this.setDias_faltantes(this.duracion);
        this.dia_Real++;
    }

    public void setDias_faltantes(int dias_faltantes) {
        this.dias_Faltantes = dias_faltantes;

        this.field_Contador.setText("" + this.dias_Faltantes);

        if (this.dias_Faltantes < 1) {
            this.field_Contador.setBackground(Color.red);
        } else if (this.dias_Faltantes < 3) {
            this.field_Contador.setBackground(Color.yellow);
        } else {
            this.field_Contador.setBackground(Color.green);
        }
    }

    public int get_Dia_Real() {
        return this.dia_Real;
    }
}
