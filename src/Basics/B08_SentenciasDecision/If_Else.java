package Basics.B08_SentenciasDecision;

public class If_Else {
    public static void main(String[] args) {
        int adult = 18;
        int age = 17;

        System.out.println("Tu edad es " + age);
        // Sentencia de decisión
        if (age >= adult){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}