package com.example.fithouse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fithouse.Util.Creatina;

import java.util.ArrayList;
public class CreatiAdapter extends RecyclerView.Adapter<CreatiAdapter.MyViewHolder> {
    Context context;
    ArrayList<Creatina> list;
    public CreatiAdapter(Context context, ArrayList<Creatina> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_creati,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CreatiAdapter.MyViewHolder holder, int position) {
        Creatina crea = list.get(position);
        holder.nombre.setText(crea.getDescripcion());
        holder.servicios.setText(Double.toString(crea.getServicios()));
        holder.precio.setText(Double.toString(crea.getPrecio()));
        holder.marca.setText(crea.getMarca());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nombre, servicios, precio,marca;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            nombre = itemView.findViewById(R.id.creaDescripcion);
            servicios = itemView.findViewById(R.id.creaServicios);
            precio = itemView.findViewById(R.id.creaPrecio);
            marca  = itemView.findViewById(R.id.creaMarca);
        }
    }
}
