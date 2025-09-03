package Basic.B05_Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        int resultado;

        // Mostrar los valores
        System.out.println("El valor 1 es: " + a);
        System.out.println("El valor 2 es: " + b);
        System.out.println("**************************");

        // Suma
        resultado = a + b;
        System.out.println("Suma: " + resultado);

        // Resta
        resultado = a - b;
        System.out.println("Resta: " + resultado);

        // Multiplicacion
        resultado = a * b;
        System.out.println("Multiplicación: " + resultado);

        // Division
        resultado = a / b;
        System.out.println("División: " + resultado);

        // Modulo (residuo de la division)
        resultado = a % b;
        System.out.println("Módulo: " + resultado);
    }
}