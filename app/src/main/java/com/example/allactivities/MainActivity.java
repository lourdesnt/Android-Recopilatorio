package com.example.allactivities;

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

    public void toCalculadoraRadio (View vista){
        Intent calcRadio = new Intent(this, CalculadoraRadio.class);
        startActivity(calcRadio);
    }

    public void toCalculadoraSpinner (View vista){
        Intent calcSpinner = new Intent(this, CalculadoraSpinner.class);
        startActivity(calcSpinner);
    }

    public void toNotasList (View vista){
        Intent notasList = new Intent(this, ListaAlumnos.class);
        startActivity(notasList);
    }

    public void toNavActivities (View vista){
        Intent navActs = new Intent(this, NavActivity1.class);
        startActivity(navActs);
    }

    public void toWeb (View vista){
        Intent web = new Intent(this, Web1.class);
        startActivity(web);
    }
}