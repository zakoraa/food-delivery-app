package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class DetailProductActivity extends AppCompatActivity {
    private ImageView ivBackToHomePage;

    private void initView(){
        ivBackToHomePage = findViewById(R.id.iv_back_to_home_page);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);

        initView();

        ivBackToHomePage.setOnClickListener(v->{
            super.onBackPressed();
        });
    }
}