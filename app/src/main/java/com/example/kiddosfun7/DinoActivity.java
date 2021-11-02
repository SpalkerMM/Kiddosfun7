package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DinoActivity extends AppCompatActivity {

    public void back (View view){
        Intent intent = new Intent(DinoActivity.this, BuayaActivity.class);
        startActivity(intent);
    }

    public void stage (View view){
        Intent intent = new Intent(DinoActivity.this,MewarnaiActivity2.class);
        startActivity(intent);
    }

    public void next (View view){
        Intent intent = new Intent(DinoActivity.this,MobilActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dino);
    }
}