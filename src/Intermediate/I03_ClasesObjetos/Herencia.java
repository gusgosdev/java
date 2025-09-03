package Intermediate.I03_ClasesObjetos;

public class Herencia {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sonido();

        Perro animal1 = new Perro();
        animal1.sonido();
        animal1.ladrar();

        Gato animal2 = new Gato();
        animal2.sonido();
        animal2.maullar();
    }
}

class Animal {
    public void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    public void ladrar() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    public void maullar() {
        System.out.println("El gato maulla");
    }
}