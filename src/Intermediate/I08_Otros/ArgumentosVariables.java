package Intermediate.I08_Otros;

public class ArgumentosVariables {
    public static void main(String[] args) {
        // Los argumentos variables no tienen limites como un array
        System.out.println(sumar());
        System.out.println(sumar(1, 2));
        System.out.println(sumar(1, 2, 3, 4));
        System.out.println(sumar(12, 13, 14, 15));
    }

    public static int sumar(int... numero) {
        int suma = 0;
        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }
        return suma;
    }
}