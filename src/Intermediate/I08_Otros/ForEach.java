package Intermediate.I08_Otros;

public class ForEach {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Pera", "Plátano", "Fresa", "Uva"};

        // For Each
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        System.out.println("-------------------------");

        // For tradicional
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
        }
    }
}