package Basics.B03_TiposDeDatos;

public class TiposDeDatos {
    public static void main(String[] args) {
        // Diferentes tipos de datos
        byte edad = 22;
        short anual = 5500;
        int cantidad = 44;
        long numGrande = 9223372036854775807L;
        char letra = 'R';
        char letra2 = 82;
        boolean mayorEdad = true;
        float precio = 149.90F;
        double precio2 = 99.90;
        String frase = "Hola, bienvenido!";

        // Mostramos en consola
        System.out.println("*************************");

        System.out.println(frase);
        System.out.println("Tipo byte: " + edad);
        System.out.println("Tipo short: " + anual);
        System.out.println("Tipo int: " + cantidad);
        System.out.println("Tipo long: " + numGrande);
        System.out.println("Tipo char: " + letra);
        System.out.println("Tipo char: " + letra2);
        System.out.println("Tipo boolean: " + mayorEdad);
        System.out.println("Tipo float: " + precio);
        System.out.println("Tipo double: " + precio2);

        System.out.println("*************************");
    }
}