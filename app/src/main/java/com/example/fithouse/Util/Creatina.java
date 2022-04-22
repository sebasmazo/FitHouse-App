package com.example.fithouse.Util;

public class Creatina extends Suplemento{

    public Creatina(String imagen, double precio, String marca, double cantidad, double servicios, String informacion_nutricional, String descripcion) {
        super(imagen, precio, marca, cantidad, servicios, informacion_nutricional, descripcion);
    }

    public Creatina() {
    }

    @Override
    public String getImagen() {
        return super.getImagen();
    }


    @Override
    public double getPrecio() {
        return super.getPrecio();
    }


    @Override
    public String getMarca() {
        return super.getMarca();
    }


    @Override
    public double getCantidad() {
        return super.getCantidad();
    }



    @Override
    public double getServicios() {
        return super.getServicios();
    }


    @Override
    public String getInformacion_nutricional() {
        return super.getInformacion_nutricional();
    }



    @Override
    public String getDescripcion() {
        return super.getDescripcion();
    }

}
