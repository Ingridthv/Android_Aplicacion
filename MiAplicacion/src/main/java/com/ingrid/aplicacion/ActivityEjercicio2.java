package com.ingrid.aplicacion;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio2 extends AppCompatActivity {

    RelativeLayout layoutPrincipal;
    Button btnColor, btnVolver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        layoutPrincipal = findViewById(R.id.layoutPrincipal);
        btnColor = findViewById(R.id.btnColor);
        btnVolver2 = findViewById(R.id.btnVolver2);

        btnColor.setOnClickListener(view ->
                layoutPrincipal.setBackgroundColor(Color.CYAN)
        );

        btnVolver2.setOnClickListener(view -> finish()); // Regresar al menú
    }
}