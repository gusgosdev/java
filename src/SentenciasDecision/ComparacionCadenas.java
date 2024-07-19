package SentenciasDecision;

import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona una cadena: ");

        var cadena1 = "juan";
        var cadena2 = consola.nextLine();

        //Comparacion de cadenas en Java (apuntan al espacio en memoria)
        if(cadena1 == cadena2){
            System.out.println("Apuntan al mismo objeto");
        }
        else{
            System.out.println("Apuntan a distintos objetos");
        }

        // Comparar el contenido (apunta al contenido de la variable)
        if(cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las cadenas son iguales");
        }
        else{
            System.out.println("Las cadenas son distintas");
        }
    }
}