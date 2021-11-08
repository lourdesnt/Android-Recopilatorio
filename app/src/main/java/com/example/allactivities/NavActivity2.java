package com.example.allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NavActivity2 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav2);

        tv1 = (TextView) findViewById(R.id.txt_nombre);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola "+dato);
    }

    public void regresar(View view){
        Intent i = new Intent(this, NavActivity1.class);
        startActivity(i);
    }
}