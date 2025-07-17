package Basics;

public class Variables {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Basics.Variables ***");
        // Declarar variables
        int age = 21;           // De tipo int
        double sueldo = 140.50; // De tipo double
        String name = "Juan";   // De tipo string

        // Acceder a las variables (usamos concatenación)
        System.out.println(name + " tiene " + age + " años, y su salario es $" + sueldo);

        // Modificar el valor de una variable
        age = 25;
        sueldo = 850.55;
        System.out.println("Ahora tiene " + age + " años, y su salario es $" + sueldo);
    }
}
