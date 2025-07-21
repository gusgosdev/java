package Basics.B06_Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        // Operador negativo
        int a = 3, b = -2, resultado;
        resultado = -a;
        System.out.println("a = " + a + " : " + "-a = " + resultado);
        resultado = -b;
        System.out.println("b = " + b + " : " + "-b = " + resultado);

        // Operador de incremento o decremento (incrementa o decrementa en uno)
        resultado = ++a; // pre-incremento
        System.out.println(resultado);
        a = 3;
        resultado = a++; // post-incremento
        System.out.println(resultado);
        System.out.println(a); // se aplica el incremento

        // Negacion (invertir el valor, de true a false y viceversa)
        var c = true;
        System.out.println("c = " + c);
        System.out.println("!c = " + !c);
    }
}