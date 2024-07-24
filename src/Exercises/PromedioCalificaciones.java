// En este ejercicio, el programa calcula el promedio de las calificaciones que brinde el usuario (el usuario tambien define cuantas calificaciones agregar)
package Exercises;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas calificaciones deseas agregar? ");
        var totalCalificaciones = Integer.parseInt(consola.nextLine());

        // Creamos el arreglo
        var calificaciones = new int[totalCalificaciones];

        // Solicitamos los valores de las calificaciones
        for(var i = 0; i < totalCalificaciones; i++){
            System.out.print("Calificaciones[" + i + "] = " );
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        // Obtener el promedio de las calificaciones
        int sumaCalificaciones = 0;
        for(var i=0; i < totalCalificaciones; i++){
            sumaCalificaciones += calificaciones[i];
        }
        var promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("\nPromedio de las Calificaciones: " + promedio);
    }
}