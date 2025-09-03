package Basic.B05_Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operador and
        boolean a = true, b = true;
        var resultado = a && b;
        System.out.println("a && b = " + resultado);

        // Operador or
        boolean c = false, d = false;
        resultado = c || d;
        System.out.println("a || b = " + resultado);

        // Operador not !
        boolean e = false;
        resultado = !e;
        System.out.println("!a = " + resultado);
    }
}