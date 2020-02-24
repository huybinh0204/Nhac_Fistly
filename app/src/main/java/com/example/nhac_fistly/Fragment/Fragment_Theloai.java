package com.example.nhac_fistly.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.nhac_fistly.Adapter.TheloaiAdapter;
import com.example.nhac_fistly.Model.Theloai;
import com.example.nhac_fistly.R;
import com.example.nhac_fistly.Service.APIService;
import com.example.nhac_fistly.Service.Dataservice;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Theloai extends Fragment {
    View view;
    RecyclerView recyclerViewTheLoai;
    TheloaiAdapter theloaiAdapter;
    TextView txtxemthemTheLoai;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_theloai, container, false);
        recyclerViewTheLoai = view.findViewById(R.id.recyclerviewTheloai);
        txtxemthemTheLoai = view.findViewById(R.id.textviewxemthemtheloai);
        GetData();
        return view;
    }

    private void GetData() {
        Dataservice dataservice = APIService.getService();
        Call<List<Theloai>> callback = dataservice.GetTheloai();
        callback.enqueue(new Callback<List<Theloai>>() {
            @Override
            public void onResponse(Call<List<Theloai>> call, Response<List<Theloai>> response) {
                ArrayList<Theloai> theloaiArrayList = (ArrayList<Theloai>) response.body();
                theloaiAdapter = new TheloaiAdapter(getActivity(), theloaiArrayList);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerViewTheLoai.setLayoutManager(linearLayoutManager);
                recyclerViewTheLoai.setAdapter(theloaiAdapter);
            }

            @Override
            public void onFailure(Call<List<Theloai>> call, Throwable t) {

            }
        });
    }
}
