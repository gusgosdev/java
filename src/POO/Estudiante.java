package POO;

public class Estudiante extends Persona{
    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Nombre: %s | Edad: %d | Grado: %s%n", getNombre(), getEdad(), grado);
    }
}