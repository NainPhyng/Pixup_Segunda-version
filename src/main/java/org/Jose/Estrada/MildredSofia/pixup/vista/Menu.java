package org.Jose.Estrada.MildredSofia.pixup.vista;

import org.Jose.Estrada.MildredSofia.pixup.CrearOrden.DetalleOrden;
import org.Jose.Estrada.MildredSofia.pixup.CrearOrden.Orden;
import org.Jose.Estrada.MildredSofia.pixup.AgregarDisco.Artista;
import org.Jose.Estrada.MildredSofia.pixup.AgregarDisco.Disco;
import org.Jose.Estrada.MildredSofia.pixup.historial.historial;
import org.Jose.Estrada.MildredSofia.pixup.historial.historiales;
import org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario.*;
import org.Jose.Estrada.MildredSofia.pixup.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static List<Disco> listaDiscos = new ArrayList<>(); // Lista de discos disponibles, porque pues hay muchos discos xd
    private static List<Orden> listaOrdenes = new ArrayList<>(); // Lista de ordenes creadas, para un mejor control
    private static historiales miHistorial = new historial(); // Historial de acciones que hicimos
    private static List<Usuario> lista = new ArrayList<>();
    // Método principal del menú
    public static void principal() {
        boolean mostrarMenu = true;

        while (mostrarMenu) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1.- Registrar Usuario");
            System.out.println("2.- Gestión de Discos");
            System.out.println("3.- Crear Orden");
            System.out.println("4.- Mostrar Historial");
            System.out.println("5.- Salir");

            int opcion = ReadUtil.leerEntero("Selecciona una opción: ");

            switch (opcion) {
                case 1:
                    solicitarDatosUsuario();
                    break;

                case 2:
                    gestionDiscos();
                    break;

                case 3:
                    crearOrden();
                    break;

                case 4:
                    mostrarHistorial();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    mostrarMenu = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }
    }

    // En la clase Menu
    public static void solicitarDatosUsuario() {
        System.out.println("\n=== Registro de Nuevo Usuario ===");

        // Datos del usuario
        Integer idUsuario = ReadUtil.leerEntero("ID del usuario: ");
        String nombre = ReadUtil.leerString("Nombre: ");
        String primerApellido = ReadUtil.leerString("Primer Apellido: ");
        String segundoApellido = ReadUtil.leerString("Segundo Apellido (opcional): ");
        String email = ReadUtil.leerString("Correo Electrónico: ");
        String rfc = ReadUtil.leerString("RFC: ");
        String password = ReadUtil.leerString("Contraseña: ");
        TipoNotificacion tipoNotificacion = new TipoNotificacion(1, "Correo Electrónico");

        // Datos del domicilio
        System.out.println("\n=== Registro de Domicilio ===");
        List<Domicilio> domicilios = new ArrayList<>();
        boolean agregarOtroDomicilio = true;

        while (agregarOtroDomicilio) {
            String calle = ReadUtil.leerString("Calle: ");
            int numeroExterior = ReadUtil.leerEntero("Número Exterior: ");
            Integer numeroInterior = ReadUtil.leerEnteroOpcional("Número Interior (opcional, presiona Enter para omitir): ");

            // Simular datos de colonia, municipio y tipo de domicilio si no se obtienen dinámicamente
            Colonia colonia = new Colonia(
                    1, // ID de la colonia
                    "Colonia Ejemplo", // Nombre de la colonia
                    new Municipio(1, "Municipio Ejemplo", new Estado(1, "Estado Ejemplo"))
            );
            TipoDomicilio tipoDomicilio = new TipoDomicilio(1, "Casa");

            // Crear el objeto domicilio y añadirlo a la lista
            Domicilio domicilio = new Domicilio(1, calle, numeroExterior, numeroInterior, null, colonia, tipoDomicilio);
            domicilios.add(domicilio);

            // Preguntar si desea agregar otro domicilio
            char continuar = ReadUtil.leerChar("¿Agregar otro domicilio? (s/n): ");
            agregarOtroDomicilio = (continuar == 's' || continuar == 'S');
        }

        // Crear una instancia del usuario con todos los datos y domicilios registrados
        Usuario usuario = new Usuario(idUsuario, nombre, primerApellido, segundoApellido, password, email, rfc, tipoNotificacion, domicilios);

        // Guardar este usuario en la lista de usuarios
        lista.add(usuario);
        System.out.println("¡Usuario registrado exitosamente!");
    }

    // Menú de gestión de discos
    private static void gestionDiscos() {
        boolean enGestionDiscos = true;

        while (enGestionDiscos) {
            System.out.println("\n=== Gestión de Discos ===");
            System.out.println("1. Agregar Disco");
            System.out.println("2. Mostrar Discos");
            System.out.println("3. Volver al Menú Principal");

            int opcion = ReadUtil.leerEntero("Selecciona una opción: ");
            switch (opcion) {
                case 1:
                    agregarDisco();
                    break;

                case 2:
                    mostrarDiscos();
                    break;

                case 3:
                    enGestionDiscos = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }
    }

    // Método para agregar un disco nuevo
    private static void agregarDisco() {
        System.out.println("=== Agregar Disco ===");
        int id = listaDiscos.size() + 1;
        String titulo = ReadUtil.leerString("Título del disco: ");
        double precio = ReadUtil.leerDouble("Precio: ");
        String formato = ReadUtil.leerString("Formato (CD/Vinilo): ");
        int stock = ReadUtil.leerEntero("Stock disponible: ");
        String nombreArtista = ReadUtil.leerString("Nombre del artista: ");

        Artista artista = new Artista(id, nombreArtista);
        Disco nuevoDisco = new Disco(id, titulo, precio, formato, stock, new ArrayList<>(), artista);

        listaDiscos.add(nuevoDisco);
        miHistorial.agregarRegistro("Disco agregado: " + nuevoDisco);
        System.out.println("Disco agregado exitosamente!");
    }

    // Mostrar los discos disponibles
    private static void mostrarDiscos() {
        System.out.println("\n=== Lista de Discos ===");
        if (listaDiscos.isEmpty()) {
            System.out.println("No hay discos registrados.");
        } else {
            listaDiscos.forEach(disco -> System.out.println(disco));
        }
    }

    // Crear una nueva orden con discos existentes
    private static void crearOrden() {
        System.out.println("\n=== Crear Orden ===");
        if (listaDiscos.isEmpty()) {
            System.out.println("No hay discos disponibles para crear una orden.");
            return;
        }

        List<DetalleOrden> detallesOrden = new ArrayList<>();
        boolean agregandoDetalles = true;

        while (agregandoDetalles) {
            System.out.println("\n=== Discos Disponibles ===");
            listaDiscos.forEach(disco -> System.out.println(disco));

            int discoId = ReadUtil.leerEntero("ID del disco que deseas agregar (0 para terminar): ");
            if (discoId == 0) {
                break;
            }

            Disco discoSeleccionado = listaDiscos.stream()
                    .filter(disco -> disco.getId() == discoId)
                    .findFirst()
                    .orElse(null);

            if (discoSeleccionado == null) {
                System.out.println("Disco no encontrado. Intenta nuevamente.");
                continue;
            }

            int cantidad = ReadUtil.leerEntero("Cantidad del disco seleccionado: ");
            double precioTotal = discoSeleccionado.getPrecio() * cantidad;

            DetalleOrden detalle = new DetalleOrden(detallesOrden.size() + 1, cantidad, precioTotal, null, discoSeleccionado);
            detallesOrden.add(detalle);

            System.out.println("Detalle agregado: " + detalle);
        }

        if (!detallesOrden.isEmpty()) {
            Orden nuevaOrden = new Orden(listaOrdenes.size() + 1, null, detallesOrden,
                    detallesOrden.stream().mapToDouble(DetalleOrden::getPrecio).sum());
            listaOrdenes.add(nuevaOrden);
            miHistorial.agregarRegistro("Orden creada: " + nuevaOrden);
            System.out.println("Orden creada exitosamente!");
        } else {
            System.out.println("Orden cancelada, no se agregaron detalles.");
        }
    }

    // Mostrar el historial de acciones
    private static void mostrarHistorial() {
        System.out.println("\n=== Historial ===");
        miHistorial.mostrarRegistros();
    }
}