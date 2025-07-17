package Basics.Operadores;

public class OperadorAsignacion {
    public static void main(String[] args) {
        // Basics.Operadores Asignacion
        var a = 10;
        int b; // Declarando
        b = 3; // inicializa (asigna un valor)

        // Asignacion compuesto
        a += 5; // a = a + 5
        System.out.println("a = " + a);

        // -=, *=, /=, >=, <=
        a *= 2; // a = a * 2
        System.out.println("a = " + a);
    }
}