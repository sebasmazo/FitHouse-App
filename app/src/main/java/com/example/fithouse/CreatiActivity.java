package com.example.fithouse;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fithouse.Util.ConexionDB;
import com.example.fithouse.Util.Creatina;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CreatiActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creati);
        listView = findViewById(R.id.listView);
        ArrayList<Creatina> arrayList = new ArrayList<>();
        arrayList = ConexionDB.GetCreatine();
        System.out.println(arrayList.size());


    }
}