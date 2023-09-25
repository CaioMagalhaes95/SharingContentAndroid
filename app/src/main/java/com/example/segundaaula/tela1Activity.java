package com.example.segundaaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
    }

    public void btnTela(View view){
        Intent intent = new Intent(this, zoosaibamais.class);
        startActivity(intent);
    }

    public void btnFechar(View view){
        finish();
    }
}