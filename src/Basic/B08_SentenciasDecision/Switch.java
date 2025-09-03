package Basic.B08_SentenciasDecision;

public class Switch {
    public static void main(String[] args) {
        int number = 4;

        switch (number) {
            case 1:
                System.out.println("Se ejecutó el caso 1");
                break;
            case 2:
                System.out.println("Se ejecutó el caso 2");
                break;
            case 3:
                System.out.println("Se ejecutó el caso 3");
                break;
            case 4:
                System.out.println("Se ejecutó el caso 4");
                break;
            case 5:
                System.out.println("Se ejecutó el caso 5");
                break;
            default:
                System.out.println("Este es el valor default");
        }
    }
}