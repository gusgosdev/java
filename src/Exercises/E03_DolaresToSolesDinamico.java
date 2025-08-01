// Exercise 03
// Este ejercicio replica el anterior, pero el monto a convertir lo ingresa el usuario en consola.

package Exercises;

import java.util.Scanner;

public class E03_DolaresToSolesDinamico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Precio fijo (constante)
        final double dolar = 3.69;
        System.out.println("Precio dólar: S/." + dolar);
        System.out.println("-----------------------------------");

        // Monto en dólares a cambiar
        System.out.print("Ingresa el monto a cambiar: $ ");
        int montoEnDolares = consola.nextInt();

        // Monto calculado en soles
        double montoEnSoles = dolar * montoEnDolares;

        // Mensaje para la consola
        String mensaje = "$" + montoEnDolares + " serían S/." + montoEnSoles;

        // Mostrar en consola
        System.out.println("-----------------------------------");
        System.out.println(mensaje);
    }
}