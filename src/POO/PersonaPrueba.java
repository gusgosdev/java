package POO;

public class PersonaPrueba {
    public static void main(String[] args) {
        // Info inicial
        Persona persona1 = new Persona("Juan", 34);
        Persona persona2 = new Estudiante("Robert", 23, "primero");

        persona1.mostrarInfo();
        persona2.mostrarInfo();
    }
}