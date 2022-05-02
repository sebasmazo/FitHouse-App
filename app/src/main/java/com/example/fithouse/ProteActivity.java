package com.example.fithouse;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fithouse.Util.ConexionDB;
import com.example.fithouse.Util.Suplemento;

import java.util.ArrayList;

public class ProteActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<Suplemento> arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creati);

    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();

        new ProteActivity.MyTask().execute();
    }
    private class MyTask extends AsyncTask<String, Void, Integer> {
        ProgressDialog pdLoading = new ProgressDialog(ProteActivity.this);
        @Override
        protected Integer doInBackground(String... strings) {
            arrayList = ConexionDB.GetProteine();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return arrayList.size();
        }

        @Override
        protected void onPreExecute() {
            pdLoading.setMessage("\tLoading...");
            pdLoading.show();
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Integer s) {
            super.onPostExecute(s);
            Log.println(Log.INFO,"Resultado. Clase: "+this.getClass(),"Lista:"+s);
            if (arrayList.size()==0)
            {
                finish();
                startActivity(getIntent());
            }
            listView = findViewById(R.id.listView);
            SuplementAdapter suplementAdapter = new SuplementAdapter(ProteActivity.this,R.layout.list_row,(ArrayList<Suplemento>) arrayList);
            listView.setAdapter(suplementAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Log.println(Log.INFO,"SUPLEMENTO A ENVIAR","Se envió el #: "+i+ "correspondiente a marca: "+arrayList.get(i).getMarca());
                    startActivity(new Intent(ProteActivity.this,SuplementActivity.class).putExtra("suplemento", arrayList.get(i)));
                }
            });
            pdLoading.dismiss();
        }
    }


}