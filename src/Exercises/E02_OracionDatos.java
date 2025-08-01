// Exercise 02
// Crear una oración utilizando diferentes tipos de datos.

package Exercises;

public class E02_OracionDatos {
    public static void main(String[] args) {
        // Variables con los datos
        String name = "Gustavo";
        byte age = 22;
        String course = "Java";
        double price = 24.99;

        // Formación de la oración
        String oracion = "Hola! me llamo " + name + " tengo " + age + " años, estoy aprendiendo " + course + " y este curso me costó $" + price + ".";

        // Mostrar en consola
        System.out.println(oracion);
    }
}