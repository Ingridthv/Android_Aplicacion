package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio10 extends AppCompatActivity {

    NumberPicker numberPicker;
    TextView tvValor;
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);

        numberPicker = findViewById(R.id.numberPicker);
        tvValor = findViewById(R.id.tvValor);
        btnVolver = findViewById(R.id.btnVolver);

        // Configurar valores del NumberPicker
        String[] displayedValues = new String[]{"0", "2", "4", "6", "8", "10"};
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(displayedValues.length - 1);
        numberPicker.setDisplayedValues(displayedValues);
        numberPicker.setValue(2); // Valor inicial correspondiente a "4"
        tvValor.setText("El valor es: 4");

        numberPicker.setOnValueChangedListener((picker, oldVal, newVal) -> {
            String valStr = displayedValues[newVal];
            tvValor.setText("El valor es: " + valStr);
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio10.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
