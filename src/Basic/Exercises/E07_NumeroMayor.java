// Exercise 07
// Verificar que número es mayor y mostrarlo en consola.

package Basic.Exercises;

import java.util.Scanner;

public class E07_NumeroMayor {
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
        consola.close();
    }
}