package com.example.nhac_fistly.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.nhac_fistly.R;

public class DanhsachtatcachudeActivity extends AppCompatActivity {
    Toolbar toolbartatcachude;
    RecyclerView recyclerViewtatcachude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachtatcachude);
        init();
    }

    private void init() {
        toolbartatcachude = findViewById(R.id.toolbarallchude);
        recyclerViewtatcachude = findViewById(R.id.recyclerviewAllChude);

        setSupportActionBar(toolbartatcachude);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Chủ Đề");
        toolbartatcachude.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
