package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MewarnaiActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mewarnai2);
    }

    public void home (View view){
        Intent intent = new Intent(MewarnaiActivity2.this,GameActivity2.class);
        startActivity(intent);
    }

    public void kura (View view){
        Intent intent = new Intent(MewarnaiActivity2.this,KuraActivity.class);
        startActivity(intent);
    }

    public void buaya (View view){
        Intent intent = new Intent(MewarnaiActivity2.this,BuayaActivity.class);
        startActivity(intent);
    }

    public void dino (View view){
        Intent intent = new Intent(MewarnaiActivity2.this,DinoActivity.class);
        startActivity(intent);
    }

    public void mobil (View view){
        Intent intent = new Intent(MewarnaiActivity2.this,MobilActivity.class);
        startActivity(intent);
    }
}