package Basics.B06_Conversiones;

public class EntrePrimitivos {
    public static void main(String[] args) {
        // Declaración de variables
        byte num1 = 100;
        int num2 = 1300;

        float num3 = 4000.123f;
        double num4 = 5000.123456789123123;

        // Conversión de ampliacion primitiva (implícita / automática)
//        num2 = num1;
//        System.out.println(num1);
//        System.out.println(num2);
//
//        num4 = num3;
//        System.out.println(num3);
//        System.out.println(num4);

        // Conversión de estrechamiento primitivo (explícita / manual)
        num1 = (byte) num2;
        System.out.println(num1);
        System.out.println(num2);

        num3 = (float) num4;
        System.out.println(num3);
        System.out.println(num4);
    }
}
