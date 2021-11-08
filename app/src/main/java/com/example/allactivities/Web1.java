package com.example.allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Web1 extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        et1 = (EditText) findViewById(R.id.txt_web);
    }

    public void navegar(View view){
        Intent web2 = new Intent(this, Web2.class);
        web2.putExtra("sitioWeb", et1.getText().toString());
        startActivity(web2);
    }

    public void volver(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}