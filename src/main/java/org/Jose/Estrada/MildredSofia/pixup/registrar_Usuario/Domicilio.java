package org.Jose.Estrada.MildredSofia.pixup.registrar_Usuario;

public class Domicilio {
    private int id;
    private String calle;
    private int numeroExterior;
    private Integer numeroInterior; // Puede ser nulo
    private Usuario usuario;
    private Colonia colonia;
    private TipoDomicilio tipoDomicilio;

    public Domicilio(int id, String calle, int numeroExterior, Integer numeroInterior, Usuario usuario, Colonia colonia, TipoDomicilio tipoDomicilio) {
        this.id = id;
        this.calle = calle;
        this.numeroExterior = numeroExterior;
        this.numeroInterior = numeroInterior;
        this.usuario = usuario;
        this.colonia = colonia;
        this.tipoDomicilio = tipoDomicilio;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getNumeroExterior() { return numeroExterior; }
    public void setNumeroExterior(int numeroExterior) { this.numeroExterior = numeroExterior; }

    public Integer getNumeroInterior() { return numeroInterior; }
    public void setNumeroInterior(Integer numeroInterior) { this.numeroInterior = numeroInterior; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Colonia getColonia() { return colonia; }
    public void setColonia(Colonia colonia) { this.colonia = colonia; }

    public TipoDomicilio getTipoDomicilio() { return tipoDomicilio; }
    public void setTipoDomicilio(TipoDomicilio tipoDomicilio) { this.tipoDomicilio = tipoDomicilio; }

    @Override
    public String toString() {
        return "Domicilio{id=" + id + ", calle='" + calle + "', numeroExterior=" + numeroExterior +
                ", numeroInterior=" + numeroInterior + ", usuario=" + usuario + ", colonia=" + colonia +
                ", tipoDomicilio=" + tipoDomicilio + "}";
    }
}