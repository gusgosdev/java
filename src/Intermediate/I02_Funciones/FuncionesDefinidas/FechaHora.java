package Intermediate.I02_Funciones.FuncionesDefinidas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FechaHora {
    public static void main(String[] args) {
        // Funciones de fecha y hora
        // -> Fecha actual
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fecha.format(formatoFecha);
        System.out.println(fechaFormateada);

        // -> Hora actual
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = hora.format(formatoHora);
        System.out.println(horaFormateada);
    }
}