package com.praktikum.prakmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.praktikum.prakmvvm.R;
import com.praktikum.prakmvvm.databinding.ActivityMainBinding;
import com.praktikum.prakmvvm.model.Segitiga;
import com.praktikum.prakmvvm.utils.View;
import com.praktikum.prakmvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewmodel(mainViewModel);
        binding.setLifecycleOwner(this);

        mainViewModel.getSegitiga().observe(this, segitiga ->{
            if (segitiga.getHasil() != null){
                View.toast(this, segitiga.getHasil().toString());
            }
        });
    }
}