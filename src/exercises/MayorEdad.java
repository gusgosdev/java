package exercises;

import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(consola.nextLine());

        final int MAYOR_EDAD = 18;

        // Validar la edad
        if (edad >= MAYOR_EDAD){
            System.out.println("Usted tiene " + edad + " años. Es mayor de edad.");
        } else {
            System.out.println("Tienes " + edad + " años. Eres menor de edad.");
        }
    }
}