// Exercise 09
// Este ejercicio replica el anterior, pero ahora el usuario ingresa las calificaciones.

package Exercises;

import java.util.Scanner;

public class E09_PromedioNotasDinamico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("¿Cuántas notas vas a ingresar?: ");
        int cantidad = consola.nextInt();
        int[] grades = new int[cantidad];
        int sum = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + ": ");
            grades[i] = consola.nextInt();
            sum += grades[i];
        }
        System.out.println("------------------------------");

        // Mostrar las calificaciones
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nota " +  (i+1) + ": " + grades[i]);
        }
        System.out.println("------------------------------");

        // Mostrar la cantidad
        System.out.println("Usted cuenta con " + cantidad + " notas");
        System.out.println("------------------------------");

        // Calcular el promedio
        double promedio = (double) sum / cantidad;
        System.out.printf("Su promedio es: %.2f%n", promedio);

        // Informar si aprobó o no
        if (promedio >= 13 && promedio <= 20) {
            System.out.println("Felicidades, usted aprobó!!!");
        } else if (promedio >= 0 && promedio < 13) {
            System.out.println("Lo sentimos, usted desaprobó :(");
        } else {
            System.out.println("Promedio inválido");
        }
    }
}