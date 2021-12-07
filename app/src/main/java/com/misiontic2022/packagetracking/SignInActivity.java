package com.misiontic2022.packagetracking;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.misiontic2022.packagetracking.data.MySQLiteHelper;

public class SignInActivity extends AppCompatActivity {

    private EditText etCelular;
    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        etCelular = findViewById(R.id.editTextCelular);
        etNombre = findViewById(R.id.editTextNombre);


    }

    public void guardarDatos(View vista){
        String celular = etCelular.getText().toString();
        String nombre = etNombre.getText().toString();

        MySQLiteHelper conexion_db = new MySQLiteHelper(this);
        String insertar_usuario = "INSERT INTO usuario(usu_celular, usu_nombre) VALUES ('"+celular+"', '"+nombre+"')";

        conexion_db.insertarDatos(insertar_usuario);

        Toast.makeText(this, "Datos Registrados", Toast.LENGTH_SHORT).show();

        Intent IntentMain = new Intent(this,MainActivity.class);
        startActivity(IntentMain);
    }

    public void limpiarDatos(View vista){
        etCelular.setText("");
        etNombre.setText("");

    }
    public void irMain(View vista){
        Intent IntentMain = new Intent(this,MainActivity.class);
        startActivity(IntentMain);
    }

}