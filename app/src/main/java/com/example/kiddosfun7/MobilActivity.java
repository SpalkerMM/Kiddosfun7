package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MobilActivity extends AppCompatActivity {

    public void back (View view){
        Intent intent = new Intent(MobilActivity.this,DinoActivity.class);
        startActivity(intent);
    }

    public void stage (View view){
        Intent intent = new Intent(MobilActivity.this,MewarnaiActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);
    }
}