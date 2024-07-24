// Programa para calcular el area de un rectangulo
package Exercises;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        int base = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la altura: ");
        int altura = Integer.parseInt(consola.nextLine());

        System.out.println("********************");
        // Calculamos el area
        int area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

        // Calculamos el perimetro
        int perimetro = (base + altura) * 2;
        System.out.println("El perímetro es: " + perimetro);
    }
}