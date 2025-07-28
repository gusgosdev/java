// Exercise 01
// Realizar operaciones aritméticas utilizando los valores de dos variables.

package Exercises;

public class E01_Operaciones {
    public static void main(String[] args) {
        // Variables con los valores
        int num1    = 20;
        int num2    = 5;

        // Variables con las operaciones
        int suma    = num1 + num2;
        int resta   = num1 - num2;
        int multi   = num1 * num2;
        int divi    = num1 / num2;
        int modulo  = num1 % num2;

        // Mostrar los valores en consola
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
    }
}