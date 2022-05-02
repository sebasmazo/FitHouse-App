package com.upb.fithouse.Util;

import android.app.Application;

import java.io.Serializable;

public class Suplemento extends Application implements Serializable {
    public Suplemento() {
    }

    String imagen;
    double precio;
    String marca;
    double cantidad;
    double servicios;
    String informacion_nutricional;
    String descripcion;

    public Suplemento(String imagen, double precio, String marca, double cantidad, double servicios, String informacion_nutricional, String descripcion) {
        this.imagen = imagen;
        this.precio = precio;
        this.marca = marca;
        this.cantidad = cantidad;
        this.servicios = servicios;
        this.informacion_nutricional = informacion_nutricional;
        this.descripcion = descripcion;
    }
    public String getName(){
        return this.getClass().getSimpleName() +" - "+this.marca;
    }

    public Suplemento(String marca) {
        this.marca = marca;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getPrecio() {
        return precio+"";
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantidad() {
        return cantidad+"";
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getServicios() {
        return servicios+"";
    }

    public void setServicios(double servicios) {
        this.servicios = servicios;
    }

    public String getInformacion_nutricional() {
        return informacion_nutricional;
    }

    public void setInformacion_nutricional(String informacion_nutricional) {
        this.informacion_nutricional = informacion_nutricional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
