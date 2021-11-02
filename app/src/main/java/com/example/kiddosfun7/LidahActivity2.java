package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LidahActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lidah2);
    }
    public void back (View view){
        Intent intent = new Intent(LidahActivity2.this, GigiActivity2.class);
        startActivity(intent);
    }

    public void stage (View view){
        Intent intent = new Intent(LidahActivity2.this, BagiantubuhActivity2.class);
        startActivity(intent);
    }

    public void next (View view) {
        Intent intent = new Intent(LidahActivity2.this, TanganActivity2.class);
        startActivity(intent);
    }

}