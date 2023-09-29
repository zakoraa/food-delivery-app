package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnToLoginActivity;

    private void initView(){
        btnToLoginActivity = findViewById(R.id.btn_get_started);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        onBtnToLoginListener();
    }

    private void onBtnToLoginListener(){
        btnToLoginActivity.setOnClickListener(v->{
            startActivity(new Intent(this, LoginActivity.class));
        });

    }
}