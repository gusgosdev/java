// En este ejercicio pediremos algunos datos al usuario y luego se lo mostraremos en la consola
package Exercises;

import java.util.Scanner;

public class InfoPersona {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("***** Completa los siguentes datos *****");
        System.out.print("Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Bebida Favorita: ");
        var bebida = consola.nextLine();
        System.out.print("Precio Bebida Favorita: ");
        var precioBebida = Float.parseFloat(consola.nextLine());
        System.out.println("********************");

        // Imprimir los valores
        System.out.println("Hola " + nombre + "!!! tienes " + edad + " años de edad y tu bebida favorita es " + bebida + " que tiene un precio de S/." + precioBebida);
    }
}