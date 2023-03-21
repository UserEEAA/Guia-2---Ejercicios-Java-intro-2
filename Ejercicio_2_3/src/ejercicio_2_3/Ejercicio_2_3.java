/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package ejercicio_2_3;
import java.util.Scanner;
/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres de longitud como maximo");
        String frase = leer.nextLine();
        System.out.println(frase.length());
        if (frase.length() <= 8) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!!!");
        }
    }
    
}
