// En este ejercicio el programa devolverá la estación del año de acuerdo al número que ingresa el usuario (el número representa el mes)
package Exercises;

import java.util.Scanner;

public class IdentificaEstacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa un valor del 1 al 12: ");
        int mes = Integer.parseInt(consola.nextLine());

        // Revisión del mes
        if (mes == 1 || mes == 2 || mes == 3) {
            System.out.println("Es verano!!");
        } else if (mes == 4 || mes == 5 || mes == 6) {
            System.out.println("Es otoño!!");
        } else if (mes == 7 || mes == 8 || mes == 9) {
            System.out.println("Es invierno!!");
        } else if (mes == 10 || mes == 11 || mes == 12) {
            System.out.println("Es verano!!");
        } else {
            System.out.println("Número incorrecto");
        }
    }
}