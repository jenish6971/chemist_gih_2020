package com.example.cemist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class patient extends AppCompatActivity {

    RecyclerView recyclerView;
    CardAdapter cardAdapter;
   // ArrayList<Model> cardlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        //cardlist=new ArrayList<>();
        recyclerView =findViewById(R.id.patient_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cardAdapter=new CardAdapter(this,getMylist());


        recyclerView.setAdapter(cardAdapter);

    }

    private ArrayList<Model> getMylist(){


        ArrayList<Model> models = new ArrayList<>();
        Model m =  new Model();
        m.setDate("14 Feb 2020");
        m.setDisease("Disease Name");
        m.setMedicines("Medicines Name");
        m.setDr_name("Referenced Dr Name");
        models.add(m);

        m =  new Model();
        m.setDate("15 Feb 2020");
        m.setDisease("Disease Name22222");
        m.setMedicines("Medicines Name2222");
        m.setDr_name("Referenced Dr Name22222");
        models.add(m);

        Toast.makeText(this,"this is card view",Toast.LENGTH_LONG).show();
        return models;
    }
}
