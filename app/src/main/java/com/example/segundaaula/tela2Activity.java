package com.example.segundaaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void btnTela2(View view){
        Intent intent = new Intent(this, shopsaibamais.class);
        startActivity(intent);
    }

    public void btnFechar2(View view){
        finish();
    }
}