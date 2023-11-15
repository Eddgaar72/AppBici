package com.example.ac_basedades.singelton;

import com.example.ac_basedades.entities.Bici;
import java.util.ArrayList;
import java.util.List;

public class BiciBase{

    private List<Bici> Bicis;


    private BiciBase(){
        Bicis = new ArrayList<>();
        Bici bici = new Bici("Trek","Carrera", "Blau", 55);
        Bicis.add(bici);
    }

    public List<Bici> getMoto(){
        return Bicis;
    }

    public static BiciBase mBiciBase;

    public static BiciBase get(){
        if (mBiciBase == null){
            mBiciBase = new BiciBase();
        }
        return mBiciBase;
    }

    public void addBici(Bici bici) {
        Bicis.add(bici);
    }
    public void setUpdatedBici(Bici updatedBici) {
        for (int i = 0; i < Bicis.size(); i++) {
            Bici bici = Bicis.get(i);
            if (bici.getModel().equals(updatedBici.getModel())) {
                Bicis.set(i, updatedBici);
                break;
            }
        }
    }
}
