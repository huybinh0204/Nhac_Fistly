package com.example.nhac_fistly.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nhac_fistly.R;


public class Fragment_Tim_Kiem extends Fragment {
    View view;
    RecyclerView recyclerViewsearchbaihat;
    TextView txtkhongcodulieu;
    EditText edtSearchbaihat;
    ImageButton imgbtnSearchbaihat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tim_kiem, container, false);
        recyclerViewsearchbaihat = view.findViewById(R.id.recyclerviewsearchbaihat);
        txtkhongcodulieu = view.findViewById(R.id.textviewkhongcodulieu);
        edtSearchbaihat = view.findViewById(R.id.edittextSearchbaihat);
        imgbtnSearchbaihat = view.findViewById(R.id.imagebuttonSearchbaihat);
        return view;
    }
}
