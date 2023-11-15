package com.example.ac_basedades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.example.ac_basedades.Adapter.BiciAdapter;
import com.example.ac_basedades.entities.Bici;
import com.example.ac_basedades.singelton.BiciBase;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Bici> bicis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("AD_BiciBase", "onCreateMain");

        bicis = BiciBase.get().getMoto();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView recyclerView = findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BiciAdapter(getApplicationContext(), bicis));
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.afegir:
                Log.i("AD_BiciBase", "onClick");
                Intent i = new Intent(MainActivity.this, ConfiguracioActivity.class);
                startActivity(i);
                Toast.makeText(this, "Afegir",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.setTitle("AGENDA DE BICIS");
        getMenuInflater().inflate(R.menu.menu_1, menu);
        return super.onCreateOptionsMenu(menu);
    }
}