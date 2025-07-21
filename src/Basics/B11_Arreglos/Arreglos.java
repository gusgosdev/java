package Basics.B11_Arreglos;

public class Arreglos {
    public static void main(String[] args) {
        // Basics.Arreglos
            // 1. Declaramos la variable
            int[] enteros;

            // 2. Inicializar el arreglo
            enteros = new int[3]; // Reservamos espacio para 3 elementos

            // Declarar e inicializar en una sola linea
            int[] numeros = new int[2];
            // var numeros2 = new int[2]; // Usando var

        // Sintaxis simplificada
            int[] otrosNumeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            // var otroNumeros = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Usando var
            System.out.println("El valor del indice 0 es: " + otrosNumeros[0]);
            System.out.println("El valor del indice 4 es: " + otrosNumeros[4]);
            System.out.println("El valor del indice 9 es: " + otrosNumeros[9]);
    }
}
