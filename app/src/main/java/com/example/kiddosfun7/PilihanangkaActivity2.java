package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PilihanangkaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanangka2);
    }


    public void home (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,UtamaActivity2.class);
        startActivity(intent);
    }
    public void one (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number1Activity2.class);
        startActivity(intent);
    }

    public void two (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number2Activity2.class);
        startActivity(intent);
    }

    public void three (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number3Activity2.class);
        startActivity(intent);
    }

    public void four (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number4Activity2.class);
        startActivity(intent);
    }

    public void five (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number5Activity2.class);
        startActivity(intent);
    }

    public void six (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number6Activity2.class);
        startActivity(intent);
    }

    public void seven (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number7Activity2.class);
        startActivity(intent);
    }

    public void eight (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number8Activity2.class);
        startActivity(intent);
    }

    public void nine (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number9Activity2.class);
        startActivity(intent);
    }

    public void zero (View view){
        Intent intent = new Intent(PilihanangkaActivity2.this,Number0Activity2.class);
        startActivity(intent);
    }
}