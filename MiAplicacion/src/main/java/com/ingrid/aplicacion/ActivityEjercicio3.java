package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio3 extends AppCompatActivity {

    CheckBox chkFutbol, chkBasquetbol, chkNatacion;
    Button btnMostrar, btnVolver;
    TextView lblSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        chkFutbol = findViewById(R.id.chkFutbol);
        chkBasquetbol = findViewById(R.id.chkBasquetbol);
        chkNatacion = findViewById(R.id.chkNatacion);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnVolver = findViewById(R.id.btnVolver);
        lblSeleccion = findViewById(R.id.lblSeleccion);

        btnMostrar.setOnClickListener(view -> {
            String deportes = "";

            if (chkFutbol.isChecked()) {
                deportes += "Fútbol ";
            }
            if (chkBasquetbol.isChecked()) {
                deportes += "Basquetbol ";
            }
            if (chkNatacion.isChecked()) {
                deportes += "Natación ";
            }

            if (deportes.isEmpty()) {
                lblSeleccion.setText("No se seleccionó ningún deporte.");
            } else {
                lblSeleccion.setText("Seleccionado: " + deportes);
            }
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio3.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional para cerrar esta pantalla
        });
    }
}
