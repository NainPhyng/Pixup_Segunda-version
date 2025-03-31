package org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario;

public class Municipio {
    private Integer id;
    private String nombre;
    private Estado estado;

    public Municipio(Integer id, String nombre, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer Municipio() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Municipio{id=" + id + ", nombre='" + nombre + "', estado=" + estado + "}";
    }
}