package com.example.proyectoanime;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPersonajes;
    AdaptadorPersonajes adaptador;
    ArrayList<Personaje> listaPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPersonajes = findViewById(R.id.rvPersonajes);

        listaPersonajes = new ArrayList<>();

        listaPersonajes.add(
                new Personaje("Naruto Uzumaki", "Naruto", R.drawable.naruto));

        listaPersonajes.add(
                new Personaje("Monkey D. Luffy", "One Piece", R.drawable.luffy));

        listaPersonajes.add(
                new Personaje("Son Goku", "Dragon Ball", R.drawable.goku));

        listaPersonajes.add(
                new Personaje("Sasuke Uchiha", "Naruto", R.drawable.sasuke));

        listaPersonajes.add(
                new Personaje("Tanjiro Kamado", "Demon Slayer", R.drawable.tanjiro));

        listaPersonajes.add(
                new Personaje("Levi Ackerman", "Attack on Titan", R.drawable.levi));

        adaptador = new AdaptadorPersonajes(listaPersonajes);

        rvPersonajes.setLayoutManager(
                new LinearLayoutManager(this));

        rvPersonajes.setAdapter(adaptador);
    }
}