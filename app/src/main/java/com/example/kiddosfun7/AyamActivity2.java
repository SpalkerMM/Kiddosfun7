package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AyamActivity2 extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam2);
    }

    public void back (View view){
        Intent intent = new Intent(AyamActivity2.this,GajahActivity2.class);
        startActivity(intent);
    }

    public void stage (View view){
        Intent intent = new Intent(AyamActivity2.this,PilihanhewanActivity2.class);
        startActivity(intent);
    }

    public void next (View view) {
        Intent intent = new Intent (AyamActivity2.this, KucingActivity2.class);
        startActivity(intent);
    }

    public void suara_ayam (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.voice_ayam);
        }
        player.start();
    }
}