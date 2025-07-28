// Exercise 03
// Mostrar la conversión de un monto en dólares a soles.

package Exercises;

public class E03_DolaresToSoles {
    public static void main(String[] args) {
        // Precio fijo (constante)
        final double dolar = 3.69;

        // Monto en dólares a cambiar
        int montoEnDolares = 15;

        // Monto calculado en soles
        double montoEnSoles = dolar * montoEnDolares;

        // Mensaje para la consola
        String mensaje = "$" + montoEnDolares + " serían S/." + montoEnSoles;

        // Mostrar en consola
        System.out.println("Precio dólar: " + dolar);
        System.out.println(mensaje);
    }
}