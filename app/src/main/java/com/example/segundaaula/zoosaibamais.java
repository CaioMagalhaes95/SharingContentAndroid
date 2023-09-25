package com.example.segundaaula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class zoosaibamais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoosaibamais);


    }

    public void btnMapa(View view){
        Uri uri = Uri.parse("geo: 0,0?q=Rua+Teodoro+Kaise=883");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnNavegacao(View view){
        Uri uri = Uri.parse("google.navigation:q=Rua+Teodoro+Kaise=883");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnTelefone(View view){
        Uri uri = Uri.parse("tel: 015 32275454");
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        int permissionCheck =
                ContextCompat.checkSelfPermission(this,
                        Manifest.permission.CALL_PHONE);
        if(permissionCheck != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,
                    new String[]{
                            android.Manifest.permission.CALL_PHONE
                    }, 1);
        }
        else{
            startActivity(intent);
        }
    }

    public void btnSite(View view){
        Uri uri = Uri.parse("https://www.sorocaba.sp.gov.br/zoologico/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



    public void btnFechar(View view){
        finish();
    }


}