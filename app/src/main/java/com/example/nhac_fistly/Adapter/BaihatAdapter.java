package com.example.nhac_fistly.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nhac_fistly.Model.Baihat;
import com.example.nhac_fistly.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BaihatAdapter extends RecyclerView.Adapter<BaihatAdapter.ViewHolder> {
    Context context;
    ArrayList<Baihat> baihatArrayList;

    public BaihatAdapter(Context context, ArrayList<Baihat> baihatArrayList) {
        this.context = context;
        this.baihatArrayList = baihatArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_baihat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Baihat baihat = baihatArrayList.get(position);
        holder.txtTenBaiHat.setText(baihat.getTenBaiHat());
        holder.txtTenCaSi.setText(baihat.getCaSi());
        Picasso.with(context).load(baihat.getHinhBaiHat()).into(holder.imgHinhBaiHat);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTenBaiHat, txtTenCaSi;
        ImageView imgHinhBaiHat, imgLuotThich;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTenBaiHat = itemView.findViewById(R.id.textviewtenbaihat);
            txtTenCaSi = itemView.findViewById(R.id.textviewtencasibaihat);
            imgHinhBaiHat = itemView.findViewById(R.id.imageviewbaihat);
            imgLuotThich = itemView.findViewById(R.id.imageviewluotthich);
        }
    }
}
