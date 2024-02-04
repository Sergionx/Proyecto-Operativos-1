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
public class Drive_Labels {
    public final JTextField field_Estandar;
    public final JTextField field_PlotTwist;
    
    public final JTextField field_Guiones_actual;
    public final JTextField field_Doblajes_actual;
    public final JTextField field_Escenarios_actual;
    public final JTextField field_Animaciones_actual;
    public final JTextField field_PlotTwist_actual;

    public Drive_Labels(JTextField field_Estandar, JTextField field_PlotTwist, JTextField field_Guiones_actual, JTextField field_Doblajes_actual, JTextField field_Escenarios_actual, JTextField field_Animaciones_actual, JTextField field_PlotTwist_actual) {
        this.field_Estandar = field_Estandar;
        this.field_PlotTwist = field_PlotTwist;
        this.field_Guiones_actual = field_Guiones_actual;
        this.field_Doblajes_actual = field_Doblajes_actual;
        this.field_Escenarios_actual = field_Escenarios_actual;
        this.field_Animaciones_actual = field_Animaciones_actual;
        this.field_PlotTwist_actual = field_PlotTwist_actual;
    }
}
