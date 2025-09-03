package boleta;

import productos.Producto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Boleta {
    // Atributos
    private static int contadorBoleta;
    private final int idBoleta;
    private Producto[] productos;

    // Constructor
    public Boleta(Producto... productos) {
        this.idBoleta = ++contadorBoleta;
        this.productos = productos;
    }

    // Getters y Setters
    public int getIdBoleta() {
        return idBoleta;
    }

    // Método
    public void mostrarBoleta() {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        double total = 0;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tTienda El Vendedor S.A");
        System.out.println("\t\t\t\t\tR.U.C. 201030405060708090100");
        System.out.println("\t\t\t\tAv. José Messi 265, altura Cdra. 14");
        System.out.println("\t\t\t\t\t\tBOLETA ELECTRÓNICA N°" + getIdBoleta() + "\n");
        System.out.println("\t\tFecha: " + fechaHora.format(formatoFecha) + "\t\t\t\t\tHora: " + fechaHora.format(formatoHora));
        System.out.println("Tipo de moneda: PEN");
        System.out.println("Cajero :");
        System.out.println("Cliente: ");
        System.out.println("Doc. Identidad: ");
        System.out.println("-------------------------------");
        System.out.println("DESCRIPCIÓN");
        System.out.println("Productos:");
        for (Producto p : productos) {
            double subtotal = p.getPrecioProducto() * p.getCantidadProductos();
            total += subtotal;

            System.out.printf("%s (x%d)\t - P.Uni: S/.%.2f\t -> Subtotal: S/.%.2f%n",
                    p.getNombreProducto(),
                    p.getCantidadProductos(),
                    p.getPrecioProducto(),
                    subtotal);
        }
        double precioSinIGV = total / 1.18;
        double precioIGV = total - precioSinIGV;
        System.out.println("-------------------------------");
        System.out.printf("Precio sin IGV: \tS/.%.2f%n", precioSinIGV);
        System.out.printf("I.G.V. (18%%): \t\tS/.%.2f%n", precioIGV);
        System.out.println();
        System.out.printf("IMPORTE TOTAL: \t\tS/.%.2f%n", total);
        System.out.println("---------------------------------------------------------------------");
    }
}