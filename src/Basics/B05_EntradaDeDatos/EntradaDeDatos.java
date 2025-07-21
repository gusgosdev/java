package Basics.B05_EntradaDeDatos;
import java.util.Scanner;

// Insertar datos por consola
public class EntradaDeDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();

        System.out.println("Tu nombre es: " + nombre);
    }
}