/*
Crear un programa que dado un número determine si es par o impar.
 */
package ejercicio_2_1;

import java.util.Scanner;

/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        if (num%2 == 0) {
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }
        
    }
    
}
