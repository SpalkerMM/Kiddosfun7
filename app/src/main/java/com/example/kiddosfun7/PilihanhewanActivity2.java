package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PilihanhewanActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanhewan2);
    }

    public void home(View view) {
        Intent intent = new Intent(PilihanhewanActivity2.this,UtamaActivity2.class);
        startActivity(intent);
    }

    public void singa (View view){
        Intent intent = new Intent(PilihanhewanActivity2.this,SingaActivity2.class);
        startActivity(intent);
    }
    public void kucing (View view) {
        Intent intent = new Intent(PilihanhewanActivity2.this, KucingActivity2.class);
        startActivity(intent);
    }
    public void gajah (View view) {
        Intent intent = new Intent(PilihanhewanActivity2.this, GajahActivity2.class);
        startActivity(intent);
    }
    public void domba (View view) {
        Intent intent = new Intent(PilihanhewanActivity2.this, DombaActivity2.class);
        startActivity(intent);
    }
    public void ayam (View view) {
        Intent intent = new Intent(PilihanhewanActivity2.this, AyamActivity2.class);
        startActivity(intent);
    }
}