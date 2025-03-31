package org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario;

public class Estado {
    private Integer id;
    private String nombre;

    public Estado(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Estado{id=" + id + ", nombre='" + nombre + "'}";
    }
}