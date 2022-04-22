package com.example.fithouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menuActivity extends AppCompatActivity {
    private Button buttoncrea, buttonprote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        buttoncrea = (Button)findViewById(R.id.btn_Creatina);
        buttoncrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCreatina();
            }
        });
        buttonprote = (Button)findViewById(R.id.btn_Proteina);
        buttonprote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirProteina();
            }
        });


    }
    private void abrirCreatina(){
        Intent i = new Intent(menuActivity.this, creatiActivity.class);
        startActivity(i);
    }
    private void abrirProteina(){
        Intent i2 = new Intent(menuActivity.this, ProteActivity.class);
        startActivity(i2);
    }
}