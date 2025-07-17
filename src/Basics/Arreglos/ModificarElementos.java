package Basics.Arreglos;

public class ModificarElementos {
    public static void main(String[] args) {
        // Creamos el arreglo
        int[] numeros = new int[5];

        // Modificamos sus valores (no es necesario modificar todos, tienen 0 por default)
        numeros[0] = 12;
        numeros[1] = 20;
        numeros[4] = 5;

        // Ver el elemento en la consola
        System.out.println("El valor del indice 4 es:" + numeros[4]);
    }
}