package com.upb.fithouse.Util;


import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

import java.util.ArrayList;

public class ConexionDB {

    public static ArrayList<Suplemento> GetCreatine() {
        Log.println(Log.INFO,"Entrada a clase","Se entró a la clase");
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        ArrayList<Suplemento> arrayList = new ArrayList<>();

        ValueEventListener evl = new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               for (DataSnapshot dato : dataSnapshot.child("creatinas").getChildren()) {
                   String imagen = (String) dato.child("imagen").getValue();
                   double precio = (double) dato.child("precio").getValue(double.class);
                   String marca = (String) dato.child("marca").getValue();
                   double cantidad = (double) dato.child("cantidad").getValue(double.class);
                   double servicios = (double) dato.child("servicios").getValue(double.class);
                   String informacion_nutricional = (String) dato.child("informacion_nutricional").getValue();
                   String descripcion = (String) dato.child("descripcion").getValue();
                   arrayList.add(new Creatina(imagen,precio,marca,cantidad,servicios,informacion_nutricional,descripcion));
                   Log.println(Log.INFO,"Creatinas Clase: "+this.getClass(),dato.child("marca").getValue().toString());
               }
           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       };
        mDatabase.addValueEventListener(evl);
        return arrayList;
    }

    public static ArrayList<Suplemento> GetProteine() {
        Log.println(Log.INFO,"Entrada a clase","Se entró a la clase");
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        ArrayList<Suplemento> arrayList = new ArrayList<>();

        ValueEventListener evl = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dato : dataSnapshot.child("proteinas").getChildren()) {
                    String imagen = (String) dato.child("imagen").getValue();
                    double precio = (double) dato.child("precio").getValue(double.class);
                    String marca = (String) dato.child("marca").getValue();
                    double cantidad = (double) dato.child("cantidad").getValue(double.class);
                    double servicios = (double) dato.child("servicios").getValue(double.class);
                    String informacion_nutricional = (String) dato.child("informacion_nutricional").getValue();
                    String descripcion = (String) dato.child("descripcion").getValue();
                    arrayList.add(new Proteina(imagen,precio,marca,cantidad,servicios,informacion_nutricional,descripcion));
                    Log.println(Log.INFO,"Proteinas Clase: "+this.getClass(),dato.child("marca").getValue().toString());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        mDatabase.addValueEventListener(evl);
        return arrayList;
    }

}
