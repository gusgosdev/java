package POO.animales;

import POO.animales.clases.Animal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private static int contadorTicket;
    private final int idTicket;
    private final Animal animal;
    private LocalDateTime fechaHora;

    // Constructor
    public Ticket(Animal animal) {
        this.idTicket = ++contadorTicket;
        this.animal = animal;
        this.fechaHora = LocalDateTime.now();
    }

    public int getIdTicket() {
        return idTicket;
    }
    public static int getTotalTicket() {
        return contadorTicket;
    }

    public void mostrarTicket() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");


        System.out.println("-------------------------------------------------------");
        System.out.println("Fecha: " + fechaHora.format(formatoFecha) + "                        " + "Hora: " + fechaHora.format(formatoHora));
        System.out.println("Ticket N°" + getIdTicket());
        System.out.println("Información de mascota: ");
        System.out.println("\tID Mascota: " + animal.getIdAnimal());
        System.out.println("\tNombre: " + animal.getNombre());
        System.out.println("\tTipo: " + animal.getTipoMascota());
        System.out.println("-------------------------------------------------------\n");
    }
}