package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class DombaActivity2 extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domba2);
    }



    public void back (View view){
        Intent intent = new Intent(DombaActivity2.this,KucingActivity2.class);
        startActivity(intent);
    }

    public void stage (View view){
        Intent intent = new Intent(DombaActivity2.this,PilihanhewanActivity2.class);
        startActivity(intent);
    }

    public void next (View view){
        Intent intent = new Intent(DombaActivity2.this,SingaActivity2.class);
        startActivity(intent);
    }

    public void suara_domba (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.voice_domba);
        }
        player.start();
    }
}