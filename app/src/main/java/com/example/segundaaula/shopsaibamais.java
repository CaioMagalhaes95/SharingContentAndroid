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

public class shopsaibamais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopsaibamais);
    }


    public void btnTelefone2(View view){
        Uri uri = Uri.parse("tel: 015 30421400");
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

    public void btnMapa2(View view){
        Uri uri = Uri.parse("geo: 0,0?q=Avenida+Professora+Izoraida+Marques+Peres=421");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnSite2(View view){
        Uri uri = Uri.parse("https://iguatemi.com.br/esplanada/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


    public void btnFechar2(View view){
        finish();
    }

}