/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
Si el perro está en la lista, 
    se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada. 
Si el perro no se encuentra en la lista, 
    se le informará al usuario y se mostrará la lista ordenada.
 */
package main;

import Servicios.RazaService;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros1Al9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RazaService nuevaRaza = new RazaService();
        String respuesta;
        
        do {
            nuevaRaza.agregarRaza();
            System.out.print("Desea guardar otra raza? (S/N): ");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("n"));
        
        System.out.println("");
        nuevaRaza.mostrarRaza();
        System.out.println("");
        nuevaRaza.eliminarRaza();
        System.out.println("");
        nuevaRaza.mostrarRaza();
    }
}
    

