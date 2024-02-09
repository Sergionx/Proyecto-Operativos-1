/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

import Empresa.Empresa;
import Empresa.GraficoEmpresa;
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

    private final Empresa empresa;
    private final GraficoEmpresa funcionesGrafico;

    public Contador(JTextField field_Contador, GraficoEmpresa funcionesGrafico,
            Empresa empresa, int duracion) {
        this.field_Contador = field_Contador;

        this.empresa = empresa;
        this.funcionesGrafico = funcionesGrafico;

        this.duracion = duracion;
        this.setDias_faltantes(this.duracion);
    }

    public void siguiente_Dia() {
        System.out.println("SIGUIENTE DIA \n \n");
        this.setDias_faltantes(dias_Faltantes - 1);
        this.dia_Real++;

        this.empresa.registrarUtilidades(dia_Real, 0);
        this.funcionesGrafico.crearGrafico();
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
