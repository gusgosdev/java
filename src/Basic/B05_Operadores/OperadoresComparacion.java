package Basic.B05_Operadores;

public class OperadoresComparacion {
    public static void main(String[] args) {
        // Operadores relacionales (comparacion)
        int a = 3, b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("*******************");

        // Igualdad
        var resultado = a == b;
        System.out.println("¿a == b? " + resultado);

        // Distinto
        resultado = a != b;
        System.out.println("¿a != b? " + resultado);

        // Mayor que
        resultado = a > b;
        System.out.println("¿a > b?  " + resultado);

        // Mayor o igual que
        resultado = a >= b;
        System.out.println("¿a >= b? " + resultado);

        // Menor que
        resultado = a < b;
        System.out.println("¿a < b? " + resultado);

        // Menor o igual que
        resultado = a <= b;
        System.out.println("¿a <= b? " + resultado);
    }
}