package org.Jose.Estrada.MildredSofia.pixup.historial;

import java.util.ArrayList;
import java.util.List;

public class historial implements historiales {
    private List<String> registros; // Lista para almacenar los registros

    public historial() {
        this.registros = new ArrayList<>();
    }

    @Override
    public void agregarRegistro(String registro) {
        registros.add(registro);
        System.out.println("Registro agregado: " + registro);
    }

    @Override
    public void mostrarRegistros() {
        System.out.println("\n=== Historial de Registros ===");
        if (registros.isEmpty()) {
            System.out.println("No hay registros en el historial.");
        } else {
            for (int i = 0; i < registros.size(); i++) {
                System.out.println((i + 1) + ". " + registros.get(i));
            }
        }
    }
}