package org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario;

public class TipoNotificacion {
    private int id;
    private String descripcion;

    public TipoNotificacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "TipoNotificacion{id=" + id + ", descripcion='" + descripcion + "'}";
    }
}