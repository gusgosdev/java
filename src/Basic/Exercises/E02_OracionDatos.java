// Exercise 02
// Generar una oración con datos brindados por el usuario.

package Basic.Exercises;

import java.util.Scanner;

public class E02_OracionDatos {
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

        consola.close();
    }
}