/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.clases;

import javax.swing.JTextField;

/**
 *
 * @author Sergionx
 */
public class Ganancias_Labels {

    public final JTextField field_ganancias;
    public final JTextField field_costos;
    public final JTextField field_utilidades;

    public Ganancias_Labels(JTextField field_ganancias, JTextField field_costos, JTextField field_utilidades) {
        this.field_ganancias = field_ganancias;
        this.field_costos = field_costos;
        this.field_utilidades = field_utilidades;
    }
}