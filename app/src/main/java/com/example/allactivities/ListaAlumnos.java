package com.example.allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaAlumnos extends AppCompatActivity {

    private ListView listaAlumnos;
    private TextView res_txt;
    private Map<String, Double> notas;
    private ArrayList<String> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alumnos);

        res_txt = (TextView) findViewById(R.id.resAlumno);
        listaAlumnos = (ListView) findViewById(R.id.alumnos);

        notas = new HashMap<>();
        notas.put("Dani", 10.0);
        notas.put("David", 9.0);
        notas.put("Raquel", 10.0);
        notas.put("Victoria", 10.0);
        notas.put("Lourdes", 10.0);
        notas.put("Manuel Fdez H", 8.0);
        notas.put("Pablo V", 7.0);
        notas.put("Marco", 6.0);
        notas.put("Javier C", 5.0);
        notas.put("Andrés", 4.0);
        notas.put("Alejandro", 3.0);
        notas.put("Antonio", 2.0);
        notas.put("Maria del Carmen", 10.0);

        nombres = new ArrayList<>();
        nombres.add("Dani");
        nombres.add("David");
        nombres.add("Raquel");
        nombres.add("Victoria");
        nombres.add("Lourdes");
        nombres.add("Manuel Fdez H");
        nombres.add("Pablo V");
        nombres.add("Marco");
        nombres.add("Javier C");
        nombres.add("Andrés");
        nombres.add("Alejandro");
        nombres.add("Antonio");
        nombres.add("Maria del Carmen");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listview_style, nombres);
        listaAlumnos.setAdapter(adapter);

        listaAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                mostrarNota(adapter.getItem(position));
            }
        });
    }

    public void mostrarNota(String nombre){
        double nota = notas.get(nombre);
        res_txt.setText("La nota de "+nombre+" es "+String.valueOf(nota));
    }

    public void volver(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}