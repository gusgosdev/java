package Basic.B06_Conversiones;

public class StringToPrimitivo {
    public static void main(String[] args) {
        //conversion de String a char
        String texto = "hola";
        char caracter = texto.charAt(1);
        System.out.println(caracter);

        //----------------------------------------
        String numero = "10";

        //String a byte
        byte num1 = Byte.parseByte(numero);
        System.out.println("String a byte: " + num1);
        byte num2 = Byte.valueOf(numero);
        System.out.println("String a byte otra forma: " + num2);

        //String a short
        short num3 = Short.parseShort(numero);
        System.out.println("String a short: " + num3);
        short num4 = Short.valueOf(numero);
        System.out.println("String a short otra forma: " + num4);

        //String a int
        int num5 = Integer.parseInt(numero);
        System.out.println("String a int " + num5);
        int num6 = Integer.valueOf(numero);
        System.out.println("String a int otra forma: " + num6);

        //String a long
        long num7 = Long.parseLong(numero);
        System.out.println("String a long: " + num7);
        long num8 = Long.valueOf(numero);
        System.out.println("String a long otra forma: " + num8);

        //String a float
        float num9 = Float.parseFloat(numero);
        System.out.println("String a float: "+num9);
        float num10 = Float.valueOf(numero);
        System.out.println("String a float otra forma: "+num10);

        //String a double
        double num11 = Double.parseDouble(numero);
        System.out.println("String a double: "+num11);
        double num12 = Double.valueOf(numero);
        System.out.println("String a double otra forma: "+num12);
    }
}