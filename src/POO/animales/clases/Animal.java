package POO.animales.clases;

public class Animal {
    private static int contadorAnimal;
    private final int idAnimal;
    private final String nombre;
    private final String tipoMascota;

    public Animal(String nombre, String tipoMascota) {
        this.idAnimal = ++contadorAnimal;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
    }

    public int getIdAnimal() {
        return idAnimal;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipoMascota() {
        return tipoMascota;
    }

    public void mostrarID() {
        System.out.println("Datos mascota: ");
        System.out.println("\tID: " + idAnimal + " Nombre: " + nombre + " Tipo de mascota: " + getTipoMascota() + "\n");
    }
}