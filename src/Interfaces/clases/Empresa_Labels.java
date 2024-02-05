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
public class Empresa_Labels {

    public final Drive_Labels drive_Labels;
    public final JTextField field_Viendo_Anime;
    public final JTextField field_Contador;
    public final JTextField field_vigilando;

    public Empresa_Labels(Drive_Labels drive_Labels, 
            JTextField field_Viendo_Anime, JTextField field_vigilando, JTextField field_Contador) {
        this.drive_Labels = drive_Labels;
        this.field_Viendo_Anime = field_Viendo_Anime;
        this.field_vigilando= field_vigilando;
        this.field_Contador = field_Contador;
    }

}
