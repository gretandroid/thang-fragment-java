package com.example.fragmentjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Fragment1.Communication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Fragment1", "Activité est crée");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Fragment1", "Activité est onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Fragment1", "Activité est onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Fragment1", "Activité est onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Fragment1", "Activité est onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Fragment1", "Activité est onResume");
    }

    @Override
    public void send(String nom) {
        TextView textView = findViewById(R.id.activityTextView);
        textView.setText(nom);
    }
}