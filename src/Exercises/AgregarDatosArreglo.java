// En este ejercicio vamos a crear e introducir elementos a un arreglo desde la consola
package Exercises;

import java.util.Scanner;

public class AgregarDatosArreglo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        // Pedimos el largo del arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        int largoArreglo = Integer.parseInt(consola.nextLine());

        // Creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];
        // Solicitar los valores del arreglo
        for(var i = 0; i < largoArreglo; i++) {
            System.out.print("Proporciona un numero[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del Arreglo: ");
        for(var i = 0; i < largoArreglo; i++) {
            System.out.println("indice[" + i + "] = " + enteros[i]);
        }
    }
}