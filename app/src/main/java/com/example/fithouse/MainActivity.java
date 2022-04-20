package com.example.fithouse;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Handler manejador = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int tiempoTranscurrir = 5000;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manejador.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, menuActivity.class);
                startActivity(intent);
            }
        },tiempoTranscurrir);
    }


}