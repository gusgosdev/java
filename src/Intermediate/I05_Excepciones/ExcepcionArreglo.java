package Intermediate.I05_Excepciones;

public class ExcepcionArreglo {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int varia = 10;

        try {
            System.out.println(arreglo1[varia]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice " + varia + " fuera de alcance");
            System.out.println("El arreglo contiene " + arreglo1.length + " datos");
        } finally {
            System.out.println("Programa terminado");
        }
    }
}