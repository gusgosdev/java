// Exercise 01
// Realizar operaciones matemáticas con los valores ingresados por el usuario en consola.

package Basic.Exercises;

import java.util.Scanner;

public class E01_Operaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Variables con los valores
        System.out.print("Ingresa el primer valor: ");
        int num1    = consola.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        int num2    = consola.nextInt();

        // Variables con las operaciones
        int suma    = num1 + num2;
        int resta   = num1 - num2;
        int multi   = num1 * num2;
        int divi    = num1 / num2;
        int modulo  = num1 % num2;

        // Mostrar los valores en consola
        System.out.println("----------------------");
        System.out.println("Primer valor: " + num1);
        System.out.println("Segundo valor: " + num2);

        // Mostrar los resultados en consola
        System.out.println("----------------------");
        System.out.println("Los resultados son:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + divi);
        System.out.println("Módulo: " + modulo);

        consola.close();
    }
}