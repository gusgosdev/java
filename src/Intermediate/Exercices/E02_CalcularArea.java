// Exercise 02
// Calcular el área con una función.

package Intermediate.Exercices;

import java.util.Scanner;

public class E02_CalcularArea {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        int base = consola.nextInt();
        System.out.print("Ingresa la altura: ");
        int altura = consola.nextInt();

        String mensaje = "El área es: " + calcularArea(base, altura);

        System.out.println(mensaje);
    }

    static double calcularArea(int base, int altura) {
        return base * altura;
    }
}