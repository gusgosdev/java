package Basics.Ciclos;

public class DoWhile {
    public static void main(String[] args) {
        // Ciclo do while

        // Imprimir números del 0 al 10
        int numMin = 0;
        final int NUM_MAX = 10;
        // Empieza el ciclo
        do {
            System.out.println(numMin);
            numMin++;
        } while (numMin <= NUM_MAX);
    }
}