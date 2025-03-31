package org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario;

public class Colonia {
    private int id;
    private String nombre;
    private Municipio municipio;

    public Colonia(int id, String nombre, Municipio municipio) {
        this.id = id;
        this.nombre = nombre;
        this.municipio = municipio;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Municipio getMunicipio() { return municipio; }
    public void setMunicipio(Municipio municipio) { this.municipio = municipio; }

    @Override
    public String toString() {
        return "Colonia{id=" + id + ", nombre='" + nombre + "', municipio=" + municipio + "}";
    }
}