
package Java_Intro;

import java.util.Scanner;

/**
 *
 * @author Juanp
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        int Num1 = leer.nextInt();
        System.out.println("Ingresa el segundo número");
        int Num2 = leer.nextInt();
        int suma = Num1 + Num2;
        System.out.println("El resultado de la suma es= " + suma);
    }
    
}
