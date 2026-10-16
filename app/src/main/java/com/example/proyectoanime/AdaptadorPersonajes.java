package com.example.proyectoanime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPersonajes
        extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolder> {

    private List<Personaje> listaPersonajes;

    public AdaptadorPersonajes(List<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_personaje, parent, false);

        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder, int position) {

        Personaje personaje = listaPersonajes.get(position);

        holder.txtNombre.setText(personaje.getNombre());
        holder.txtAnime.setText(personaje.getAnime());
        holder.imgPersonaje.setImageResource(personaje.getImagen());
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPersonaje;
        TextView txtNombre;
        TextView txtAnime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPersonaje = itemView.findViewById(R.id.imgPersonaje);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtAnime = itemView.findViewById(R.id.txtAnime);
        }
    }
}