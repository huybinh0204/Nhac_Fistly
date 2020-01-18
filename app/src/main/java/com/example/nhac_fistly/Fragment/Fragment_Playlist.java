package com.example.nhac_fistly.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.nhac_fistly.R;


public class Fragment_Playlist extends Fragment {
    View view;
    ListView lvplaylist;
    TextView txttitleplaylist, txtviewmoreplaylist;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_playlist, container, false);
        lvplaylist = view.findViewById(R.id.lvplaylist);
        txttitleplaylist = view.findViewById(R.id.tvtitleplaylist);
        txtviewmoreplaylist = view.findViewById(R.id.tvmoreplaylist);
        GetData();
        return view;
    }

    private void GetData() {

    }
}
