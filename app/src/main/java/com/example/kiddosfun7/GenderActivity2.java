package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GenderActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void laki (View view){
        Intent intent = new Intent(GenderActivity2.this,UtamaActivity2.class);
        startActivity(intent);
    }

    public void perempuan (View view){
        Intent intent = new Intent(GenderActivity2.this,UtamaActivity2.class);
        startActivity(intent);
    }

}