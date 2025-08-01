// Exercise 07
// Este ejercicio replica el anterior, pero el usuario ingresa los números a validar.

package Exercises;

import java.util.Scanner;

public class E07_NumeroMayorDinamico {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Números a validar
        System.out.print("Ingresa el primer número: ");
        int num1 = consola.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = consola.nextInt();
        System.out.println("-------------------------------");

        // Verificar los números y enviar a consola
        if (num1 == num2) {
            System.out.println("Ambos números son iguales");
        } else {
            int decision = (num1 > num2) ? num1 : num2;
            System.out.println("El número mayor es: " + decision);
        }
    }
}