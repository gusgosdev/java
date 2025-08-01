// Exercise 06
// Mostrar en consola la tabla de multiplicar de un determinado número.

package Exercises;

public class E06_MostrarTablaDeUnNumero {
    public static void main(String[] args) {
        // Variable de la tabla a realizar
        int table = 4;

        System.out.println("*** Tabla de multiplicar del " + table + " ***");

        // Obtener los resultados de la tabla de multiplicar
        for (int i = 0; i <= 12; i++) {
            int calculate = table * i;
            System.out.println(table + " x " + i + " = " + calculate);
        }
    }
}