// Exercise 03
// Mostrar la fecha y hora actual, y calcular la hora de salida.

package Intermediate.Exercices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class E03_HoraJava {
    public static void main(String[] args) throws InterruptedException {
        Scanner consola = new Scanner(System.in);

        // Formato de fecha y hora
        DateTimeFormatter fechaFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        // -------------------------------------------------------------------------------------------
        // Hora entrada
        // Obtener fecha y hora actual del sistema
        LocalDateTime fechaHora1 = LocalDateTime.now();
        // Aplicar los formatos
        String fecha1 = fechaHora1.format(fechaFormat);
        String hora1 = fechaHora1.format((horaFormat));
        // Mostrar el mensaje
        System.out.println("Fecha y hora entrada: " + fecha1 + " a las " + hora1);

        // -------------------------------------------------------------------------------------------
        // Ingresar las horas laborales
        System.out.print("Ingrese sus horas laborales: ");
        int horas = consola.nextInt();

        // -------------------------------------------------------------------------------------------
        // Hora salida
        LocalDateTime horaSalida = fechaHora1.plusHours(horas);

        String fechaSalida1 = horaSalida.format(fechaFormat);
        String horaSalida1 = horaSalida.format(horaFormat);
        System.out.println("Fecha y hora salida: " + fechaSalida1 + " a las " + horaSalida1);
    }
}