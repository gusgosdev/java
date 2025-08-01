// Exercise 08
// Validar si un número es par o impar y mostrarlo en consola.

package Exercises;

public class E08_ParImpar {
    public static void main(String[] args) {
        // Número a validar
        int number = 21;

        // Verificar si el número es par o impar
        if (number % 2 == 0) {
            System.out.println(number + " es número par");
        } else {
            System.out.println(number + " es número impar");
        }
    }
}