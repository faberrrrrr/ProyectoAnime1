package com.example.proyectoanime;

public class Personaje {

    private String imagen;
    private String nombre;
    private String anime;
    private String descripcion;

    public Personaje(String imagen, String nombre, String anime, String descripcion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.anime = anime;
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnime() {
        return anime;
    }

    public String getDescripcion() {
        return descripcion;
    }
}