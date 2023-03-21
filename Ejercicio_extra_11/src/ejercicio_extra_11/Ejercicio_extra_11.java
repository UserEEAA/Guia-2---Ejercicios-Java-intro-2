/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package ejercicio_extra_11;

import java.util.Scanner;

/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_extra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una serie de numeros: ");
        int num1 = leer.nextInt();
        int num2 = num1/10;
        int i = 1;
        while (num2 > 10) {
            num2 = num2/10;
            i++;
        }
        System.out.println("La cantidad de digitos es: " + (i+1));
    }
}
