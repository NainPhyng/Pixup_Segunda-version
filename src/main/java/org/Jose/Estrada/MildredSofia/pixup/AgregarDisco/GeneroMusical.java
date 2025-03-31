package org.Jose.Estrada.MildredSofia.pixup.AgregarDisco;

public class GeneroMusical {
    private int id;
    private String descripcion;

    public GeneroMusical() {}

    public GeneroMusical(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "GeneroMusical{id=" + id + ", descripcion='" + descripcion + "'}";
    }
}
