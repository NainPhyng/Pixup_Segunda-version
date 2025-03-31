package org.Jose.Estrada.MildredSofia.pixup.inicio;

import org.Jose.Estrada.MildredSofia.pixup.historial.historial;
import org.Jose.Estrada.MildredSofia.pixup.historial.historiales;
import org.Jose.Estrada.MildredSofia.pixup.vista.Consola;
import org.Jose.Estrada.MildredSofia.pixup.vista.Menu;
import org.Jose.Estrada.MildredSofia.pixup.vista.Ventana;
import org.Jose.Estrada.MildredSofia.pixup.util.ReadUtil;

public class Inicio {

    // Método principal
    public static void main(String[] args) {
        boolean ejecutando = true;
        historiales miHistorial = new historial();

        while (ejecutando) {
            System.out.println("Selecciona una opción:");
            System.out.println("1.- Menú de Pixup");
            System.out.println("2.- Consola");
            System.out.println("3.- Ventana");
            System.out.println("4.- Mostrar Historial");
            System.out.println("5.- Salir");

            int opcion = ReadUtil.leerEntero("Selecciona una opcion: ");

            switch (opcion) {
                case 1:
                    Menu.principal();
                    break;

                case 2:
                    Consola consola = Consola.getInstance(); // Parte Singleton
                    consola.addHistoriales(miHistorial);     // Asociar el historial global
                    consola.run();                           // Ejecuta el menú de la consola
                    break;

                case 3:
                    Ventana ventana = Ventana.getInstance(); // Esta parte es Singleton
                    ventana.addHistoriales(miHistorial);     // Asociar el historial
                    ventana.run();                           // Mostrar la ventana
                    break;

                case 4:
                    System.out.println("--- Historial de Registros");
                    miHistorial.mostrarRegistros();// Mostrar todas las entradas del historial
                    break;

                case 5:
                    ejecutando = false;// Termina el programa
                    break;

                default:
                    System.out.println("Opcion inválida,intenta nuevamente.");
                    break;
            }
        }
    }
}