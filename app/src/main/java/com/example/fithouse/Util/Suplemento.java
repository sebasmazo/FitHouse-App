package com.example.fithouse.Util;

import android.app.Application;

public class Suplemento extends Application {
    public Suplemento() {
    }

    int id;
    String urlImagen;
    double precio;
    String marca;
    double cantidad;
    double servicios;
    String urlInfoNutricional;
    String descripcion;

    public Suplemento(int id, String urlImagen, double precio, String marca, double cantidad, double servicios, String urlInfoNutricional, String descripcion) {
        this.id = id;
        this.urlImagen = urlImagen;
        this.precio = precio;
        this.marca = marca;
        this.cantidad = cantidad;
        this.servicios = servicios;
        this.urlInfoNutricional = urlInfoNutricional;
        this.descripcion = descripcion;
    }
}
