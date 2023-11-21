package com.example.ac_basedades.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac_basedades.R;
import com.example.ac_basedades.entities.Bici;
import java.util.List;

public class BiciAdapter extends RecyclerView.Adapter<BiciVH> {
    Context context;
    List<Bici> bicis;

    public BiciAdapter (Context context, List<Bici> bicis){
        this.context = context;
        this.bicis = bicis;
    }
    @NonNull
    @Override
    public BiciVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BiciVH(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BiciVH holder, int position) {
        final Bici bici= bicis.get(position);

        holder.marca.setText(bicis.get(position).getMarca());
        holder.color.setText(bicis.get(position).getColor());
        int midaValue = bici.getMidaMarc();
        holder.mida.setText(String.valueOf(midaValue));
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();

                if (position != RecyclerView.NO_POSITION) {
                    bicis.remove(position);
                    notifyItemRemoved(position);
                    Toast.makeText(context, "Eliminat", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return bicis.size();
    }

}
