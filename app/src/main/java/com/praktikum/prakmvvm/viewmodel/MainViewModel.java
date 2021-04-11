package com.praktikum.prakmvvm.viewmodel;


import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.praktikum.prakmvvm.model.Segitiga;
import com.praktikum.prakmvvm.utils.View;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String>  etAlas = new MutableLiveData<>();
    public MutableLiveData<String> etTinggi = new MutableLiveData<>();
    private MutableLiveData<Segitiga> segitigaMutableLiveData;

    public void btnLuasSegitiga(Context context){
        if (etAlas.getValue() == null || etAlas.getValue().length() == 0 || etTinggi.getValue() == null || etTinggi.getValue().length() == 0){
            View.toast(context, "harus terisi semua...");
            return;
        }

        Double alas = Double.parseDouble(etAlas.getValue());
        Double tinggi = Double.parseDouble(etTinggi.getValue());
        Double hasilLuas = (alas*tinggi)/2;

        Segitiga segitiga = new Segitiga(alas, tinggi, hasilLuas);
        segitigaMutableLiveData.setValue(segitiga);
    }

    public LiveData<Segitiga> getSegitiga(){
        if (segitigaMutableLiveData == null){
            segitigaMutableLiveData = new MutableLiveData<>();
        }
        return segitigaMutableLiveData;
    }
}
