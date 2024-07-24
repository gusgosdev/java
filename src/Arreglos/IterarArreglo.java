package Arreglos;

public class IterarArreglo {
    public static void main(String[] args) {
        // Arreglo
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Iterar los elementos del arreglo (mostrar todos los elementos del aareglo)
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El valor del indice " + i + " es " + numeros[i]);
        }
    }
}