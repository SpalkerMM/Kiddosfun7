package com.example.kiddosfun7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KuraActivity extends AppCompatActivity {

    public void stage (View view){
        Intent intent = new Intent(KuraActivity.this,GameActivity2.class);
        startActivity(intent);
    }

    public void next (View view){
        Intent intent = new Intent(KuraActivity.this,BuayaActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kura);
    }
}