// En este ejercicio revisaremos si un número es positivo o no
package exercises;

import java.util.Scanner;

public class NumeroPositivoONo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un número: ");
        int numero = Integer.parseInt(consola.nextLine());
        if (numero > 0) {
            System.out.println(numero + " es positivo.");
        } else if (numero < 0 ) {
            System.out.println(numero + " es negativo.");
        } else {
            System.out.printf(numero + " es neutro.");
        }
    }
}