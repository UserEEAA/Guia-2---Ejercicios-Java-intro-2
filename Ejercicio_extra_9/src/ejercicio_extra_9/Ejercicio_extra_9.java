/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
 */
package ejercicio_extra_9;

import java.util.Scanner;

/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_extra_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dividendo: ");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese divisor: ");
        double num2 = leer.nextDouble();
        double res = num1 - num2;
        int i = 1;
        while (res > num2) {
            res = res - num2;
            i++;
        }
        System.out.println("El resultado es: " + i);
        System.out.println("El residuo es: " + res);
    }    
}
