package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Number7Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number72);
    }
    MediaPlayer player;

    public void back (View view){
        Intent intent = new Intent(Number7Activity2.this,Number6Activity2.class);
        startActivity(intent);
    }

    public void home1 (View view){
        Intent intent = new Intent(Number7Activity2.this,PilihanangkaActivity2.class);
        startActivity(intent);
    }

    public void next (View view){
        Intent intent = new Intent(Number7Activity2.this,Number8Activity2.class);
        startActivity(intent);
    }

    public void voiceover (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.seven);
        }
        player.start();
    }
}