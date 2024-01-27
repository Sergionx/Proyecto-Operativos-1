/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.operativos.pkg1;

/**
 *
 * @author Sergionx
 */
public class Drive {
    public int animations;
    
    public Drive(){
        this.animations=0;
    }
    
    public void addPart(TipoTrabajador_Estudio type){
        if (type == TipoTrabajador_Estudio.GUIONISTA){
            this.animations += 1;
            System.out.println("animaciones disponibles:" + this.animations);
        
        }
    }
}
