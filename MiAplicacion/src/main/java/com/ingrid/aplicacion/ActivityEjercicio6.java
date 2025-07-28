package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActivityEjercicio6 extends AppCompatActivity {

    private ListView lstDisponible;
    private ListView lstSeleccionados;
    private Button btnAgregar;
    private Button btnQuitar;
    private Button btnVolver;

    private ArrayList<String> listaDisponibles;
    private ArrayList<String> listaSeleccionados;

    private ArrayAdapter<String> adapterDisponibles;
    private ArrayAdapter<String> adapterSeleccionados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        lstDisponible = findViewById(R.id.lstDisponible);
        lstSeleccionados = findViewById(R.id.lstSeleccionados);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnQuitar = findViewById(R.id.btnQuitar);
        btnVolver = findViewById(R.id.btnVolver);

        // Inicializar listas
        listaDisponibles = new ArrayList<>();
        listaSeleccionados = new ArrayList<>();

        // Agregar elementos iniciales a disponibles
        listaDisponibles.add("Matemáticas");
        listaDisponibles.add("Física");
        listaDisponibles.add("Programación");
        listaDisponibles.add("Historia");
        listaDisponibles.add("Inglés");

        // Adaptadores
        adapterDisponibles = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_multiple_choice,
                listaDisponibles);

        adapterSeleccionados = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_multiple_choice,
                listaSeleccionados);

        lstDisponible.setAdapter(adapterDisponibles);
        lstDisponible.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        lstSeleccionados.setAdapter(adapterSeleccionados);
        lstSeleccionados.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        btnAgregar.setOnClickListener(v -> {
            int count = lstDisponible.getCount();
            boolean anySelected = false;

            for (int i = count - 1; i >= 0; i--) {
                if (lstDisponible.isItemChecked(i)) {
                    String item = listaDisponibles.get(i);
                    listaSeleccionados.add(item);
                    listaDisponibles.remove(i);
                    anySelected = true;
                }
            }

            if (!anySelected) {
                Toast.makeText(ActivityEjercicio6.this, "Selecciona un elemento para agregar", Toast.LENGTH_SHORT).show();
                return;
            }

            lstDisponible.clearChoices();
            adapterDisponibles.notifyDataSetChanged();
            adapterSeleccionados.notifyDataSetChanged();
        });

        btnQuitar.setOnClickListener(v -> {
            int count = lstSeleccionados.getCount();
            boolean anySelected = false;

            for (int i = count - 1; i >= 0; i--) {
                if (lstSeleccionados.isItemChecked(i)) {
                    String item = listaSeleccionados.get(i);
                    listaDisponibles.add(item);
                    listaSeleccionados.remove(i);
                    anySelected = true;
                }
            }

            if (!anySelected) {
                Toast.makeText(ActivityEjercicio6.this, "Selecciona un elemento para quitar", Toast.LENGTH_SHORT).show();
                return;
            }

            lstSeleccionados.clearChoices();
            adapterSeleccionados.notifyDataSetChanged();
            adapterDisponibles.notifyDataSetChanged();
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio6.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
