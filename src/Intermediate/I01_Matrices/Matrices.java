package Intermediate.I01_Matrices;

public class Matrices {
    public static void main(String[] args) {
        // Declaración de la matriz
        int[][] ejemplo = new int[3][5];

        //Asignación de la matriz
        // -> Fila 1 (indice 0)
        ejemplo[0][0] = 10;
        ejemplo[0][1] = 20;
        ejemplo[0][2] = 30;
        ejemplo[0][3] = 40;
        ejemplo[0][4] = 50;

        // -> Fila 2 (indice 1)
        ejemplo[1][0] = 60;
        ejemplo[1][1] = 70;
        ejemplo[1][2] = 80;
        ejemplo[1][3] = 90;
        ejemplo[1][4] = 100;

        // -> Fila 3 (indice 2)
        ejemplo[2][0] = 110;
        ejemplo[2][1] = 120;
        ejemplo[2][2] = 130;
        ejemplo[2][3] = 140;
        ejemplo[2][4] = 150;

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