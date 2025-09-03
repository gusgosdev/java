package Intermediate.I02_Funciones;

public class FuncionConRetorno {
    // Función (método) principal
    public static void main(String[] args) {
        System.out.println(sumar(5, 8));
        System.out.println(multiplicar(8, 5));
        System.out.println(sumar(12, 33));
        System.out.println(multiplicar(5, 9));
    }

    // Método con retorno
    static String sumar(int a, int b) {
        int suma = a + b;
        return "La suma de " + a + " + " + b + " = " + suma;
    }

    // Método con retorno
    static String multiplicar(int a, int b) {
        int producto = a * b;
        return "La multiplicación de " + a + " x " + b + " = " + producto;
    }
}