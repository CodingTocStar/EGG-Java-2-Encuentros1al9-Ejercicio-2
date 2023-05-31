/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class RazaService {

    //herramientas
    Scanner leer = new Scanner(System.in);
    ArrayList<String> razas = new ArrayList();
    //variables
    boolean confirmado = true;

    //metodos
    public void agregarRaza() {
        Raza nuevaRaza = new Raza(); //en la variable nuevaRaza uso la clase raza
        System.out.print("Ingrese raza: ");
        nuevaRaza.setRaza(leer.next()); //en la variable nuevaRaza uso el metodo SET para ponerle la raza y uso el escaner en el argumento
        razas.add(nuevaRaza.getRaza());
    }

    public void mostrarRaza() {
        for (String raza : razas) { //la variable raza es una variable vacia que sirve para usar el for each, trayendo cada elemento de la lista de razas.
            System.out.println(raza);
        }
    }

//        Iterator it = razas.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    public void eliminarRaza() {
        //herramientas
        Iterator<String> iterador = razas.iterator();
        //variables
        boolean confirmado = true;
        //ejecutable
        System.out.println("Que raza desea eliminar?");
        String razaEliminar = leer.next();
        leer.nextLine();

        while (iterador.hasNext()) { //el hasNext devuelve verdadero o falso si hay o no mas elementos en la lista
            if (iterador.next().equals(razaEliminar)) { //se fijaa si es igual al contenido de la variable
                iterador.remove(); //si es asi entonces lo remueve
                confirmado = false;
            }
        }
        if (confirmado) {
        System.out.println("No esta la raza ingresada.");
        }
        
        System.out.println("");
        Collections.sort(razas);
    }
}
