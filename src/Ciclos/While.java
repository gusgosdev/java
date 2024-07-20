package Ciclos;

public class While {
    public static void main(String[] args) {
        // Ciclo while

        // Imprimir números del 0 al 10
        int numMin = 0;
        final int NUM_MAX = 10;
        // Empieza el ciclo
        while (numMin <= NUM_MAX) {
            System.out.println(numMin);
            numMin++;
        }
    }
}