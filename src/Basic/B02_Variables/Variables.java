package Basic.B02_Variables;

public class Variables {
    public static void main(String[] args) {
        // Declarar e inicializar las variables
        String name = "Lionel";
        String lastName = "Messi";
        int age = 38;
        double height = 1.70;

        // Crear la oración (usamos concatenación)
        String frase = "Hola, me llamo " + name + " " + lastName + ", tengo " + age + " años y mido " + height + " mtrs";

        // Mostrar en consola
        System.out.println(frase);
    }
}