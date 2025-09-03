package Intermediate.I02_Funciones;

public class Funciones {
    // Función principal
    public static void main(String[] args) {
        saludo();
        System.out.println("----------------------------------------");
        saludoConParametro("Lionel");
        saludoConParametro("Juan");
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