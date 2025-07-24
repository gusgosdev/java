package Basics.B10_SentenciasDecision;

public class IfElse {
    public static void main(String[] args) {
        // Sentencia de decision if / else
        boolean llueve = false;
        if (llueve) {
            System.out.println("Llevar paraguas");
        } else {
            System.out.println("No llevar paraguas");
        }
        System.out.println("********************");

        // Sentencia de decision if / else if / else
        boolean nublado = true;
        if (llueve){
            System.out.println("Llevar paraguas");
        } else if (nublado) {
            System.out.println("Llevar impermeable");
        } else {
            System.out.println("Dejar paraguas e impermeable");
        }
    }
}