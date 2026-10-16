package com.example.proyectoanime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.PersonajeViewHolder> {

    private ArrayList<Personaje> listaPersonajes;

    public AdaptadorPersonajes(ArrayList<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_personaje, parent, false);

        return new PersonajeViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {
        Personaje personaje = listaPersonajes.get(position);

        holder.txtNombre.setText(personaje.getNombre());
        holder.txtAnime.setText(personaje.getAnime());
        holder.txtDescripcion.setText(personaje.getDescripcion());
        Picasso.get()
                .load(personaje.getImagen())
                .placeholder(R.drawable.naruto)
                .error(R.drawable.naruto)
                .into(holder.imgPersonaje);
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public static class PersonajeViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPersonaje;
        TextView txtNombre, txtAnime, txtDescripcion;

        public PersonajeViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPersonaje = itemView.findViewById(R.id.imgPersonaje);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtAnime = itemView.findViewById(R.id.txtAnime);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        }
    }
}