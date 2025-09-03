package Intermediate.I06_ManejoArchivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("mensaje.txt");
        try {
            List<String> lineas = Files.readAllLines(ruta);
            // Leemos cada línea
            for (String linea: lineas) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}