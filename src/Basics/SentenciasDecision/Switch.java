package Basics.SentenciasDecision;

public class Switch {
    public static void main(String[] args) {
        int mes = 7;
        String estacion;

        switch (mes) {
            /*case 1: case 2: case 3:
                estacion = "Otoño!!";
                break;
            case 4: case 5: case 6:
                estacion = "Invierno!!";
                break;
            case 7: case 8: case 9:
                estacion = "Primavera!!";
                break;
            case 10: case 11: case 12:
                estacion = "Verano!!";
            default:
                estacion = "Estación desconocida..";*/

            case 1, 2, 3 -> estacion = "Otoño!!";
            case 4, 5, 6 -> estacion = "Invierno!!";
            case 7, 8, 9 -> estacion = "Primavera!!";
            case 10, 11, 12 -> estacion = "Verano!!";
            default -> estacion = "Estación desconocida..";
        }
        System.out.println("La estacion es " + estacion);
    }
}