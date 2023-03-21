/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package ejercicio_2_5;

import java.util.Scanner;

/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int limit = leer.nextInt();
        int suma = 0;
        while (suma < limit) {
            System.out.print("Ingrese numero a sumar: ");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("Suma parcial: " + suma);
        }
    }
    
}
