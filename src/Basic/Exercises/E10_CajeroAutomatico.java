// Exercise 10
// Simular un cajero automático que tenga opciones de ver saldo, depositar y retirar.
// Mostrar la hora de inicio, finalizar y calcular la duración de uso.

package Basic.Exercises;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class E10_CajeroAutomatico {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int option      = 0;
        int saldo       = 120;
        int retiro;
        LocalDateTime hour          = LocalDateTime.now();
        DateTimeFormatter formatDay = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatHour = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("═══════════════════════════════════════════");
        System.out.println("     💳  Bienvenido al Cajero BCG  💳     ");
        System.out.println("═══════════════════════════════════════════");
        System.out.println("Fecha: " + hour.format(formatDay) + "            Hora: " + hour.format(formatHour) + "\n");

        while (option != 4) {
            System.out.println("Opciones disponibles:");
            System.out.println("1️⃣ Ver saldo");
            System.out.println("2️⃣ Retirar");
            System.out.println("3️⃣ Depositar");
            System.out.println("4️⃣ Salir\n");

            System.out.print("Ingresa una opción: ");
            option = console.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("Tu saldo actual es: S/." + String.format("%.2f", (double) saldo));
                    System.out.println("--------------------------------------------------\n");
                }
                case 2 -> {
                    if (saldo == 0) {
                        System.out.println("\n--------------------------------------------------");
                        System.out.println("❌ No puedes retirar");
                        System.out.println("Saldo actual: S/." + String.format("%.2f", (double) saldo));
                        System.out.println("--------------------------------------------------\n");
                    } else {
                        System.out.println("\n--------------------------------------------------");
                        System.out.println("Saldo actual: S/." + String.format("%.2f", (double) saldo));
                        System.out.print("Ingresa el monto a retirar: ");
                        retiro = console.nextInt();
                        System.out.println("--------------------------------------------------");

                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("✅ Retiro exitoso");
                            System.out.println("Saldo actual: S/." + String.format("%.2f", (double) saldo));
                            System.out.println("--------------------------------------------------\n");
                        } else if (retiro <= 0) {
                            System.out.println("❌ El monto debe ser mayor que 0.");
                            System.out.println("--------------------------------------------------\n");
                        } else {
                            System.out.println("❌ Fondos insuficientes");
                            System.out.println("--------------------------------------------------\n");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("\n--------------------------------------------------");
                    System.out.print("Ingresa el monto a depositar: ");
                    int deposito = console.nextInt();
                    System.out.println("--------------------------------------------------");

                    if (deposito <= 0) {
                        System.out.println("❌ No puedes depositar. El monto debe ser mayor a 0");
                        System.out.println("Saldo actual: S/." + String.format("%.2f", (double) saldo));
                        System.out.println("--------------------------------------------------\n");
                    } else {
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso");
                        System.out.println("Saldo actual: S/." + String.format("%.2f", (double) saldo));
                        System.out.println("--------------------------------------------------\n");
                    }
                }
                case 4 -> {
                    System.out.println("\n--------------------------------------------------");
                    System.out.print("¿Estás seguro de que quieres salir? (s/n): ");
                    char confirmar = console.next().toLowerCase().charAt(0);

                    if (confirmar == 's') {
                        LocalDateTime hourExit              = LocalDateTime.now();
                        DateTimeFormatter formatExitDay     = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        DateTimeFormatter formatExitHour    = DateTimeFormatter.ofPattern("HH:mm:ss");
                        Duration sessionDuration = Duration.between(hour, hourExit);
                        long minutes = sessionDuration.toMinutes();
                        long seconds = sessionDuration.getSeconds() % 60;

                        System.out.println("--------------------------------------------------\n");
                        System.out.println("👋 Gracias por usar el BCG");
                        System.out.println("Sesión finalizada el " + hourExit.format(formatExitDay) + " a las " + hourExit.format(formatExitHour));
                        System.out.printf("Duración de la sesión: %d min %d seg\n", minutes, seconds);
                        System.out.println("¡Hasta pronto!\n");
                    } else {
                        option = 0;
                        System.out.println("--------------------------------------------------\n");
                    }
                }
                default -> {
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("❌ Opción inválida");
                    System.out.println("Por favor elige una opción del 1 al 4");
                    System.out.println("--------------------------------------------------\n");
                }
            }
        }
        console.close();
    }
}