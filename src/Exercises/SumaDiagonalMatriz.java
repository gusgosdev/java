// En este ejercicio vamos a sumar los renglones y columnas que tengan índices iguales
package Exercises;

import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        // Solicitamos el tamaño de la matriz
        System.out.print("Ingresa la cantidad de renglones: ");
        int renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la cantidad de columnas: ");
        int columnas = Integer.parseInt(consola.nextLine());

        // Creamos la matriz
        var matriz = new int[renglones][columnas];
        // Solicitamos los valores
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        // Suma de la diagonal de la matriz
        System.out.println();
        int sumaDiagonal = 0;
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                if (ren == col) {
                    sumaDiagonal += matriz[ren][col];
                    System.out.println("Número[" + ren + "][" + col + "] = " + matriz[ren][col]);
                }
            }
        }
        System.out.println("La suma diagonal es: " + sumaDiagonal);
    }
}