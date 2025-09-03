// Exercise 04
// Brindar al usuario una decisión de acuerdo al clima.

package Basic.Exercises;

import java.util.Scanner;

public class E04_DecisionClima {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Variables del clima
        System.out.print("¿Está lluviendo? true/false: ");
        boolean rain = consola.nextBoolean();
        System.out.print("¿Está nublado? true/false: ");
        boolean nublado = consola.nextBoolean();
        System.out.println("-----------------------------------");

        // Tomar la decisión de acuerdo al clima
        if (rain && nublado){
            System.out.println("Llevar impermeable y paraguas");
        } else if (rain) {
            System.out.println("Llevar paraguas");
        } else if (nublado) {
            System.out.println("Llevar impermeable");
        } else {
            System.out.println("Dejar paraguas e impermeable");
        }
        consola.close();
    }
}