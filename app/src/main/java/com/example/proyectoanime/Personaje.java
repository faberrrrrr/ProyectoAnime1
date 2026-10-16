package com.example.proyectoanime;

public class Personaje {

    private String nombre;
    private String anime;
    private int imagen;

    public Personaje(String nombre, String anime, int imagen) {
        this.nombre = nombre;
        this.anime = anime;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnime() {
        return anime;
    }

    public int getImagen() {
        return imagen;
    }
}