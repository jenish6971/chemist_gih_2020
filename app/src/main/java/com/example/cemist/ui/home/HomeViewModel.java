package com.example.cemist.ui.home;

import android.content.Context;
import android.widget.Toast;

import com.example.cemist.CardAdapter;
import com.example.cemist.CardViewHolder;
import com.example.cemist.ChemistModel;
import com.example.cemist.MainActivity;
import com.example.cemist.Model;
import com.example.cemist.R;

import java.util.ArrayList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("History");
    }

    public LiveData<String> getText() {
        return mText;
    }
    public ArrayList<ChemistModel> getMylist() {
        ArrayList<ChemistModel> models = new ArrayList<>();
        ChemistModel m = new ChemistModel();
        m.setPatient_name("Maunik Sakariya");
        m.setDate("11 Feb 2020");
        m.setDisease("Dengue");
        m.setMedicines("Paracitamol");
        m.setDr_name("Vrajesh Bhatt");
        models.add(m);

        m = new ChemistModel();
        m.setPatient_name("Dhruvi Barad");
        m.setDate("12 Feb 2020");
        m.setDisease("Flue");
        m.setMedicines("Crocin");
        m.setDr_name("Jenish Dhanani");
        models.add(m);



        //Toast.makeText(,"this is card view",Toast.LENGTH_LONG).show();
        return models;
    }

}