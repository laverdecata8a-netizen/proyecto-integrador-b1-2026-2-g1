package com.example.model;

import java.time.LocalDate;

public class Gato {
    private int idGato;
    private String nombre;
    private String color;
    private LocalDate fechaIngreso;
    private String descripcion;

    //contructor vacio

    public Gato() {

    }

    //Contructor con todos los Atributos

    public Gato(int idGato, String nombre, String color, LocalDate fechaIngreso, String descripcion) {

        this.idGato = idGato;
        this.nombre = nombre;
        this.color = color;
        this.fechaIngreso = fechaIngreso;
        this.descripcion = descripcion;
    }

    //Getters y Setters

    public int getIdGato() {
        return idGato;
    }

    public void setIdGato(int idGato) {
        this.idGato = idGato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodo toString
    
    @Override
    public String toString() {
        return "Gato [idGato=" + idGato + ", nombre=" + nombre + ", color=" + color + ", fechaIngreso=" + fechaIngreso
                + ", descripcion=" + descripcion + "]";
    }

}
