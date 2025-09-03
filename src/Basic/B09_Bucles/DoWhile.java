package Basic.B09_Bucles;

public class DoWhile {
    public static void main(String[] args) {
        int number = 1;
        final int NUM_MAX = 10;

        do {
            System.out.println("X = " + number);
            number++;
        } while (number <= NUM_MAX);
    }
}