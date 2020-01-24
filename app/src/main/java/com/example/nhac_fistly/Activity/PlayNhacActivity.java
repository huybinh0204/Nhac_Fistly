package com.example.nhac_fistly.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.nhac_fistly.R;

public class PlayNhacActivity extends AppCompatActivity {
    Toolbar toolbarplaynhac;
    TextView txtTimesong, txtTotaltimesong;
    SeekBar sktime;
    ImageButton imgplay, imgrepeat, imgnext, imgpre, imgrandom;
    ViewPager viewPagerplaynhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_nhac);
        init();
    }

    private void init() {
        toolbarplaynhac   = findViewById(R.id.toolbarplaynhac);
        txtTimesong       = findViewById(R.id.textviewtimesong);
        txtTotaltimesong  = findViewById(R.id.textviewtotaltimesong);
        sktime            = findViewById(R.id.seekbarsong);
        imgnext           = findViewById(R.id.imagebuttonnext);
        imgplay           = findViewById(R.id.imagebuttonplay);
        imgpre            = findViewById(R.id.imagebuttonpre);
        imgrandom         = findViewById(R.id.imagebuttonsuffle);
        imgrepeat         = findViewById(R.id.imagebuttonrepeat);
        viewPagerplaynhac = findViewById(R.id.viewpagerplaynhac);

        setSupportActionBar(toolbarplaynhac);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarplaynhac.setTitleTextColor(Color.WHITE);
        toolbarplaynhac.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
