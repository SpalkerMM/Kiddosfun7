package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KakiActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaki2);
    }
    public void back (View view){
        Intent intent = new Intent(KakiActivity2.this, TanganActivity2.class);
        startActivity(intent);
    }

    public void stage (View view){
        Intent intent = new Intent(KakiActivity2.this,BagiantubuhActivity2.class);
        startActivity(intent);
    }

}