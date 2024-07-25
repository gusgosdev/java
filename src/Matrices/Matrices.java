package Matrices;

public class Matrices {
    public static void main(String[] args) {
        // Una matriz en Java es un arreglo de 2 dimensiones
        /* Ejemplo visual:
             __________________________________
            |      |      |      |      |      |
            |  0,0 |  0,1 |  0,2 |  0,3 |  0,4 |     fila,columna
            |______|______|______|______|______|
            |      |      |      |      |      |     Del ejm:
            |______|______|______|______|______|         Matriz de 4 columnas, 3 filas (renglones)
            |      |      |      |      |      |
            |______|______|______|______|______|
        */

        // Definimos una matriz
        int[][] matriz = new int[2][3];
        //var matriz = new int[2][5]; // Usando var

        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 140;
        matriz[1][2] = 120;

        System.out.println(matriz[1][2]);

        // Sintaxis simplificada de matriz
        var otraMatriz = new int[][]{{100, 200, 300},{400, 500, 600}};
        for (int ren = 0; ren < otraMatriz.length; ren++) {
            for (int col = 0; col < otraMatriz[ren].length; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + otraMatriz[ren][col]);
            }
        }
    }
}