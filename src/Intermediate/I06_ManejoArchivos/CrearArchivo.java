package Intermediate.I06_ManejoArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CrearArchivo {
    public static void main(String[] args) {
        // Ruta del archivo
        Path ruta = Paths.get("mensaje.txt");

        // Contenido a escribir
        List<String> lineas = List.of(
                "Hola desde Java NIO",
                "Este archivo fue creado con java NIO",
                "Es rápido, moderno y fácil de usar");

        try {
            Files.write(ruta, lineas);
            System.out.println("Archivo creado con éxito");
        } catch (IOException e) {
            System.out.println("ERROR al escribir o crear archivo: " + e.getMessage());
        }
    }
}