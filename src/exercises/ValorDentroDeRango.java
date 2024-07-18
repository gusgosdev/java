// En este ejercicio haremos un programa para saber si un valor se encuentra dentro de un rango definido
package exercises;

import java.util.Scanner;

public class ValorDentroDeRango {
    public static void main(String[] args) {
        // Valor
        final int MINIMO = 0;
        final int MAXIMO = 20;

        // Solicitamos un valor
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un número entero: ");
        var dato = Integer.parseInt(consola.nextLine());
        var dentroRango = dato>=MINIMO && dato<=MAXIMO;
        if (dentroRango){
            System.out.println("El número " + dato + " esta dentro del rango permitido.");
        } else {
            System.out.println(dato + " está fuera de rango.");
        }
    }
}