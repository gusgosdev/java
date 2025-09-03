// Exercise 01
// Crear una matriz desde consola.

package Intermediate.Exercices;

import java.util.Scanner;

public class E01_MatrizDinamica {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Datos para la cración de la matriz
        System.out.print("Ingresa la cantidad de filas: ");
        int filas = consola.nextInt();
        System.out.print("Ingresa la cantidad de columnas: ");
        int columnas = consola.nextInt();

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];

        // Ingresar los datos
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                System.out.print("Ingresa el dato [" + i + "]" + "[" + e + "]: ");
                matriz[i][e] = consola.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("----------------------------------");
        System.out.println("Los datos ingresados son: ");

        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                System.out.print(matriz[i][e] + "\t");
            }
            System.out.println();
        }
        consola.close();
    }
}