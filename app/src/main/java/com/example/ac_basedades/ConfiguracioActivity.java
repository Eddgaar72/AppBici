package com.example.ac_basedades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.ac_basedades.entities.Bici;
import com.example.ac_basedades.singelton.BiciBase;
import com.example.ac_basedades.sqlite.DbBicis;

public class ConfiguracioActivity extends AppCompatActivity {
    private Bici bici;
    private EditText marcaedit, modeledit , coloredit, midaedit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("AD_BiciBase", "onCreateConfigurcaio");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracio);

        marcaedit = findViewById(R.id.EditMarca);
        modeledit = findViewById(R.id.EditModel);
        coloredit = findViewById(R.id.EditColor);
        midaedit = findViewById(R.id.EditMida);




    }
    public void toMain(View view){
        Log.i("AD_BiciBase", "toMain");

        String marca =marcaedit.getText().toString();
        String model = modeledit.getText().toString();
        String color = coloredit.getText().toString();
        int mida = 0;
        try {
            mida = Integer.parseInt(midaedit.getText().toString());
        } catch (NumberFormatException e) {
        }
        bici = new Bici();

        bici.setMarca(marca);
        bici.setModel(model);
        bici.setColor(color);
        bici.setMidaMarc(mida);

        BiciBase.get().addBici(bici);

       DbBicis dbBicis = new DbBicis(ConfiguracioActivity.this);
       dbBicis.insertarBicis(marca,model,color,mida);

        Intent i =new Intent(ConfiguracioActivity.this, MainActivity.class);
        i.putExtra("configuracioBici", bici);
        startActivity(i);
        finish();
    }
}