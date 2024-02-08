package Utils;

import Utils.Funciones;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sergionx
 */
public class FuncionesSpinner {

    public static void set_Maximum_Spinner(JSpinner[] spinners, int max) {
        int actual_Trabajadores = sumar_Values_Spinner(spinners);
        int new_Maximum = max - actual_Trabajadores;

        for (JSpinner spinner1 : spinners) {
            apply_Maximum(spinner1, new_Maximum);
        }
    }

    private static int sumar_Values_Spinner(JSpinner[] spinners) {
        int result = 0;

        for (JSpinner spinner : spinners) {
            result += (int) spinner.getValue();
        }

        return result;
    }

    private static void apply_Maximum(JSpinner spinner, int max) {
        var model = (SpinnerNumberModel) spinner.getModel();
        model.setMaximum(max + model.getNumber().intValue());
    }
}
