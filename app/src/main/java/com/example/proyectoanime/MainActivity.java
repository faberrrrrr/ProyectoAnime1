package com.example.proyectoanime;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPersonajes;
    ArrayList<Personaje> listaPersonajes;
    AdaptadorPersonajes adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPersonajes = findViewById(R.id.rvPersonajes);

        listaPersonajes = new ArrayList<>();

        listaPersonajes.add(new Personaje(
                "https://cdn.myanimelist.net/images/characters/9/131317.jpg",
                "Naruto Uzumaki",
                "Naruto Shippuden",
                "Ninja de la Aldea de la Hoja."
        ));

        listaPersonajes.add(new Personaje(
                "https://cdn.myanimelist.net/images/characters/3/100534.jpg",
                "Monkey D. Luffy",
                "One Piece",
                "Capitán que sueña con ser el Rey de los Piratas."
        ));

        listaPersonajes.add(new Personaje(
                "https://cdn.myanimelist.net/images/characters/11/294970.jpg",
                "Goku",
                "Dragon Ball",
                "Guerrero Saiyajin que protege la Tierra."
        ));

        listaPersonajes.add(new Personaje(
                "https://cdn.myanimelist.net/images/characters/9/131317.jpg",
                "Sasuke Uchiha",
                "Naruto Shippuden",
                "Ninja del clan Uchiha."
        ));

        listaPersonajes.add(new Personaje(
                "https://cdn.myanimelist.net/images/characters/iy/284129.jpg",
                "Tanjiro Kamado",
                "Demon Slayer",
                "Cazador de demonios decidido a salvar a su hermana."
        ));

        listaPersonajes.add(new Personaje(
                "https://cdn.myanimelist.net/images/characters/2/241413.jpg",
                "Levi Ackerman",
                "Attack on Titan",
                "Soldado reconocido por su habilidad en combate."
        ));

        adaptador = new AdaptadorPersonajes(listaPersonajes);

        rvPersonajes.setLayoutManager(
                new LinearLayoutManager(this)
        );

        rvPersonajes.setAdapter(adaptador);
    }
}