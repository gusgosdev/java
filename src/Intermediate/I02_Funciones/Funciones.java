package Intermediate.I02_Funciones;

public class Funciones {
    // Función principal
    public static void main(String[] args) {
        saludo();
        System.out.println("----------------------------------------");

        saludoConParametro("Lionel");
        saludoConParametro("Juan");
        System.out.println("----------------------------------------");

        // Ejemplo con funciones definidas en Java
        String cadena = "Hola Mundo";
        System.out.println(cadena);
        System.out.println("La cadena " + cadena + " tiene " + cadena.length() + " caracteres");
        // Recorrer los elementos de la cadena y su posición
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " = ");
            System.out.println(i + 1);
        }
    }

    // Definición de una función
    static void saludo() {
        System.out.println("Hola, esta es mi función básica en Java");
    }

    // Definición de una función con parámetro
    static void saludoConParametro(String name) {
        System.out.println("Hola, me llamo " + name);
    }
}