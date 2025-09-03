package Intermediate.I03_ClasesObjetos;

abstract class Animal3 {
    public void mostrar() {
        System.out.println("El animal está durmiendo...");
    }

    public abstract void sonido();
}

class Perro2  extends Animal3{
    @Override
    public void sonido() {
        System.out.println("El perro hace guau guau");
    }
}

class Gato2 extends Animal3 {
    @Override
    public void sonido() {
        System.out.println("El gato hace miau miau");
    }
}

public class ClasesAbstractas {
    public static void main(String[] args) {
        Animal3 animal1 = new Perro2();
        animal1.mostrar();
        animal1.sonido();

        Animal3 animal2 = new Gato2();
        animal2.mostrar();
        animal2.sonido();
    }
}