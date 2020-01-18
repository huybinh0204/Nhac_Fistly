package com.example.nhac_fistly.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.nhac_fistly.R;

public class Fragment_ChuDe_TheLoai_ToDay extends Fragment {
    View view;
    HorizontalScrollView horizontalScrollView;
    TextView txtxemthem;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_chude_theloai_today, container, false);
        horizontalScrollView = view.findViewById(R.id.horizontalscrollview);
        txtxemthem = view.findViewById(R.id.tvxemthem);
        return view;
    }
}
