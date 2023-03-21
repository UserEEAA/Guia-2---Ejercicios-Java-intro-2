/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
ՄS/NՅ? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package ejercicio_2_6;

import java.util.Scanner;

/**
 *
 * @author MarcosEEAA
 */
public class Ejercicio_2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros cualquiera: ");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        String sel = "n";
        while ("n".equals(sel)) {
        System.out.println("Seleccione una opcion:");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SALIR");
        System.out.println("6 - NUMEROS NUEVOS");
        int menu = leer.nextInt();
            switch (menu) {
            case 1:
                System.out.println("El resultado de la SUMA es: " + (num1+num2));
                break;
            case 2:
                System.out.println("El resultado de la RESTA es: " + (num1-num2));
                break;
            case 3:
                System.out.println("El resultado de la MULTIPLICACION es: " + (num1*num2));
                break;
            case 4:
                System.out.println("El resultado de la DIVISION es: " + (num1 / num2));
                break;
            case 5:
                System.out.println("¿Seguro que desea SALIR? (s/n)");
                leer.nextLine();
                sel = leer.nextLine().toLowerCase();
                break;
            case 6:
                System.out.println("Ingrese 2 numeros nuevos: ");
                num1 = leer.nextDouble();
                num2 = leer.nextDouble();
            default :
                break;
            }
            System.out.println("=====================================");
        }
    }
    
}
