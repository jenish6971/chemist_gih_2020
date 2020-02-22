package com.example.cemist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    Context c;
    ArrayList<Model> models;

    public CardAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(c);

        View view= inflater.inflate(R.layout.card,null);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Model model=models.get(position);
        holder.date.setText(model.getDate());
        holder.disease.setText(model.getDisease());
        holder.medicine.setText(model.getMedicines());
        holder.dr_name.setText(model.getDr_name());

    }

    @Override
    public int getItemCount() {
        return  models.size();
    }
}

