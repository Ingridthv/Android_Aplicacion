package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio5 extends AppCompatActivity {

    private ListView lstCiudades;
    private Button btnMostrar, btnVolver;
    private TextView lblMensaje;
    private String ciudadSeleccionada = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        lstCiudades = findViewById(R.id.lstCiudades);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnVolver = findViewById(R.id.btnVolver);
        lblMensaje = findViewById(R.id.lblMensaje);

        final String[] ciudades = {
                "Ciudad de Mexico",
                "Guadalajara",
                "Monterrey",
                "Cancun",
                "Tijuana"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_single_choice,
                ciudades
        );

        lstCiudades.setAdapter(adapter);
        lstCiudades.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        lstCiudades.setOnItemClickListener((adapterView, view, position, l) -> {
            ciudadSeleccionada = ciudades[position];
        });

        btnMostrar.setOnClickListener(view -> {
            if (ciudadSeleccionada != null) {
                lblMensaje.setText("Seleccionaste: " + ciudadSeleccionada);
            } else {
                lblMensaje.setText("No se seleccionó ninguna ciudad");
            }
        });

        btnVolver.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityEjercicio5.this, MainActivity.class);
            startActivity(intent);
            finish(); // Cierra esta actividad si ya no quieres volver con "atrás"
        });

        lblMensaje.setText("Esperando selección...");
    }
}

