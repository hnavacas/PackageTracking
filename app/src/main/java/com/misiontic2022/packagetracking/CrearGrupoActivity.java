package com.misiontic2022.packagetracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CrearGrupoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_grupo);
    }

    public void irMain(View vista){
        Intent IntentMain = new Intent(this,MainActivity.class);
        startActivity(IntentMain);
    }
}