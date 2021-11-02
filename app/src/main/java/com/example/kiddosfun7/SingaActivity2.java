package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SingaActivity2 extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singa2);
    }

    public void back (View view){
        Intent intent = new Intent(SingaActivity2.this,DombaActivity2.class);
        startActivity(intent);
    }

    public void stage(View view) {
        Intent intent = new Intent(SingaActivity2.this, PilihanhewanActivity2.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(SingaActivity2.this, GajahActivity2.class);
        startActivity(intent);
    }

    public void suara_singa(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.voice_singa);
        }
        player.start();
    }
}