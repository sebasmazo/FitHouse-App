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
        buttoncrea = (Button)findViewById(R.id.btn_Creatina);
        buttoncrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menuActivity.this, CreatiActivity.class);
                startActivity(i);
            }
        });
        buttonprote = (Button)findViewById(R.id.btn_Proteina);
        buttonprote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(menuActivity.this, ProteActivity.class);
                startActivity(i2);
            }
        });


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
}