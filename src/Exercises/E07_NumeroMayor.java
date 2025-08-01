// Exercise 07
// Validar el número mayor de dos números y mostrar el mayor.

package Exercises;

public class E07_NumeroMayor {
    public static void main(String[] args) {
        // Números a validar
        int num1 = 17;
        int num2 = 17;

        // Verificar los números y enviar a consola
        if (num1 == num2) {
            System.out.println("Ambos números son iguales");
        } else {
            int decision = (num1 > num2) ? num1 : num2;
            System.out.println("El número mayor es: " + decision);
        }
    }
}