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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int number = leer.nextInt();
        if (number%2==0 && number!=0) {
            System.out.println("Es un número par");
        }else if (number==0){
            System.out.println("Es el 0, no me engañes");
                }
        else   {
            System.out.println("Es un número impar");
        }
    }
    
}
