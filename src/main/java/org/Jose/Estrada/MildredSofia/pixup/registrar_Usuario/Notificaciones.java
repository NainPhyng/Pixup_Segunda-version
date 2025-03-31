package org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario;

import java.time.LocalDateTime;

public class Notificaciones {
    private Integer id;
    private LocalDateTime fecha_notificacion;
    private Integer id_Usuario;
    private Integer id_tipo_notificacion;


    public Notificaciones() {
    }

    public Notificaciones(Integer id, Integer id_tipo_notificacion, Integer id_Usuario, LocalDateTime fecha_notificacion) {
        this.id = id;
        this.id_tipo_notificacion = id_tipo_notificacion;
        this.id_Usuario = id_Usuario;
        this.fecha_notificacion = fecha_notificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_tipo_notificacion() {
        return id_tipo_notificacion;
    }

    public void setId_tipo_notificacion(Integer id_tipo_notificacion) {
        this.id_tipo_notificacion = id_tipo_notificacion;
    }

    public Integer getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public LocalDateTime getFecha_notificacion() {
        return fecha_notificacion;
    }

    public void setFecha_notificacion(LocalDateTime fecha_notificacion) {
        this.fecha_notificacion = fecha_notificacion;
    }
}
