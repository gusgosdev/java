package Exercises;

public class E02_ParImpar {
    public static void main(String[] args) {
        final int NUMERO = 44;
        String par;

        if (NUMERO % 2 == 0) {
            par = "par";
        } else {
            par = "impar";
        }

        System.out.println(NUMERO + " es numero " + par);
    }
}
