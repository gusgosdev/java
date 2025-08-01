// Exercise 04
// Mostrar en consola la decisión de acuerdo al clima.

package Exercises;

public class E04_DecisionClima {
    public static void main(String[] args) {
        // Variables del clima
        boolean rain = false;
        boolean nublado = false;

        // Tomar la decisión de acuerdo al clima
        if (rain && nublado){
            System.out.println("Llevar impermeable y paraguas");
        } else if (rain) {
            System.out.println("Llevar paraguas");
        } else if (nublado) {
            System.out.println("Llevar impermeable");
        } else {
            System.out.println("Dejar paraguas e impermeable");
        }
    }
}