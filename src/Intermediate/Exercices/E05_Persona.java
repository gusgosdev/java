// Exercise 05
// Crear una clase sin constructor que muestre un mensaje.

package Intermediate.Exercices;

import java.util.Scanner;

public class E05_Persona {
    String name;
    int age;

    public void mostrar() {
        System.out.println("Hola, me llamo " + name + " y tengo " + age + " años.");
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String name = consola.nextLine();
        System.out.print("Ingresa tu edad: ");
        int age = consola.nextInt();

        // Crear el objeto
        E05_Persona persona1 = new E05_Persona();
        persona1.name = name;
        persona1.age = age;

        persona1.mostrar();
    }
}