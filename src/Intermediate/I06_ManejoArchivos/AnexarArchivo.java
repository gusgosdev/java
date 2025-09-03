package Intermediate.I06_ManejoArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class AnexarArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("mensaje.txt");

        // Texto a agregar
        List<String> nuevasLineas = List.of(
                "Agregando más contenido",
                "Sin borrar el contenido anterior");

        try {
            Files.write(ruta, nuevasLineas, StandardOpenOption.APPEND);
            System.out.println("Texto anexado correctamente");
        } catch (IOException e) {
            System.out.println("Error al anexar información al archivo");
        }
    }
}