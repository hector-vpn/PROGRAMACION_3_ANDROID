package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private TextView tV3;
private EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tV3=findViewById(R.id.tV3);

    }
    public void sumar(View v) {
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        int suma = Integer.parseInt(s1) + Integer.parseInt(s2);
        String resultado=String.valueOf(suma);
        tV3.setText("La suma es "+resultado);
    }

}