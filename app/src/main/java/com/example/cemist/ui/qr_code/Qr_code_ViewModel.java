package com.example.cemist.ui.qr_code;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Qr_code_ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Qr_code_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}