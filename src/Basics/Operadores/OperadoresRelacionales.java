package Basics.Operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        // Basics.Operadores relacionales (comparacion)
        int a = 3, b = 2;

        // Igualdad ==
        var resultado = a == b;
        System.out.println("a == b ? " + resultado);

        // Distinto !=
        resultado = a != b;
        System.out.println("a != b ? " + resultado);

        // Mayor que
        resultado = a > b;
        System.out.println("a > b ?  " + resultado);

        // Mayor o igual que
        resultado = a >= b;
        System.out.println("a >= b ? " + resultado);

        // Menor que
        resultado = a < b;
        System.out.println("a < b ? " + resultado);

        // Menor o igual que
        resultado = a <= b;
        System.out.println("a <= b ? " + resultado);
    }
}