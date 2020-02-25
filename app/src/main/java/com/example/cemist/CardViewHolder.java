package com.example.cemist;

import android.view.View;
import android.widget.TextView;

import com.example.cemist.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder {

    TextView date,disease,medicine,dr_name;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        this.date=itemView.findViewById(R.id.date);
        this.disease=itemView.findViewById(R.id.text_disease);
        this.medicine=itemView.findViewById(R.id.text_medicines);
        this.dr_name=itemView.findViewById(R.id.text_dr_name);


    }
}

