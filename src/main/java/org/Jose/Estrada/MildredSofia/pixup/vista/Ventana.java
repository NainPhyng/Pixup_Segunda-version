package org.Jose.Estrada.MildredSofia.pixup.vista;

import org.Jose.Estrada.MildredSofia.pixup.historial.historial;
import org.Jose.Estrada.MildredSofia.pixup.historial.historiales;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana; // Instancia Singleton de Ventana
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private historiales historial; // Usamos la interfaz para mayor flexibilidad

    private Ventana() {
        super("Ventana de Pixup");
        init();
    }

    // Método para inicializar los componentes de la ventana
    private void init() {
        // Configuración de componentes de la ventana
        jLabel = new JLabel("Bienvenido a Pixup");
        jLabel.setBounds(10, 10, 150, 20);

        jTextField = new JTextField();
        jTextField.setBounds(160, 10, 100, 20);

        jButton = new JButton("Registrar");
        jButton.setBounds(10, 40, 100, 20);

        // Acción del botón
        jButton.addActionListener(p -> {
            String input = jTextField.getText(); // Obtenemos texto ingresado
            if (!input.isEmpty()) {
                if (historial != null) {
                    historial.agregarRegistro(input);
                    System.out.println("Entrada registrada: " + input);
                } else {
                    System.out.println("Error: Historial no inicializado.");
                }
            } else {
                System.out.println("Por favor, ingresa un texto válido.");
            }
        });

        // Añadimos componentes al frame
        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(jTextField);
        getContentPane().add(jButton);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // Implementación del patrón Singleton
    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    // Método para ejecutar la ventana
    @Override
    public void run() {
        setBounds(100, 100, 400, 300);
        setVisible(true);
    }

    // Implementación del método addHistoriales de la interfaz Ejecutable
    @Override
    public void addHistoriales(historiales historiales) {
        this.historial = historiales;
    }

    // Clase main para probar la ventana
    public static void main(String[] args) {
        historiales historialGlobal = new historial(); // Creamos un historial global
        Ventana ventana = Ventana.getInstance();       // Obtenemos la instancia Singleton
        ventana.addHistoriales(historialGlobal);       // Asociamos el historial
        ventana.run();                                 // Ejecutamos la ventana
    }
}