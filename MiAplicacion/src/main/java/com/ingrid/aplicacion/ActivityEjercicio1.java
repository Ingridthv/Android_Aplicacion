package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio1 extends AppCompatActivity {
    private TextView lblTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        lblTexto = findViewById(R.id.lblTexto);
        Button btnActualizar = findViewById(R.id.btnActualizar);
        Button btnVolver = findViewById(R.id.btnVolver);

        btnActualizar.setOnClickListener(v -> lblTexto.setText("¡Texto actualizado correctamente!"));

        // Acción del botón Volver
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio1.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional: cierra esta actividad
        });
    }
}
