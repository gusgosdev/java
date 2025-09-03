// Exercise 04
// Generar un email con los datos que proporcione el usuario en consola.

package Intermediate.Exercices;

import java.util.Scanner;

public class E04_GenerarEmails {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Bienvenida
        System.out.println("***** Bienvenido al generador de emails *****");

        // Obtener los datos
        System.out.print("Ingrese su nombre: ");
        String name = consola.nextLine();
        System.out.print("Ingrese su apellido: ");
        String lastName = consola.nextLine();
        System.out.print("Ingresa tu DNI: ");
        String num = consola.nextLine();

        // Mostrar el mensaje
        System.out.println("--------------------------------------------------");
        System.out.println("Generando su email..");
        // Thread.sleep(2000);
        System.out.println("Su email es: " + generarEmail(name, lastName, num));
        System.out.println("--------------------------------------------------");
        System.out.println("Gracias por usar este programa");
    }

    // Función para generar el email
    static String generarEmail(String name, String lastName, String num) {
        String numFormat = num.substring(0, 2);

        if (name.length() <= 4 && lastName.length() <= 4) {
            return name.toLowerCase() + "." + lastName.toLowerCase() + numFormat + "@correo.com";
        } else {
            String nameFormat = name.toLowerCase().substring(0, Math.min(name.length(), 4));
            String lastNameFormat = lastName.toLowerCase().substring(0, Math.min(lastName.length(), 4));
            return nameFormat + "." + lastNameFormat + numFormat + "@correo.com";
        }
    }
}