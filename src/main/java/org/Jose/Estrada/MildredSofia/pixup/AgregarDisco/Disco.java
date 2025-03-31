package org.Jose.Estrada.MildredSofia.pixup.AgregarDisco;

import org.Jose.Estrada.MildredSofia.pixup.AgregarDisco.Artista;
import java.util.List;

public class Disco {
    private int id;
    private String titulo;
    private double precio;
    private String formato;
    private int stock;
    private List<Cancion> canciones;
    private Artista artista;

    public Disco(int id, String titulo, double precio, String formato, int stock, List<Cancion> canciones, Artista artista) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.formato = formato;
        this.stock = stock;
        this.canciones = canciones;
        this.artista = artista;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public List<Cancion> getCanciones() { return canciones; }
    public void setCanciones(List<Cancion> canciones) { this.canciones = canciones; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }

    @Override
    public String toString() {
        return "Disco{id=" + id + ", titulo='" + titulo + "', precio=" + precio + ", formato='" + formato +
                "', stock=" + stock + ", artista=" + artista + "}";
    }
}
