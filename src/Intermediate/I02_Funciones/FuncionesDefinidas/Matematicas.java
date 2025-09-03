package Intermediate.I02_Funciones.FuncionesDefinidas;

import java.util.Random;

public class Matematicas {
    public static void main(String[] args) {
        // Funciones metemáticas
        System.out.println("══════════════════════════════════════════════════");
        // -> Raíz cuadrada
        int num = 156;
        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada de " + num + " es = " + raiz);
        System.out.println("══════════════════════════════════════════════════");

        // -> Potencia
        int num1 = 2;
        int num2 = 3;
        double potencia = Math.pow(num1, num2);
        System.out.println("La potencia de " + num1 + " elevado a la " + num2 + " es = " + potencia);
        System.out.println("══════════════════════════════════════════════════");

        // -> Máximo y mínimo
        int maximo = Math.max(num1, num2);
        int minimo = Math.min(num1, num2);
        System.out.println("Entre " + minimo + " y " + maximo + ", el máximo es " + maximo + " y el mínimo es " + minimo);
        System.out.println("══════════════════════════════════════════════════");

        // -> Redondear
        double valor = 9.90;
        double redondeo = Math.round(valor);
        System.out.println("El redondeo de " + valor + " es " + redondeo);
        System.out.println("══════════════════════════════════════════════════");

        // -> Número aleatorio entre 0.0 y 1.0
        double aleatorio = Math.random();
        System.out.println("Número aleatorio: " + aleatorio);
        System.out.println("══════════════════════════════════════════════════");

        // -> Número aleatorio entre 0 y 100
        Random random = new Random();
        int random1 = random.nextInt(101);
        System.out.println("Número aleatorio: " + random1);
        System.out.println("══════════════════════════════════════════════════");

        // -> Número aleatorio entre 100 y 200
        int random2 = random.nextInt(100, 201);
        System.out.println("Número aleatorio: " + random2);
        System.out.println("══════════════════════════════════════════════════");
    }
}