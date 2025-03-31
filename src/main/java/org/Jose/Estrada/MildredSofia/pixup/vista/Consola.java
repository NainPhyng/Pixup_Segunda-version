package org.Jose.Estrada.MildredSofia.pixup.vista;

import org.Jose.Estrada.MildredSofia.pixup.historial.historial;
import org.Jose.Estrada.MildredSofia.pixup.historial.historiales;
import org.Jose.Estrada.MildredSofia.pixup.util.ReadUtil;

public class Consola implements Ejecutable {
    private static Consola consola; // Instancia única tipo Singleton
    private historiales historiales; // Referencia para trabajar con el historial

    private Consola() {}

    // Método Singleton para obtener una única instancia de Consola
    public static Consola getInstance() {
        if (consola == null) {
            consola = new Consola();
        }
        return consola;
    }

    @Override
    public void run() {
        boolean flag = true; // Controlador del bucle
        while (flag) {
            // Mostramos las opciones al usuario
            System.out.println("\n=== Consola ===");
            System.out.println("1. Agregar al historial");
            System.out.println("2. Mostrar historial");
            System.out.println("3. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            // Leemos la opción desde la entrada
            int opcion = ReadUtil.leerEntero("Selecciona una opción: ");
            switch (opcion) {
                case 1: // Agregar un registro al historial
                    String input = ReadUtil.leerString("Ingresa un texto para el historial: ");
                    if (historiales != null) {
                        historiales.agregarRegistro(input); // Agregamos al historial
                    } else {
                        System.out.println("Error: historial no inicializado.");
                    }
                    break;
                case 2: // Mostrar el historial completo
                    if (historiales != null) {
                        historiales.mostrarRegistros(); // Mostramos los registros guardados
                    } else {
                        System.out.println("No se ha inicializado un historial.");
                    }
                    break;
                case 3: // Salir del menú de consola
                    flag = false;
                    break;
                default: // Opción inválida
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    // Método para asociar un historial a la consola
    @Override
    public void addHistoriales(historiales historiales) {
        this.historiales = historiales;
    }
}