package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout lyDetailProduct;

    private void initView(){
        lyDetailProduct = findViewById(R.id.ly_detail_product);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();

        lyDetailProduct.setOnClickListener(v->{
            startActivity(new Intent(this, DetailProductActivity.class));
        });
    }
}