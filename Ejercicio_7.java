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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clave");
        String ingreso = leer.nextLine();
        String clave = "eureka";
        if (ingreso.equals(clave)) {
            System.out.println("La clave es correcta");
        }else  {
            System.out.println("La clave es incorrecta");
        }
    }
    
}
