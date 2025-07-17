package Basics.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operador and
        boolean a = true, b = true;
        // and (regresa true si ambos valores son true)
        var resultado = a && b;
        System.out.println("a && b = " + resultado);

        // Operador or
        boolean c = false, d = false;
        // or (regresa true si cualquiera de los valores son true)
        resultado = c || d;
        System.out.println("a || b = " + resultado);

        // Operador not !
        boolean e = false;
        // ! (not) invertir el valor logico
        resultado = !e;
        System.out.println("!a = " + resultado);
    }
}