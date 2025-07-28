package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio7 extends AppCompatActivity {

    private Spinner cmbSO;
    private Button btnMostrar;
    private Button btnVolver;
    private TextView lblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        cmbSO = findViewById(R.id.cmbSO);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnVolver = findViewById(R.id.btnVolver);
        lblMensaje = findViewById(R.id.lblMensaje);

        String[] sistemasOperativos = {"Windows", "macOS", "Linux", "iOS"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                sistemasOperativos
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbSO.setAdapter(adapter);

        cmbSO.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String seleccionado = (String) parent.getItemAtPosition(position);
                lblMensaje.setText("Seleccionaste: " + seleccionado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                lblMensaje.setText("No seleccionaste ningun sistema operativo.");
            }
        });

        btnMostrar.setOnClickListener(v -> {
            if (cmbSO.getAdapter().getCount() == 0) {
                Toast.makeText(ActivityEjercicio7.this, "No hay sistemas operativos disponibles", Toast.LENGTH_SHORT).show();
                return;
            }
            String seleccionado = (String) cmbSO.getSelectedItem();
            if (seleccionado != null) {
                lblMensaje.setText("Seleccionaste: " + seleccionado);
            } else {
                lblMensaje.setText("No seleccionaste ningun sistema operativo.");
            }
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio7.this, MainActivity.class);
            startActivity(intent);
            finish(); // opcional
        });

        lblMensaje.setText("Esperando seleccion...");
    }
}
