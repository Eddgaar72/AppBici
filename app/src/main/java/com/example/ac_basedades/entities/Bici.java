package com.example.ac_basedades.entities;

import java.io.Serializable;

public class Bici implements Serializable {
    private String Marca;
    private String Model;
    private String Color;
    private int MidaMarc;

    public Bici(String marca, String model, String color, int midaMarc) {
        this.Marca =Marca ;
        this.Model =Model ;
        this.Color =Color ;
        this.MidaMarc = MidaMarc;
    }
    public Bici(){
        this.Marca = "Desconegut";
        this.Model = "Desconegut";
        this.Color = "Desconegut";
        this.MidaMarc = 0;
    }


    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getMidaMarc() {
        return MidaMarc;
    }

    public void setMidaMarc(int midaMarc) {
        MidaMarc = midaMarc;
    }
}
