package com.example.fithouse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fithouse.Util.ConexionDB;
import com.example.fithouse.Util.Suplemento;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SuplementActivity extends AppCompatActivity {

Suplemento s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suplement);
    }

    @Override
    protected void onResume() {
        super.onResume();
        s = (Suplemento) getIntent().getSerializableExtra("suplemento");
        TextView txtNameSuplement = findViewById(R.id.txtNameSuplement);
        TextView txtPriceSuplement = findViewById(R.id.txtPriceSuplement);
        TextView txtBrandSuplement = findViewById(R.id.txtBrandSuplement);
        TextView txtAmmountSuplement = findViewById(R.id.txtAmmountSuplement);
        TextView txtServingsSuplement = findViewById(R.id.txtServingsSuplement);
        TextView txtdescricionSuplement = findViewById(R.id.txtdescricionSuplement);
        ImageView Image_product = findViewById(R.id.Image_product);
        ImageView imageInfo = findViewById(R.id.imageInfo);

        Picasso.with(SuplementActivity.this).load(s.getImagen()).into(Image_product);
        Picasso.with(SuplementActivity.this).load(s.getInformacion_nutricional()).into(imageInfo);

        txtNameSuplement.setText(s.getName());
        txtPriceSuplement.setText(s.getPrecio()+"$");
        txtBrandSuplement.setText(s.getMarca());
        txtAmmountSuplement.setText(s.getCantidad());
        txtServingsSuplement.setText(s.getServicios());
        txtdescricionSuplement.setText(s.getDescripcion());
    }

}