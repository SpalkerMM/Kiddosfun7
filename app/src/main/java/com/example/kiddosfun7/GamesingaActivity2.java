package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GamesingaActivity2 extends AppCompatActivity {
    public void next (View view){
        Intent intent = new Intent(GamesingaActivity2.this, GamegajahActivity2.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamesinga2);
    }
}