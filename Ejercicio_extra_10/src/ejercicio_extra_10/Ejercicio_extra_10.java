/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejercicio_extra_10;

import java.util.Scanner;

/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_extra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int rand1 = (int) (Math.random()*10+1);
        int rand2 = (int) (Math.random()*10+1);
        int resultado = rand1 * rand2;
        int resp = 0;
        do {
            System.out.println("Adivine la multiplicacion de 2 numeros entre 1 y 10");
            resp = leer.nextInt();
            //System.out.println("VARIABLE RESP: " + resp);
            //System.out.println("RESULTADO: "+resultado);
            if (resp < resultado) {
                System.out.println("Su numero es MENOR al resultado");
            } else if (resp > resultado) {
                System.out.println("Su numero es MAYOR al resultado");
            } else {
                System.out.println("FELICIDADES! El numero es correcto");
                System.out.println( rand1 + " * " + rand2 + " = " + resultado );
            }
        } while ( resp != resultado);
        
        
        
    }
    
}
