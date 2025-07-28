package Basics.B06_Conversiones;

public class PrimitivoToString {
    public static void main(String[] args) {
        //Declaración de variables
        String numero = "";

        //byte a String
        byte num1 = 1;

        numero = Byte.toString(num1);
        System.out.println("byte a String (forma 1): " + numero);
        numero = String.valueOf(num1);
        System.out.println("byte a String (forma 2): " + numero);
        numero = num1 + "";
        System.out.println("byte a String (forma 3): " + numero);

        //short a String
        short num2 = 2;

        numero = Short.toString(num2);
        System.out.println("short a String (forma 1): " + numero);
        numero = String.valueOf(num2);
        System.out.println("short a String (forma 2): " + numero);
        numero = num2 + "";
        System.out.println("short a String (forma 3): " + numero);

        //int a String
        int num3 = 3;

        numero = Integer.toString(num3);
        System.out.println("int a String (forma 1): " + numero);
        numero = String.valueOf(num3);
        System.out.println("int a String (forma 2): " + numero);
        numero = num3 + "";
        System.out.println("int a String (forma 3): " + numero);

        //long a String
        long num4 = 4l;

        numero = Long.toString(num4);
        System.out.println("long a String (forma 1): " + numero);
        numero = String.valueOf(num4);
        System.out.println("long a String (forma 2): " + numero);
        numero = num4 + "";
        System.out.println("long a String (forma 3): " + numero);

        //float a String
        float num5 = 5.0f;

        numero = Float.toString(num5);
        System.out.println("float a String (forma 1): " + numero);
        numero = String.valueOf(num5);
        System.out.println("float a String (forma 2): " + numero);
        numero = num5 + "";
        System.out.println("float a String (forma 3): " + numero);

        //double a String
        double num6 = 6.0;

        numero = Double.toString(num6);
        System.out.println("double a String (forma 1): " + numero);
        numero = String.valueOf(num6);
        System.out.println("double a String (forma 2): " + numero);
        numero = num6 + "";
        System.out.println("double a String (forma 3): " + numero);

        //char a String
        char caracter = 'b';
        String texto = Character.toString(caracter);
        System.out.println("char a String: "+texto);
    }
}
