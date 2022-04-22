package com.example.fithouse;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fithouse.Util.Creatina;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class creatiActivity extends AppCompatActivity {
    private FirebaseDatabase db;
    private DatabaseReference db_reference;
    private RecyclerView recyclerView;
    private CreatiAdapter myAdapter;
    private ArrayList<Creatina> list;

    private void initFirebase(){
        FirebaseApp.initializeApp(this);
        db = FirebaseDatabase.getInstance();
        db_reference = db.getReference();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creati);
        recyclerView = findViewById(R.id.lista_crea);
        db_reference = FirebaseDatabase.getInstance().getReference("creatinas");
        initFirebase();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        myAdapter = new CreatiAdapter(this,list);
        recyclerView.setAdapter(myAdapter);

        db_reference.addValueEventListener(new ValueEventListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    for(DataSnapshot ds : dataSnapshot.getChildren()){
                        Creatina crea = ds.getValue(Creatina.class);
                        list.add(crea);
                    }
                }
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                throw error.toException();
            }
        });
    }
}