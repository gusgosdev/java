// En este ejercicio el programa sumará los valores entre un número a otro
package Exercises;

public class SumaAcumulativa {
    public static void main(String[] args) {
        int inicio = 0;
        final int FINAL = 5;
        System.out.println("La suma de los números del " + inicio + " al " + FINAL + " es:");

        // Iterar los valores
        int numero = 1;
        while (numero <= FINAL) {
            inicio += numero;
            numero++;
        }
        System.out.println(inicio);
    }
}