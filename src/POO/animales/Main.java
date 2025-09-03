package POO.animales;

import POO.animales.clases.Animal;
import POO.animales.clases.Conejo;
import POO.animales.clases.Gato;
import POO.animales.clases.Perro;

public class Main {
    public static void main(String[] args) {
        String[] animales = {"no indicado", "perro", "gato", "cerdo", "conejo", "canario", "tortuga"};

        System.out.println("*************** Bienvenido ***************\n");

        // Datos animales
        Animal animal = new Animal("Firulais", animales[0]);
        animal.mostrarID();
        Animal animal1 = new Perro("Firulais", animales[1]);
        animal1.mostrarID();
        Animal animal2 = new Gato("Penny", animales[2]);
        animal2.mostrarID();
        Animal animal3 = new Conejo("Mr. Conejito", animales[4]);
        animal3.mostrarID();

        // Separación
        Ticket uno = new Ticket(animal1);
        Ticket unoo = new Ticket(animal3);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Tickets encontrados: " + Ticket.getTotalTicket());

        // Mostrar tickets
        uno.mostrarTicket();
        unoo.mostrarTicket();
    }
}