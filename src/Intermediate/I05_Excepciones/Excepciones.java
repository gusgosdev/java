package Intermediate.I05_Excepciones;

public class Excepciones {
    public static void main(String[] args) {
        final int num1 = 12;
        final int num2 = 0;

        System.out.println("El dato uno es " + num1 + " y el dato dos es " + num2);

        try {
            final int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("El programa ha finalizado.");
        }
    }
}