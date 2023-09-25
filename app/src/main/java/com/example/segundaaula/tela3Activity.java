package com.example.segundaaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }


    public void btnTela3(View view){
        Intent intent = new Intent(this, headsaibamais.class);
        startActivity(intent);
    }

    public void btnFechar3(View view){
        finish();
    }
}