// En este ejercicio pediremos info de algún libro al usuario y luego se lo mostraremos en la consola
package Exercises;

import java.util.Scanner;

public class DatosLibro {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa el autor del libro: ");
        var autor = consola.nextLine();
        System.out.print("Ingresa el titulo del libro: ");
        var titulo = consola.nextLine();

        System.out.println("********************");
        System.out.println(titulo + " fue escrito por " + autor);
    }
}