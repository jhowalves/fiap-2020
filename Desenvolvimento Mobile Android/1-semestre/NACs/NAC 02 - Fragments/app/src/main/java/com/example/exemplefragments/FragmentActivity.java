package com.example.exemplefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    public void exchange(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFragment, fragment)
                .addToBackStack(null)
                .commit();
    }

    public void exchangeX6(View view) {
        exchange(new X6Fragment());
    }

    public void exchangeZ4(View view) {
        exchange(new Z4Fragment());
    }

    public void exchangeM5(View view) {
        exchange(new M5Fragment());
    }
}