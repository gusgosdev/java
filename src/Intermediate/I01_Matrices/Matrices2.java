package Intermediate.I01_Matrices;

public class Matrices2 {
    public static void main(String[] args) {
        // Declaración directa de la matriz
        int[][] ejemplo = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {110, 120, 130, 140, 150}
        };

        // Recorrer y mostrar toda la matriz
        System.out.println("---------------------------");
        System.out.println("Datos de la matriz\n");
        for (int i = 0; i < ejemplo.length; i++) {
            for (int e = 0; e < ejemplo[i].length; e++) {
                System.out.print(ejemplo[i][e] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        // Mostrar una matriz en especial con variable
        System.out.println("Mostrar un dato de la matriz\n");
        int numero = ejemplo[0][4];
        System.out.println(numero);

        // Mostrar una matriz en especial directamente
        System.out.println(ejemplo[2][3]);
        System.out.println("---------------------------");
    }
}