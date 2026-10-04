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

    


}
