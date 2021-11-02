package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameActivity2 extends AppCompatActivity {


    public void homeutama(View view) {
        Intent intent = new Intent(GameActivity2.this,UtamaActivity2.class);
        startActivity(intent);
    }

    public void mewarnai (View view){
        Intent intent = new Intent(GameActivity2.this,MewarnaiActivity2.class);
        startActivity(intent);
    }

    /*public void tebakgambar(View view){
        Intent intent = new Intent(GameActivity2.this,TebakgambarActivity2.class);
        startActivity(intent);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }

}