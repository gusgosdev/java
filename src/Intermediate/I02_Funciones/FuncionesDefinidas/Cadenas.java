package Intermediate.I02_Funciones.FuncionesDefinidas;

public class Cadenas {
    public static void main(String[] args) {
        // Funciones para cadena
        String mensaje = "Hola Mundo";

        // -> Cantidad de caracteres
        mensaje.length();

        // -> Convertir a mayúsculas y minúsculas
        mensaje.toUpperCase();
        mensaje.toLowerCase();

        // -> Devolver el primer caracter
        mensaje.charAt(0);

        // -> Contiene parte de la cadena
        mensaje.contains("Mun");

        // -> Compara texto exacto
        mensaje.equals("hola mundo");

        // -> Reemplazar palaba (Mundo -> Java)
        mensaje.replace("Mundo", "Java");

        // -> Subcadenas
        String subcadena1 = mensaje.substring(0, 4); // el segundo numero se +1 porque no empieza en 0 como la cadena
        String subcadena2 = mensaje.substring(5); // desde este numero hasta el final
        System.out.println(subcadena1);
    }
}