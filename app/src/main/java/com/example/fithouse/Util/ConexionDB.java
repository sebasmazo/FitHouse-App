package com.example.fithouse.Util;


import androidx.annotation.NonNull;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;

public class ConexionDB {

    public static ArrayList<Creatina> GetCreatine()
    {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        ArrayList<Creatina> arrayList = new ArrayList<>();
        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    arrayList.clear();
                    for (DataSnapshot dato : dataSnapshot.getChildren()){
                        String imagen = (String) dato.child("imagen").getValue();
                        double precio = (double) dato.child("precio").getValue(double.class);
                        String marca = (String) dato.child("marca").getValue();
                        double cantidad = (double) dato.child("cantidad").getValue(double.class);
                        double servicios = (double) dato.child("servicios").getValue(double.class);
                        String informacion_nutricional = (String) dato.child("informacion_nutricional").getValue();
                        String descripcion = (String) dato.child("descripcion").getValue();
                        arrayList.add(new Creatina(imagen,precio,marca,cantidad,servicios,informacion_nutricional,descripcion));
                        //Problemas de velocidad en la consulta hacen imposible disponer de los datos en la clase CreatiActivity
                        //al tener que hacer consulta para cada campo de la colección.
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        database.child("creatinas").addListenerForSingleValueEvent(valueEventListener);
        return arrayList;
    }


}
