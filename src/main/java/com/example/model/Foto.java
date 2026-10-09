package com.example.model;

public class Foto {
    private int idFoto;
    private int idGato;
    private String url;
    private String fechaFoto;
    private boolean esPrincipal;
    private String descripcion;

    public Foto() {
    }

    public Foto(int idFoto, int idGato, String url, String fechaFoto, boolean esPrincipal, String descripcion) {
        this.idFoto = idFoto;
        this.idGato = idGato;
        this.url = url;
        this.fechaFoto = fechaFoto;
        this.esPrincipal = esPrincipal;
        this.descripcion = descripcion;
    }
    
    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public int getIdGato() {
        return idGato;
    }

    public void setIdGato(int idGato) {
        this.idGato = idGato;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFechaFoto() {
        return fechaFoto;
    }

    public void setFechaFoto(String fechaFoto) {
        this.fechaFoto = fechaFoto;
    }

    public boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Foto [idFoto=" + idFoto + ", idGato=" + idGato + ", url=" + url
                + ", fechaFoto=" + fechaFoto + ", esPrincipal=" + esPrincipal + ", descripcion=" + descripcion + "]";
    }
}
