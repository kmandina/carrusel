package com.auu.hunterblade.carrusel;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ViewPagerCarouselView viewPagerCarouselView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        long carouselSlideInterval = 3000; // 3 SECONDS
        int [] imageResourceIds = {android.R.drawable.btn_default, android.R.drawable.btn_dialog, android.R.drawable.btn_dropdown, android.R.drawable.btn_minus, android.R.drawable.arrow_up_float, android.R.drawable.btn_radio};

        viewPagerCarouselView = (ViewPagerCarouselView) findViewById(R.id.carousel_view);
        viewPagerCarouselView.setData(getSupportFragmentManager(), imageResourceIds, carouselSlideInterval);





    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewPagerCarouselView.onDestroy();
    }
}
