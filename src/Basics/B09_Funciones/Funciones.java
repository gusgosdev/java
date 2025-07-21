package Basics.B09_Funciones;

public class Funciones {

    // Mi función
    static void saludarConJava(String name) {
        System.out.println("Hola, soy " + name + " y estoy aprendiendo Java.");
    }

    // Método principal
    public static void main(String[] args) {
        saludarConJava("Gustavo");
        System.out.println("************************************************");

        // Ejemplo con funciones definidas en Java
        String cadena = "Hola Mundo";
        System.out.println(cadena);
        System.out.println("La cadena " + cadena + " tiene " + cadena.length() + " caracteres");
        // Recorrer los elementos de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(i);
        }

    }
}