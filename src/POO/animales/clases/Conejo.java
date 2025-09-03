package POO.animales.clases;

public class Conejo extends Animal {
    public Conejo(String name, String tipoMascota) {
        super(name, tipoMascota);
    }

    @Override
    public void mostrarID() {
        System.out.println("Datos mascota: ");
        System.out.println("\tID: " + getIdAnimal() + " Nombre: " + getNombre() + " Tipo de mascota: " + getTipoMascota() + "\n");
    }
}