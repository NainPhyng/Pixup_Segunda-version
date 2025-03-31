package org.Jose.Estrada.MildredSofia.pixup.AgregarDisco;

public class Cancion {
    private int id;
    private String titulo;
    private double duracion;

    public Cancion(int id, String titulo, double duracion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public double getDuracion() { return duracion; }
    public void setDuracion(double duracion) { this.duracion = duracion; }

    @Override
    public String toString() {
        return "Cancion{id=" + id + ", titulo='" + titulo + "', duracion=" + duracion + " min}";
    }
}
