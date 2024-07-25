// En este ejercicio vamos a crear e introducir elementos a una matriz desde la consola
package Exercises;

import java.util.Scanner;

public class AgregarDatosMatrices {
    public static void main(String[] args) {
        int renglones, columnas;
        var consola = new Scanner(System.in);
        // Definir la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];

        // Solicitar los valores
        for(int ren = 0; ren < renglones; ren++){
            for(var col=0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        // Iterar los valores de la matriz
        System.out.println();
        for(int ren = 0; ren < renglones; ren++){
            for(int col=0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = "
                        + matriz[ren][col]);
            }
        }
    }
}