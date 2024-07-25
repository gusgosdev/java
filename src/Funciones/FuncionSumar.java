package Funciones;

public class FuncionSumar {
    // Definimos la función sumar
    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int arg1 = 11, arg2 = 15;
        int resultado= sumar(arg1, arg2);
        System.out.println(arg1 + " + " + arg2 + " = " + resultado);
    }
}