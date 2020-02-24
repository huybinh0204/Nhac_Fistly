package com.example.nhac_fistly.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nhac_fistly.Model.Chude;
import com.example.nhac_fistly.Model.Theloai;
import com.example.nhac_fistly.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TheloaiAdapter extends RecyclerView.Adapter<TheloaiAdapter.ViewHolder> {
    Context context;
    ArrayList<Theloai> mangTheLoai;

    public TheloaiAdapter(Context context, ArrayList<Theloai> mangTheLoai) {
        this.context = context;
        this.mangTheLoai = mangTheLoai;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_theloai, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Theloai theloai = mangTheLoai.get(position);
        holder.txtTenTheLoai.setText(theloai.getThenTheLoai());
        Picasso.with(context).load(theloai.getHinhTheLoai()).into(holder.imgHinhTheLoai);
    }

    @Override
    public int getItemCount() {
        return mangTheLoai.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgHinhTheLoai;
        TextView txtTenTheLoai;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHinhTheLoai = itemView.findViewById(R.id.imageviewtheloai);
            txtTenTheLoai = itemView.findViewById(R.id.textviewtentheloai);
        }
    }
}
