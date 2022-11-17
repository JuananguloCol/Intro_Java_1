package Java_Intro;

import java.util.Scanner;

/**
 *
 * @author Juanp
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una varaible cadena (String) que se utiliza para leer los datos del usuario
        String nombre;
        //Muestra mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //Mostramos por consola un saludo personalizado
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");
        
    }
    
}
