package Basics.B10_Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ages = {18, 25, 30, 14, 18, 12, 25, 21};

        // Mostrar el valor de un determinado índice
        System.out.println("El valor del indice 0 es: " + ages[0]);
        System.out.println("-------------------------------");

        // Mostrar la cantidad de datos
        System.out.println("El array contiene " + ages.length + " datos");
        System.out.println("-------------------------------");

        // Recorrer el array
        for (int i = 0; i < ages.length; i++) {
            System.out.println("El indice " + i + " es: " + ages[i]);
        }
        System.out.println("-------------------------------");
    }
}