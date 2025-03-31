package org.Jose.Estrada.MildredSofia.pixup.CrearOrden;

import java.sql.Timestamp;

public class Pago {
    private Integer id;
    private String numeroTarjeta;
    private double monto;
    private Timestamp fecha;
    private Orden orden;

    public Pago(Integer id, String numeroTarjeta, double monto, Timestamp fecha, Orden orden) {
        this.id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.monto = monto;
        this.fecha = fecha;
        this.orden = orden;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNumeroTarjeta() { return numeroTarjeta; }
    public void setNumeroTarjeta(String numeroTarjeta) { this.numeroTarjeta = numeroTarjeta; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public Timestamp getFecha() { return fecha; }
    public void setFecha(Timestamp fecha) { this.fecha = fecha; }

    public Orden getOrden() { return orden; }
    public void setOrden(Orden orden) { this.orden = orden; }

    @Override
    public String toString() {
        return "Pago{id=" + id + ", numeroTarjeta='" + numeroTarjeta + "', monto=" + monto +
                ", fecha=" + fecha + ", orden=" + orden + "}";
    }
}
