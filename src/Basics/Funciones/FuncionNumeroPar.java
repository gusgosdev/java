package Basics.Funciones;

import java.util.Scanner;

public class FuncionNumeroPar {
    // Función para saber si un número es par
    static boolean esPar(int numero) {
        return (numero % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.print("Ingresa un número: ");
        var consola = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(consola + " es par? = " + esPar(consola));
    }
}