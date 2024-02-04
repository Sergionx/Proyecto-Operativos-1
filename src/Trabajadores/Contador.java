/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajadores;

/**
 *
 * @author Sergionx
 */
public class Contador {

    private final int duracion;
    private int dias_faltantes;

    public Contador() {
        this.dias_faltantes = this.duracion = leerTxt();
    }

    private int leerTxt() {
//        TODO - Logica para leer txt
        return 1;
    }

     public void siguiente_Dia(){
         this.dias_faltantes--;
     }
    
//    Review pensar mejor nombre
    public boolean finalizo() {
        return this.dias_faltantes == 0;
    }

    public void reset() {
        this.dias_faltantes = this.duracion;
    }
}
