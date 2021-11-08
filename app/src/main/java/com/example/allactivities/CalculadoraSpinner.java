package com.example.allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraSpinner extends AppCompatActivity {

    private TextView res_txt;
    private EditText primer_num, seg_num;
    private Spinner opc_calc;
    private String selected, spinner_item;
    private String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_spinner);

        res_txt = (TextView) findViewById(R.id.res_txt);
        primer_num = (EditText) findViewById(R.id.primer_num);
        seg_num = (EditText) findViewById(R.id.seg_num);
        opc_calc = (Spinner) findViewById(R.id.opc_calc);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_style, opciones);
        opc_calc.setAdapter(adapter);
    }

    public void calcular(View vista) {

        String srN1 = primer_num.getText().toString();
        String srN2 = seg_num.getText().toString();

        if (srN1.isEmpty() || srN2.isEmpty()) {
            Toast.makeText(this, "No se pueden dejar campos vacíos", Toast.LENGTH_LONG).show();
            return;
        } else {
            double n1 = Double.parseDouble(srN1);
            double n2 = Double.parseDouble(srN2);
            double res = 0;
            String opcion = opc_calc.getSelectedItem().toString();
            switch (opcion) {
                case "Sumar":
                    res = n1 + n2;
                    break;
                case "Restar":
                    res = n1 - n2;
                    break;
                case "Multiplicar":
                    res = n1 * n2;
                    break;
                case "Dividir":
                    if (n2 == 0) {
                        Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
                        return;
                    }
                    res = n1 / n2;
                    break;
            }
            res_txt.setText(String.valueOf(res));
        }

    }

    public void volver(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}