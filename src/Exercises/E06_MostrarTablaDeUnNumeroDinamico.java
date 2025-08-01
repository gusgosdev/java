// Exercise 06
// Este ejercicio replica el anterior, pero el usuario ingresa la tabla que desea.

package Exercises;

import java.util.Scanner;

public class E06_MostrarTablaDeUnNumeroDinamico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Variable de la tabla a realizar
        System.out.print("Ingresa el número de la tabla que deseas: ");
        int table = consola.nextInt();
        System.out.println("------------------------------------------");

        System.out.println("*** Tabla de multiplicar del " + table + " ***");

        // Obtener los resultados de la tabla de multiplicar
        for (int i = 0; i <= 12; i++) {
            int calculate = table * i;
            System.out.println(table + " x " + i + " = " + calculate);
        }
    }
}