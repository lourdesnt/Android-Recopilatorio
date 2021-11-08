package com.example.allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraRadio extends AppCompatActivity {

    private EditText txt_num1, txt_num2;
    private TextView txt_numRes;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_radio);

        txt_num1 = (EditText) findViewById(R.id.txt_num1);
        txt_num2 = (EditText) findViewById(R.id.txt_num2);
        txt_numRes = (TextView) findViewById(R.id.txt_numRes);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
    }

    public void calcular(View view) {
        if(txt_num1.getText().toString().isEmpty() || txt_num2.getText().toString().isEmpty()){
            Toast.makeText(this, "No se pueden dejar campos vacíos", Toast.LENGTH_LONG).show();
            return;

        } else {
            double n1 = Double.parseDouble(txt_num1.getText().toString());
            double n2 = Double.parseDouble(txt_num2.getText().toString());
            if (rb1.isChecked()) {
                double suma = n1 + n2;
                String res = String.valueOf(suma);
                txt_numRes.setText(res);
            } else if (rb2.isChecked()) {
                double resta = n1 - n2;
                String res = String.valueOf(resta);
                txt_numRes.setText(res);
            }
        }

    }

    public void volver(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}