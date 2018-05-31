/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador2;

import java.io.IOException;

/**
 *
 * @author Portátil
 */
public class Apagado {

    public void temporizador(int minutos){
        try {
            String command = "shutdown -s -t "+(minutos*60);
            Process process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public void desactivar(){
        try {
            String command = "shutdown -a";
            Process process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
