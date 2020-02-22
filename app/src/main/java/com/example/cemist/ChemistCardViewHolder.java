package com.example.cemist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ChemistCardViewHolder extends RecyclerView.ViewHolder {

   TextView patient_name,date,disease,medicine,dr_name;



    public ChemistCardViewHolder(@NonNull View itemView) {
        super(itemView);
        this.patient_name=itemView.findViewById(R.id.text_card_patient_name);
        this.date=itemView.findViewById(R.id.text_patient_date);
        this.disease=itemView.findViewById(R.id.text_patient_disease);
        this.medicine=itemView.findViewById(R.id.text_patient_medicines);
        this.dr_name=itemView.findViewById(R.id.text_patient_dr_name);
    }
}
