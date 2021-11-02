package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BagiantubuhActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagiantubuh2);
    }


    public void home(View view){
        Intent intent = new Intent (BagiantubuhActivity2.this, UtamaActivity2.class);
        startActivity((intent));
    }

    public void mata(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, MataActivity2.class);
        startActivity(intent);
    }

    public void telinga(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, TelingaActivity2.class);
        startActivity(intent);
    }

    public void hidung(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, HidungActivity2.class);
        startActivity(intent);
    }

    public void mulut(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, MulutActivity2.class);
        startActivity(intent);
    }

    public void gigi(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, GigiActivity2.class);
        startActivity(intent);
    }

    public void lidah(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, LidahActivity2.class);
        startActivity(intent);
    }

    public void tangan(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, TanganActivity2.class);
        startActivity(intent);
    }

    public void kaki(View view) {
        Intent intent = new Intent(BagiantubuhActivity2.this, KakiActivity2.class);
        startActivity(intent);
    }

}
