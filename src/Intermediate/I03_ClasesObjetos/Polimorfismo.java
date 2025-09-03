package Intermediate.I03_ClasesObjetos;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1();
        animal1.sonido();

        Animal1 animal2 = new Perro1();
        animal2.sonido();

        Animal1 animal3 = new Gato1();
        animal3.sonido();
    }
}

class Animal1 {
    public void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro1 extends Animal1 {
    @Override
    public void sonido() {
        System.out.println("El perro ladra");
    }
}

class Gato1 extends Animal1 {
    @Override
    public void sonido() {
        System.out.println("El gato maulla");
    }
}