package org.Jose.Estrada.MildredSofia.pixup.util;

import java.util.Scanner;

public class ReadUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        int numero;
        while (true) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        double numero;
        while (true) {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número decimal válido.");
            }
        }
    }

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static char leerChar(String mensaje) {
        System.out.print(mensaje);
        String input = scanner.nextLine();
        return input.isEmpty() ? ' ' : input.charAt(0);
    }

    public static void cerrarScanner() {
        scanner.close();
    }

    // Nuevo método para leer enteros opcionales
    public static Integer leerEnteroOpcional(String mensaje) {
        System.out.print(mensaje); // Mostrar el mensaje de solicitud
        String input = scanner.nextLine(); // Leer la entrada como texto
        if (input.isEmpty()) { // Si el usuario no escribe nada y presiona Enter
            return null; // Retornar null como valor opcional
        }
        try {
            return Integer.parseInt(input); // Convertir la entrada a un número entero
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido o deje vacío para omitir.");
            return leerEnteroOpcional(mensaje); // Reintentar la entrada
        }
    }
}