package Basics;

import java.util.Scanner;

public class ConversionTiposDeDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Número 1: ");
        var numero1 = consola.nextLine();
        System.out.print("Número 2: ");
        var numero2 = consola.nextLine();
        System.out.println("*************************2");

        // Conversion de tipos de datos (de String a numero)
        // Resultado de la suma
        var resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
        System.out.println("El resultado de la suma es: " + resultado);

        // Concatenacion
        var concatenacion = numero1 + numero2;
        System.out.println("La concatenacion es: " + concatenacion);
    }
}
