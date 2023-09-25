package com.example.segundaaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
    }

    public void btnTelaZoo(View view){
        Intent intent = new Intent(this, tela1Activity.class);
        startActivity(intent);
    }
    public void btnTelaShop(View view){
        Intent intent = new Intent(this, tela2Activity.class);

        startActivity(intent);
    }

    public void btnTelaHead(View view){
        Intent intent = new Intent(this, tela3Activity.class);
        startActivity(intent);
    }





}