package POO.boletas;

import boleta.Boleta;
import productos.Producto;

public class Main {
    // BD simulada
    public static String[] productosName = {"Medias", "Zapatillas", "Zapatos de vestir", "Pantalón", "Gorro", "Polo", "Buzo", "Camisa"};
    public static double[] productosPrice = {4.90, 189.90, 219.90, 49.90, 29.90, 59.90, 54.90, 89.90};

    public static void main(String[] args) {
        // Mostrar los productos
        System.out.println("===== Lista de Productos =====");
        for (int i = 0; i < productosName.length; i++) {
            System.out.printf("%d. %s \t\t- S/.%.2f%n", (i + 1), productosName[i], productosPrice[i]);
        }

        // Productos creados
        Producto producto1 = new Producto(productosName[0], productosPrice[0], 3);
        Producto producto2 = new Producto(productosName[1], productosPrice[1], 5);
        Producto producto3 = new Producto(productosName[2], productosPrice[2], 2);
        Producto producto4 = new Producto(productosName[3], productosPrice[3], 1);
        Producto producto5 = new Producto(productosName[4], productosPrice[4], 2);
        Producto producto6 = new Producto(productosName[6], productosPrice[6], 4);
        Producto producto7 = new Producto(productosName[7], productosPrice[7], 6);
        Producto producto8 = new Producto(productosName[0], productosPrice[0], 3);
        Producto producto9 = new Producto(productosName[5], productosPrice[5], 9);
        Producto producto10 = new Producto(productosName[4], productosPrice[4], 11);
        Producto producto11 = new Producto(productosName[1], productosPrice[1], 20);

        // Crear boletas
        Boleta boleta1 = new Boleta(producto5, producto11);
        boleta1.mostrarBoleta();
        Boleta boleta2 = new Boleta(producto3, producto4, producto1);
        boleta2.mostrarBoleta();
        Boleta boleta3 = new Boleta(producto8);
        boleta3.mostrarBoleta();
        Boleta boleta4 = new Boleta(producto6, producto9, producto2);
        boleta4.mostrarBoleta();
        Boleta boleta5 = new Boleta(producto7, producto10);
        boleta5.mostrarBoleta();
    }
}