/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_7;

import java.util.Scanner;

/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String i = "s";
        while ("s".equals(i)) {
            System.out.println("Ingrese el valor de i");
            i = leer.nextLine();
        }
    }
    
}
