package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NamaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama2);
    }

    public  void lanjut (View view){
        Intent intent = new Intent(NamaActivity2.this,GenderActivity2.class);
        startActivity(intent);
    }
    
}