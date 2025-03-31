package org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario;

import java.util.List;

public class Usuario {
    private Integer id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String password;
    private String email;
    private String rfc;
    private TipoNotificacion tipoNotificacion;
    private List<Domicilio> domicilios; // Relación uno a muchos con Domicilio

    public Usuario(Integer id, String nombre, String primerApellido, String segundoApellido, String password,
                   String email, String rfc, TipoNotificacion tipoNotificacion, List<Domicilio> domicilios) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.password = password;
        this.email = email;
        this.rfc = rfc;
        this.tipoNotificacion = tipoNotificacion;
        this.domicilios = domicilios; // Inicializamos los domicilios
    }

    public List<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(List<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nombre='" + nombre + "', domicilios=" + domicilios + "}";
    }
}