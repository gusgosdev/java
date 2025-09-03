package Intermediate.I04_Colecciones;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> frutas = new java.util.ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Naranja");
        frutas.add("Plátano");
        frutas.add("Fresa");

        // Recorrer la lista
        for (String fruta: frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }
}