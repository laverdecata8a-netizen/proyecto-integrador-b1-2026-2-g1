package com.example.model;

public class User {

    private int idUser;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String password;

    // contructor vacio 
    public User() {

    }

    //Contructor con parametros
    public User (int idUser,String nombre,String apellido,String email,String celular,String password){
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.password = password;

    }


}
