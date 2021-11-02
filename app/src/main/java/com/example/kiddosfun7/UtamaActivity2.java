package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UtamaActivity2 extends AppCompatActivity {

    public void bagiantubuh(View view){
        Intent intent = new Intent(UtamaActivity2.this , BagiantubuhActivity2.class );
        startActivity(intent);
    }

    public void hewan (View view){
        Intent intent = new Intent(UtamaActivity2.this , PilihanhewanActivity2.class);
        startActivity(intent);
    }

    public void angka (View view){
        Intent intent = new Intent(UtamaActivity2.this , PilihanangkaActivity2.class);
        startActivity(intent);
    }

    public void games (View view){
        Intent intent = new Intent(UtamaActivity2.this,GameActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
    }
}