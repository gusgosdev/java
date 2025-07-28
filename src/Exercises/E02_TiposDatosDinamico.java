// Exercise 02
// Este ejercicio replica el anterior, pero ahora el usuario ingresa sus datos.

package Exercises;

import java.util.Scanner;

public class E02_TiposDatosDinamico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Variables con los datos
        System.out.print("Ingresa tu nombre: ");
        String name = consola.nextLine();

        System.out.print("Ingresa tu edad: ");
        byte age = consola.nextByte();
        consola.nextLine();

        System.out.print("Ingresa tu curso: ");
        String course = consola.nextLine();

        System.out.print("Ingresa el costo: ");
        double price = consola.nextDouble();

        // Formación de la oración
        String oracion = "Hola! me llamo " + name + " tengo " + age + " años, estoy aprendiendo " + course + " y este curso me costó $" + price + ".";

        // Mostrar en consola
        System.out.println("-------------------------------------");
        System.out.println(oracion);
    }
}