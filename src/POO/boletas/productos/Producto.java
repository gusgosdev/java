package productos;

public class Producto {
    // Atributos
    private final String nombreProducto;
    private final double precioProducto;
    private final int cantidadProductos;

    // Constructor
    public Producto(String nombreProducto, double precioProducto, int cantidadProductos) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProductos = cantidadProductos;
    }

    // Getters
    public String getNombreProducto() { return this.nombreProducto; }
    public double getPrecioProducto() { return this.precioProducto; }
    public int getCantidadProductos() { return this.cantidadProductos; }
    public double getPrecioTotal() { return this.precioProducto * this.cantidadProductos; }

    // Método
    public void mostrarInfo() {
        System.out.println("------------------------------------------------");
        System.out.printf("%s (x%d unids.)%n", getNombreProducto(), getCantidadProductos());
        System.out.printf("P.Uni:   S/.%.2f%n", getPrecioProducto());
        System.out.printf("P.Total: S/.%.2f%n", getPrecioTotal());
        System.out.println("------------------------------------------------");
    }
}