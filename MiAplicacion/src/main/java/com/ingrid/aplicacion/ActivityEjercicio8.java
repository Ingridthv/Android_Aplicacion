package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio8 extends AppCompatActivity {

    private SeekBar sldVolumen;
    private TextView lblMensaje;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);

        sldVolumen = findViewById(R.id.sldVolumen);
        lblMensaje = findViewById(R.id.lblMensaje);
        btnVolver = findViewById(R.id.btnVolver);

        sldVolumen.setMax(100);
        sldVolumen.setProgress(50);
        lblMensaje.setText("Volumen: 50%");

        sldVolumen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0) {
                    lblMensaje.setText("Volumen: silencio");
                } else {
                    lblMensaje.setText("Volumen: " + progress + "%");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio8.this, MainActivity.class);
            startActivity(intent);
            finish(); // opcional
        });
    }
}
