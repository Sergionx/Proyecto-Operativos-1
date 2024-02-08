/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Interfaces.clases.Empresa_Trabajadores_Iniciales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author valeriazampetti
 */
public class Funciones {

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static int Leer_txt_Int(String path) {
        int num = 0;
        String line;
        File file = new File(path);

        try {
            if (!file.exists()) {
                file.createNewFile();

            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    String numeroBueno = line.strip();
                    if (isNumeric(numeroBueno)) {
                        num = Integer.parseInt(numeroBueno);
                    }
                }
                br.close();

            }
            JOptionPane.showMessageDialog(null, "ÉXITO AL LEER! ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ÉRROR AL LEER! ");
        }

        return num;
    }

    public static Empresa_Trabajadores_Iniciales[] Leer_txt_trabajadores(String path) {
        String line;
        String info = "";
        File file = new File(path);

        try {
            if (!file.exists()) {
                file.createNewFile();
                return new Empresa_Trabajadores_Iniciales[2];
            }
            FileReader fr = new FileReader(file);
            LineNumberReader lineaReader = new LineNumberReader(fr);
            BufferedReader br = new BufferedReader(fr);

            var trabajadores_Iniciales = new Empresa_Trabajadores_Iniciales[lineaReader.getLineNumber()];

            var index = 0;
            while ((line = br.readLine()) != null) {
                var numeros = line.split(",");
                int[] trabajadores = new int[5];

                for (int i = 0; i < numeros.length; i++) {
                    trabajadores[i] = Integer.parseInt(numeros[i]);
                }

                trabajadores_Iniciales[index] = new Empresa_Trabajadores_Iniciales(trabajadores);
                index++;
            }
            br.close();

            JOptionPane.showMessageDialog(null, "ÉXITO AL LEER! ");
            return trabajadores_Iniciales;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ÉRROR AL LEER! ");
        }
        return new Empresa_Trabajadores_Iniciales[2];
    }
    
    public static void write_txt_int(File file,  int numero){
       
        try{
            PrintWriter pw = new PrintWriter(file);
            pw.print(numero); 
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Guardado Ha Fallado");
        }
        
    }
    
    public static void write_txt_int(File file,  Empresa_Trabajadores_Iniciales trabajadores){
        String trabajadores_txt = trabajadores.guionista + ","+ trabajadores.animador+ ","+ trabajadores.actor_doblaje+ ","+ trabajadores.disenador_escenario+ ","+ trabajadores.plot_twist;
        try{
            PrintWriter pw = new PrintWriter(file);
            pw.print(trabajadores_txt); 
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Guardado Ha Fallado");
        }
        
    }
    
    

}
