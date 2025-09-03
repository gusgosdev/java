package POO.animales.clases;

public class Perro extends Animal {
    public Perro(String name, String tipoMascota) {
        super(name, tipoMascota);
    }

    @Override
    public void mostrarID() {
        System.out.println("Datos mascota: ");
        System.out.println("\tID: " + getIdAnimal() + " Nombre: " + getNombre() + " Tipo de mascota: " + getTipoMascota() + "\n");
    }
}