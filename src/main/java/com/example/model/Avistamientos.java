package com.example.model;

import java.time.LocalDate;

public class Avistamientos {

    private int idAvistamiento;
    private int idGato;
    private int idUser;
    private int idFoto;
    private LocalDate fecha;

    public Avistamientos() {
    }

    public Avistamientos(int idGato, int idUser, int idFoto, LocalDate fecha) {
        this(0, idGato, idUser, idFoto, fecha);
    }

    public Avistamientos(int idAvistamiento, int idGato, int idUser, int idFoto, LocalDate fecha) {
        this.idAvistamiento = idAvistamiento;
        this.idGato = idGato;
        this.idUser = idUser;
        this.idFoto = idFoto;
        this.fecha = fecha;
    }

    public int getIdAvistamiento() {
        return idAvistamiento;
    }

    public void setIdAvistamiento(int idAvistamiento) {
        this.idAvistamiento = idAvistamiento;
    }

    public int getIdGato() {
        return idGato;
    }

    public void setIdGato(int idGato) {
        this.idGato = idGato;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Avistamiento [idAvistamiento=" + idAvistamiento + ", idGato=" + idGato + ", idUser=" + idUser
                + ", idFoto=" + idFoto + ", fecha=" + fecha + "]";
    }
}
