package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    private RelativeLayout bottomSheet;
    private Button loginButton;
    private EditText edtEmailLogin, edtPassLogin;

    private void initView() {
        bottomSheet = findViewById(R.id.rl_btn_to_show_sign_up);
        loginButton = findViewById(R.id.btn_login);
        edtEmailLogin = findViewById(R.id.edt_email_login);
        edtPassLogin = findViewById(R.id.edt_pass_login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        bottomSheet.setOnClickListener(v -> {
            showBottomSheet();
        });

        loginButton.setOnClickListener(v -> {
            String email = edtEmailLogin.getText().toString();
            String pass = edtPassLogin.getText().toString();

            Boolean isValidEmail = email.toLowerCase(Locale.ROOT).equals("flora@gmail.com");
            Boolean isValidPass = pass.toLowerCase(Locale.ROOT).equals("flo123");
            if (email.isEmpty()) {
                edtEmailLogin.requestFocus();
                edtEmailLogin.setError("Please fill your email");
            }
            if(pass.isEmpty()){
                edtPassLogin.requestFocus();
                edtPassLogin.setError("Please fill your password");
            }
            if (isValidEmail && isValidPass) {
                startActivity(new Intent(this, HomeActivity.class));
            }
        });

    }

    private void showBottomSheet() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetsignup);

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.BottomSheetAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }


}