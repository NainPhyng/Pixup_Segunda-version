package org.Jose.Estrada.MildredSofia.pixup.CrearOrden;

import org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario.Usuario;
import java.util.List;

public class Orden {
    private int id;
    private Usuario usuario; // Relación con la clase Usuario
    private List<DetalleOrden> detalles; // Relación uno a muchos con DetalleOrden
    private double total;

    public Orden(int id, Usuario usuario, List<DetalleOrden> detalles, double total) {
        this.id = id;
        this.usuario = usuario; // Asociamos la orden con un Usuario
        this.detalles = detalles;
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Orden{id=" + id + ", usuario=" + usuario + ", total=" + total + "}";
    }
}