package com.example.exemplefragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class NewFragment extends AppCompatActivity {

    public void exchangeX6(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFragment, new X6Fragment())
                .addToBackStack(null)
                .commit();
    }

    public void exchangeZ4(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFragment, new Z4Fragment())
                .addToBackStack(null)
                .commit();
    }

    public void exchangeM5(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFragment, new M5Fragment())
                .addToBackStack(null)
                .commit();
        }
}