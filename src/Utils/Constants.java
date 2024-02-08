/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Sergionx
 */
public class Constants {

    private static int SECOND_DURATION = 1000;
    public static int MINUTE_DURATION = SECOND_DURATION * 60;
    public static int HOUR_DURATION = MINUTE_DURATION * 60;
    public static int DAY_DURATION = HOUR_DURATION * 24;

    public static void setSecond(int seconds) {
        SECOND_DURATION = seconds;
        
//        60 se divide entre 10, para que el tiempo pase rápido
        MINUTE_DURATION = SECOND_DURATION * (60 / 10);
        HOUR_DURATION = MINUTE_DURATION * 60;
        DAY_DURATION = HOUR_DURATION * 24;
    }
}
