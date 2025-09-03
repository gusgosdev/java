package Intermediate.I08_Otros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class FuncionesLambda {
    public static void main(String[] args) {
        // Función básica de un parámetro
        Consumer<String> saludar = nombre -> System.out.println("Hola " + nombre);

        // Usamos la funcion lambda
        saludar.accept("Ana");

        // --------------------------------------------------
        // Función con 2 parámetros
        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
        int resultado = suma.apply(5, 3);
        System.out.println("La suma es: " + resultado);

        // --------------------------------------------------
        // Uso de forEach
        List<String> miLista = new ArrayList<>(
                List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
        );

        // Recorrer los elementos de la lista
        miLista.forEach(elemento -> System.out.println("Día: " + elemento));

        // --------------------------------------------------
        // Método de referencia
        // Definimos una lista
        List<String> nombres = Arrays.asList("Cristina", "Rebeca", "Paola");
        System.out.println("\nLista de nombres: ");
        nombres.forEach(System.out::println);
    }
}