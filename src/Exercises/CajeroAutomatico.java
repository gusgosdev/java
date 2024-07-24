// En este ejercicio realizaremos un cajero automático, que nos va a permitir depositar, retirar y ver nuestro saldo
package Exercises;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("**** Cajero Automático ****");
        double saldo = 0.00;
        boolean salir = false;
        var consola = new Scanner(System.in);
        while (!salir){
            System.out.print("""
                    1. Ver saldo
                    2. Retirar dinero
                    3. Depositar dinero
                    4. Salir
                    Ingresa una opción:\s""");
            int opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> System.out.println("Su saldo es: $" + saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = Double.parseDouble(consola.nextLine());
                    if (retiro <= saldo){
                        saldo -= retiro;
                        System.out.println("Tu nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("No tiene saldo suficiente");
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var deposito = Double.parseDouble(consola.nextLine());
                    saldo += deposito;
                    System.out.println("Tu nuevo saldo es: $" + saldo);
                }
                case 4 -> {
                    System.out.println("Gracias por usar nuestro cajero.. Hasta luego!!!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida..");
            }
            System.out.println();
        }
    }
}