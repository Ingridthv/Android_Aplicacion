package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio4 extends AppCompatActivity {

    private RadioGroup groupPagos;
    private RadioButton rbtnEfectivo, rbtnTarjeta, rbtnTransferencia;
    private Button btnConfirmar, btnVolver;
    private TextView lblSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        groupPagos = findViewById(R.id.groupPagos);
        rbtnEfectivo = findViewById(R.id.rbtnEfectivo);
        rbtnTarjeta = findViewById(R.id.rbtnTarjeta);
        rbtnTransferencia = findViewById(R.id.rbtnTransferencia);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        lblSeleccion = findViewById(R.id.lblSeleccion);
        btnVolver = findViewById(R.id.btnVolver);

        btnConfirmar.setOnClickListener(v -> {
            int selectedId = groupPagos.getCheckedRadioButtonId();
            if (selectedId == R.id.rbtnEfectivo) {
                lblSeleccion.setText("Seleccionaste: Efectivo");
            } else if (selectedId == R.id.rbtnTarjeta) {
                lblSeleccion.setText("Seleccionaste: Tarjeta");
            } else if (selectedId == R.id.rbtnTransferencia) {
                lblSeleccion.setText("Seleccionaste: Transferencia");
            } else {
                lblSeleccion.setText("No se seleccionó ningún método de pago");
            }
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio4.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional para cerrar esta pantalla
        });
    }
}
