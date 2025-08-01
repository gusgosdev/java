// Exercise 09
// Mostrar las calificaciones, cantidad y calcular su promedio.
// Informar por consola si aprobó o no (promedio >= 13 es aprobatorio)

package Exercises;

public class E09_PromedioNotas {
    public static void main(String[] args) {
        // Array con las calificaciones
        int[] grades = {12, 14, 18, 20, 16, 15};
        int amount = grades.length;

        // Mostrar las calificaciones
        for (int i = 0; i < amount; i++) {
            System.out.println("Nota " +  (i+1) + ": " + grades[i]);
        }
        System.out.println("------------------------------");

        // Mostrar la cantidad
        System.out.println("Usted cuenta con " + amount + " notas");
        System.out.println("------------------------------");

        // Calcular el promedio
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            sum += grades[i];
        }
        double prom = (double) sum/amount;
        System.out.printf("Su promedio es: %.2f%n", prom);
        
        // Informar si aprobó o no
        if (prom >= 13 && prom <= 20) {
            System.out.println("Felicidades, usted aprobó!!!");
        } else if (prom >= 0 && prom < 13) {
            System.out.println("Lo sentimos, usted desaprobó :(");
        } else {
            System.out.println("Promedio inválido");
        }
    }
}