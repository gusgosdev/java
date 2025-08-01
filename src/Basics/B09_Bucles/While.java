package Basics.B09_Bucles;

public class While {
    public static void main(String[] args) {
        int number = 1;
        final int NUM_MAX = 10;

        while (number <= NUM_MAX) {
            System.out.println("X = " + number);
            number++;
        }
    }
}