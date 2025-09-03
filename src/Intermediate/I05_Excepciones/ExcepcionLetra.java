package Intermediate.I05_Excepciones;

import java.util.Scanner;

public class ExcepcionLetra {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        try {
            while (true) {
                try {
                    System.out.print("Ingresa un número: ");
                    num1 = Integer.parseInt(consola.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: El dato ingresado no es un número.");
                }
            }

            while (true) {
                try {
                    System.out.print("Ingresa otro número: ");
                    num2 = Integer.parseInt(consola.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: El dato ingresado no es un número.");
                }
            }

            System.out.println("------------------------------");
            System.out.println("Número 1: " + num1);
            System.out.println("Número 2: " + num2);
        } finally {
            consola.close();
        }
    }
}