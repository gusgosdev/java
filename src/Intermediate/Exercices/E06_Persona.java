// Exercise 05
// Crear una clase con constructor que muestre un mensaje.

package Intermediate.Exercices;

import java.util.Scanner;

public class E06_Persona {
    String name;
    int age;

    public E06_Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String saludar() {
        return "Hola me llamo " + name + " y tengo " + age + " años.";
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = consola.nextInt();

        E06_Persona persona = new E06_Persona(nombre, edad);
        System.out.println(persona.saludar());
    }
}