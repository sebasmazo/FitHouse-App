package com.upb.fithouse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.upb.fithouse.Util.Suplemento;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SuplementAdapter extends ArrayAdapter<Suplemento> {
    private Context mContext;
    private int mResource;

    public SuplementAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Suplemento> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);

        ImageView imageview = convertView.findViewById(R.id.image);
        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtPrice = convertView.findViewById(R.id.txtPrice);
        TextView txtBrand = convertView.findViewById(R.id.txtBrand);
        TextView txtAmmount = convertView.findViewById(R.id.txtAmmount);
        TextView txtServings = convertView.findViewById(R.id.txtServings);
        TextView txtDesc = convertView.findViewById(R.id.txtDescription);


        Picasso.with(mContext).load(getItem(position).getImagen()).into(imageview);

        txtName.setText(getItem(position).getName());
        txtPrice.setText(getItem(position).getPrecio()+"$");
        txtBrand.setText(getItem(position).getMarca());
        txtAmmount.setText(getItem(position).getCantidad());
        txtServings.setText(getItem(position).getServicios());
        txtDesc.setText(getItem(position).getDescripcion());

        return convertView;
    }
}
