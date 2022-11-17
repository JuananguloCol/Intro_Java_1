/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Intro;
import java.util.Scanner;

/**
 *
 * @author Juanp
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int number = leer.nextInt();
        System.out.println("La raiz caudrada es: " + Math.sqrt(number));
        System.out.println("El cuadrado es: " + Math.pow(number, 2));
        System.out.println("El triple es: " + Math.pow(number, 3));
        
    }
    
}
