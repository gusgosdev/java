package Basic.B07_EntradaDeDatos;
import java.util.Scanner;

// Insertar datos por consola
public class EntradaDeDatos {
    public static void main(String[] args) {
        // Clase que permite el ingreso por teclado
        Scanner consola = new Scanner(System.in);

        // Pedir el dato al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = consola.nextInt();

        // Mostrar los datos
        System.out.println("---------------------------------------");
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
    }
}