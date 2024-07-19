// En este ejercicio verificaremos que el usuario y contraseña de un usuario sean correctas
package exercises;

import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final String USUARIO_VALIDO = "admin";
        final String PASSWORD_VALIDO = "123";
        System.out.println("*** Sistema de autenticación ***");
        System.out.print("Proporciona tu usuario: ");
        String usuario = consola.nextLine();
        System.out.print("Proporciona tu contraseña: ");
        String password = consola.nextLine();

        // Verificamos los datos
        if (USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password)) {
            System.out.println("Ingresando al sistema...bienvenido!!!");
        } else if (!USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password)) {
            System.out.println("Usuario incorrecto");
        } else if (USUARIO_VALIDO.equals(usuario) && !PASSWORD_VALIDO.equals(password)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Datos incorrectos");
        }
    }
}