package com.example.thibautbrunel.maquette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        getSupportActionBar().hide();
    }
}