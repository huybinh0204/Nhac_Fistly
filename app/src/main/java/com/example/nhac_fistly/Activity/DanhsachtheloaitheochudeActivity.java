package com.example.nhac_fistly.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.nhac_fistly.R;

public class DanhsachtheloaitheochudeActivity extends AppCompatActivity {
    Toolbar toolbartheloaitheochude;
    RecyclerView recyclerViewtheloaitheochude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachtheloaitheochude);
        init();
    }

    private void init() {
        toolbartheloaitheochude = findViewById(R.id.toolbartheloaitheochude);
        recyclerViewtheloaitheochude = findViewById(R.id.recyclerviewtheloaitheochude);
        setSupportActionBar(toolbartheloaitheochude);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(""); // truyen vao ten chu de la: chuDe.getTenChuDe();
        toolbartheloaitheochude.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
