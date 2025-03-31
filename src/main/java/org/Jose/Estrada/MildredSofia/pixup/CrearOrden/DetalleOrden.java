package org.Jose.Estrada.MildredSofia.pixup.CrearOrden;

import org.Jose.Estrada.MildredSofia.pixup.AgregarDisco.Disco;

public class DetalleOrden {
    private int id;
    private int cantidad;
    private double precio;
    private Orden orden; // Relación con la clase Orden
    private Disco disco; // Relación directa con la clase Disco

    public DetalleOrden(int id, int cantidad, double precio, Orden orden, Disco disco) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.orden = orden;   // Asociamos el detalle con una Orden
        this.disco = disco;   // Asociamos el detalle con un Disco
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "DetalleOrden{id=" + id + ", cantidad=" + cantidad + ", precio=" + precio +
                ", orden=" + orden + ", disco=" + disco + "}";
    }
}