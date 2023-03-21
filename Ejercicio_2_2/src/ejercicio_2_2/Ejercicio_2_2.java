/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package ejercicio_2_2;

import java.util.Scanner;
/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra clave EUREKA");
        String frase = leer.nextLine();
        String llave = "eureka";
        if (frase.toLowerCase().equals(llave)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
