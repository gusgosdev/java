package Basics.Operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        // Simplifica el if/else en una sola línea
        int numero1 = 12;
        int numero2 = 10;

        var resultado = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El número mayor es: " + resultado);
    }
}