package Intermediate.Exercices;

import java.util.Scanner;

public class E08_IngresarDatoCorrecto {
    public static void main(String[] args) {
        try (Scanner consola = new Scanner(System.in)) {
            int num1, num2;
            while (true) {
                try {
                    System.out.print("Ingresa un número: ");
                    num1 = Integer.parseInt(consola.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Ingresa un número entero");
                }
            }

            while (true) {
                try {
                    System.out.print("Ingresa otro número: ");
                    num2 = Integer.parseInt(consola.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Ingresa un número entero");
                }
            }

            int resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("ERROR: No se puede dividir entre cero.");
        } finally {
            System.out.println("Programa terminado.");
        }
    }
}