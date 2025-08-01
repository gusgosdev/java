// Exercise 08
// Este ejercicio replica el anterior, pero el usuario ingresa el número a validar.

package Exercises;

import java.util.Scanner;

public class E08_ParImparDinamico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Número a validar
        System.out.print("Ingrese un número a validar: ");
        int number = consola.nextInt();
        System.out.println("---------------------------------");

        // Verificar si el número es par o impar
        if (number % 2 == 0) {
            System.out.println(number + " es número par");
        } else {
            System.out.println(number + " es número impar");
        }
    }
}