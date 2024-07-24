package Matrices;

public class IterarMatriz {
    public static void main(String[] args) {
        // Definimos la matriz
        final int RENGLONES = 2;
        final int COLUMNAS = 3;
        var matriz = new int[RENGLONES][COLUMNAS];

        // Modificar los valores de la matriz
        matriz[1][2] = 120;
        matriz[0][1] = 30;
        matriz[1][1] = 320;
        matriz[0][2] = 550;

        // Recorremos la matriz
        // Recorremos los renglones
        for (int ren = 0; ren < RENGLONES; ren++) {
            // Recorremos la columna
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.println("Valor: " + ren + " " + col + " = " + matriz[ren][col]);
            }
        }
    }
}