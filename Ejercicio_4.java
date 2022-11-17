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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en C°");
        int centigrados = leer.nextInt();
        int fahrenheit = 32 + ((centigrados*9)/5);
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
    }
    
}
