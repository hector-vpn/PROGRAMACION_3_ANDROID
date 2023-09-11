package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private int intentos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.e1);
        et2=findViewById(R.id.et2);

    }
    public void ingresar(View v){
        String usuario=et1.getText().toString();
        String clave=et2.getText().toString();
        if(usuario.equals("juan")!=true || clave.equals("123abc")!=true){
            intentos++;
            Toast.makeText(this,"Ingreso Nombre de usuario o clave incorrecta",Toast.LENGTH_SHORT).show();
            if(intentos==3){
                finish();
            }
        }
        else{
            Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show();
            // Lanzamos el navegador web configurado por defecto en el celular
            Intent intento=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
            startActivity(intento);

        }
    }
}