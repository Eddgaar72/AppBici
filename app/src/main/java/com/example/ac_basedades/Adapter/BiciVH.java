package com.example.ac_basedades.Adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac_basedades.R;

public class BiciVH extends RecyclerView.ViewHolder {

    TextView marca, color, mida;
    Button edit, delete;

    public BiciVH(@NonNull View itemView) {
        super(itemView);
        marca = itemView.findViewById(R.id.Marca);
        color = itemView.findViewById(R.id.Color);
        mida = itemView.findViewById(R.id.Marc);
        edit = itemView.findViewById(R.id.edit);
        delete = itemView.findViewById(R.id.eliminar);

    }
}
