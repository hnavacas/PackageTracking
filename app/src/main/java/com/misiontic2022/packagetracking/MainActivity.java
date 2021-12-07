package com.misiontic2022.packagetracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void irCrearGrupo(View vista){
        Intent IntentMain = new Intent(this,CrearGrupoActivity.class);
        startActivity(IntentMain);
    }

    public void irMapa(View vista){
        Intent IntentMain = new Intent(this,VerMapActivity.class);
        startActivity(IntentMain);
    }
}