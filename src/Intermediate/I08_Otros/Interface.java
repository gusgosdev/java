package Intermediate.I08_Otros;

public interface Interface {
    // El método ya es public y abstract
    void volar();
}

class Pajaro implements Interface {
    @Override
    public void volar() {
        System.out.println("El pájaro está volando");
    }
}

class PruebaInterface {
    public static void main(String[] args) {
        Interface pajaro = new Pajaro();
        pajaro.volar();
    }
}