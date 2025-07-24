package Basics.B05_Operadores;

public class OperadorAsignacion {
    public static void main(String[] args) {
        // Asignar valor
        int a = 10;
        int b = 5;
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);

        System.out.println("*********************");

        // Asignación compuesto
        a += 5;
        b *= 2;

        // Nuevos valores
        System.out.println("Nuevos valores");
        System.out.println("a = " + a);
        System.out.println("a = " + a);
    }
}