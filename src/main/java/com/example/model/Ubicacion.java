package com.example.model;

public class Ubicacion {

    private int idUbicacion ;
    private String direccion;
    private String barrio ;
    private String ciudad ;


public Ubicacion () {

}

public Ubicacion(int idUbicacion, String direccion, String barrio, String ciudad){
    this.idUbicacion = idUbicacion;
    this.direccion = direccion;
    this.barrio = barrio;
    this.ciudad = ciudad;
}

public int getIdUbicacion() {
	return idUbicacion;
}

public void setIdUbicacion(int idUbicacion) {
	this.idUbicacion = idUbicacion;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getBarrio() {
	return barrio;
}

public void setBarrio(String barrio) {
	this.barrio = barrio;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

@Override
public String toString() {
	return (" El idUbicacion es :  " + idUbicacion + ", direccion : " + direccion + ", barrio : " + barrio + " , ciudad : " + ciudad);
}



}
