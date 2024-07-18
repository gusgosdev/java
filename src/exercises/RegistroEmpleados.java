// Un ejercicio más sobre entrada de datos del usuario y mostralo en la consola
package exercises;

import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        System.out.println("***** Registro Empleados *****");
        var consola = new Scanner(System.in);

        // Pedir los valores
        System.out.print("Proporciona tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Proporciona tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona tu sueldo (USD): ");
        var sueldo = Float.parseFloat(consola.nextLine());
        System.out.print("Eres un empleado de confianza (true/false)? ");
        var empleadoDeConfianza = Boolean.parseBoolean(consola.nextLine());
        System.out.println("********************");

        // Imprimimos los valores
        System.out.println("La información proporcionada es: ");
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
        System.out.println("Sueldo = " + sueldo);
        System.out.println("Empleado de confianza = " + empleadoDeConfianza);
    }
}