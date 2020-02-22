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
        m.setPatient_name("Patient 1");
        m.setDate("11 Feb 2020");
        m.setDisease("Disease 1");
        m.setMedicines("Medicines");
        m.setDr_name("Dr.Name 1");
        models.add(m);

        m = new ChemistModel();
        m.setPatient_name("Patient 2");
        m.setDate("12 Feb 2020");
        m.setDisease("Disease 2");
        m.setMedicines("Medicines");
        m.setDr_name("Dr.Name 2");
        models.add(m);
        m = new ChemistModel();
        m.setPatient_name("Patient 3");
        m.setDate("13 Feb 2020");
        m.setDisease("Disease 3");
        m.setMedicines("Medicines");
        m.setDr_name("Dr.Name 3");
        models.add(m);

        m = new ChemistModel();
        m.setPatient_name("Patient 4");
        m.setDate("14 Feb 2020");
        m.setDisease("Disease 4");
        m.setMedicines("Medicines");
        m.setDr_name("Dr.Name 4");
        models.add(m);

        m = new ChemistModel();
        m.setPatient_name("Patient 5");
        m.setDate("15 Feb 2020");
        m.setDisease("Disease 5");
        m.setMedicines("Medicines");
        m.setDr_name("Dr.Name 5");
        models.add(m);

        //Toast.makeText(,"this is card view",Toast.LENGTH_LONG).show();
        return models;
    }

}