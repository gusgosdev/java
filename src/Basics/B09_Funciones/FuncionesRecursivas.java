package Basics.B09_Funciones;

public class FuncionesRecursivas {
    // Es una función que se llama a sí misma
    // Ejemplo:
    // Imprimir del 1 al 5 usando una función recursiva
    static void funcionRecursiva(int numero) {
        // Caso base
        if (numero == 1) {
            System.out.print(numero + " ");
        } else {
            // Caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}