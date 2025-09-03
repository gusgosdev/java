// Exercise 05
// Mostrar el nombre del mes y la estación de acuerdo a un número en variable.

package Basic.Exercises;

import java.util.Scanner;

public class E05_EstacionDelAnio {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Variable con el mes del año
        System.out.print("Ingresa el mes (del 1 al 12): ");
        int month = consola.nextInt();

        // Variable para almacenar la estación
        String estacion;
        String nameMonth;

        // Verificar la estación que corresponde al mes
        switch (month) {
            case 3 -> {
                estacion = "Otoño!!";
                nameMonth = "Marzo";
            }
            case 4 -> {
                estacion = "Otoño!!";
                nameMonth = "Abril";
            }
            case 5 -> {
                estacion = "Otoño!!";
                nameMonth = "Mayo";
            }
            case 6 -> {
                estacion = "Invierno!!";
                nameMonth = "Junio";
            }
            case 7 -> {
                estacion = "Invierno!!";
                nameMonth = "Julio";
            }
            case 8 -> {
                estacion = "Invierno!!";
                nameMonth = "Agosto";
            }
            case 9 -> {
                estacion = "Primavera!!";
                nameMonth = "Septiembre";
            }
            case 10 -> {
                estacion = "Primavera!!";
                nameMonth = "Octubre";
            }
            case 11 -> {
                estacion = "Primavera!!";
                nameMonth = "Noviembre";
            }
            case 12 -> {
                estacion = "Verano!!";
                nameMonth = "Diciembre";
            }
            case 1 -> {
                estacion = "Verano!!";
                nameMonth = "Enero";
            }
            case 2 -> {
                estacion = "Verano!!";
                nameMonth = "Febrero";
            }
            default -> {
                estacion = "Estación desconocida..";
                nameMonth = "Mes inválido";
            }
        }

        // Mostrar en consola
        System.out.println("----------------------------------------------");
        System.out.println("Estamos en " + nameMonth + ", la estación es " + estacion);

        consola.close();
    }
}