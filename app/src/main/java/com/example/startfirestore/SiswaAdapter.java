package com.example.startfirestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.ViewHolder>{
    private Context context;
    private List<Siswa> data;

    public SiswaAdapter(Context context, List<Siswa> data) {
            this.context = context;
            this.data = data;
            }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Siswa results = data.get(position);
        holder.nama.setText(results.getNama());
        holder.kelas.setText(results.getKelas());
        holder.jenkel.setText(results.getJenisKelamin());
        String aktif;
        if (results.isAktif() == true){
            aktif = "Aktif";
        }else{
            aktif = "Tidak Aktif";
        }
        holder.aktif.setText(aktif);
    }

    @Override
    public int getItemCount(){
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nama;
        TextView kelas;
        TextView jenkel;
        TextView aktif;

        public ViewHolder(View itemView){
            super(itemView);
            nama = (TextView) itemView.findViewById(R.id.nama);
            kelas = (TextView) itemView.findViewById(R.id.kelas);
            jenkel = (TextView) itemView.findViewById(R.id.jenisKelamin);
            aktif = (TextView) itemView.findViewById(R.id.aktif);
        }
    }
}

