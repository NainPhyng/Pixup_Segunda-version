package org.Jose.Estrada.MildredSofia.pixup.AgregarDisco;

public class Disquera {
    private int id;
    private String nombre;

    public Disquera() {}

    public Disquera(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Disquera{id=" + id + ", nombre='" + nombre + "'}";
    }
}
