package com.example.allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NavActivity1 extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav1);

        et1 = (EditText) findViewById(R.id.pt_nombre);
    }

    public void enviar(View view){
        Intent i = new Intent(this, NavActivity2.class);
        i.putExtra("dato", et1.getText().toString());
        startActivity(i);
    }

    public void volver(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}