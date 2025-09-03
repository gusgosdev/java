package Intermediate.I03_ClasesObjetos;

public class Clases {
    String name;
    int age;

    public void saludar() {
        System.out.println("Hola, mi nombre es " + name + " y tengo " + age + " años.");
    }

    public static void main(String[] args) {
        // Objeto 1
        // -> Crear un objeto
        Clases persona1 = new Clases();

        // -> Asignar datos
        persona1.name = "Lionel";
        persona1.age = 28;

        // -> Llamar al método
        persona1.saludar();

        // ----------------------------------------------------------------------------------
        // Objeto 2
        Clases persona2 = new Clases();
        persona2.name = "Cristiano";
        persona2.age = 26;
        persona2.saludar();
    }
}