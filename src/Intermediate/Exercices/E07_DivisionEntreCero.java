package Intermediate.Exercices;

import java.util.Scanner;

public class E07_DivisionEntreCero {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = consola.nextInt();
        System.out.print("Ingrese el divisor: ");
        int num2 = consola.nextInt();

        System.out.println("------------------------------");
        try {
            int resultado = num1/num2;
            System.out.println("La división entre " + num1 + " y " + num2 + " es = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: No se puede dividir " + num1 + " entre " + num2);
        } finally {
            consola.close();
        }
    }
}