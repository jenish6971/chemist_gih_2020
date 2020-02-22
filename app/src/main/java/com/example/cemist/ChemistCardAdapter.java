package com.example.cemist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChemistCardAdapter extends RecyclerView.Adapter<ChemistCardViewHolder> {

    Context c;
    ArrayList<ChemistModel> models;

    public ChemistCardAdapter(Context c, ArrayList<ChemistModel> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public ChemistCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(c);

        View view= inflater.inflate(R.layout.chemist_card,null);
        return new ChemistCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChemistCardViewHolder holder, int position) {
        ChemistModel model=models.get(position);
        holder.patient_name.setText(model.getPatient_name());
        holder.date.setText(model.getDate());
        holder.disease.setText(model.getDisease());
        holder.medicine.setText(model.getMedicines());
        holder.dr_name.setText(model.getDr_name());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
