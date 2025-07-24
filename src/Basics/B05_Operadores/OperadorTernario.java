package Basics.B05_Operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        System.out.println("Valor a = " + a);
        System.out.println("Valor b = " + b);
        System.out.println("************************");

        int resultado = (a > b) ? a : b;
        System.out.println("El número mayor es: " + resultado);
    }
}