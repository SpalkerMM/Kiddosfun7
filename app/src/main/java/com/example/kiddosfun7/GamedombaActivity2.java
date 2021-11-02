package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GamedombaActivity2 extends AppCompatActivity {
    public void next (View view){
        Intent intent = new Intent(GamedombaActivity2.this, GamesingaActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamedomba2);
    }
}