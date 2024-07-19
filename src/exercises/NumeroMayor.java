// En este ejercicio el usuario ingresará 2 números y el programa analizará el mayor
package exercises;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa otro número: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        System.out.println("********************");
        // Analizamos el mayor
        if (numero1 > numero2) {
            System.out.println(numero1 + " es el mayor.");
        } else if (numero1 == numero2) {
            System.out.println(numero1 + " y " + numero2 + " son iguales.");
        } else {
            System.out.println(numero2 + " es el mayor.");
        }
    }
}