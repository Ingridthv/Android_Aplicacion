package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEjercicio9 extends AppCompatActivity {

    private EditText txtPrecioBase;
    private ToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;
    private TextView lblPrecioInstalacion, lblPrecioFormacion, lblPrecioAlimentacionBD, lblTotal;
    private Button btnCalcular, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        txtPrecioBase = findViewById(R.id.txtPrecioBase);
        tbtnInstalacion = findViewById(R.id.tbtnInstalacion);
        tbtnFormacion = findViewById(R.id.tbtnFormacion);
        tbtnAlimentacionBD = findViewById(R.id.tbtnAlimentacionBD);

        lblPrecioInstalacion = findViewById(R.id.lblPrecioInstalacion);
        lblPrecioFormacion = findViewById(R.id.lblPrecioFormacion);
        lblPrecioAlimentacionBD = findViewById(R.id.lblPrecioAlimentacionBD);
        lblTotal = findViewById(R.id.lblTotal);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnVolver = findViewById(R.id.btnVolver);

        lblPrecioInstalacion.setText("40");
        lblPrecioFormacion.setText("200");
        lblPrecioAlimentacionBD.setText("200");

        tbtnInstalacion.setChecked(true);

        btnCalcular.setOnClickListener(v -> {
            String precioBaseStr = txtPrecioBase.getText().toString().trim();

            if (TextUtils.isEmpty(precioBaseStr)) {
                Toast.makeText(this, "Introduce el precio base", Toast.LENGTH_SHORT).show();
                return;
            }

            double precioBase;
            try {
                precioBase = Double.parseDouble(precioBaseStr);
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Precio base inválido", Toast.LENGTH_SHORT).show();
                return;
            }

            double precioInstalacion = Double.parseDouble(lblPrecioInstalacion.getText().toString());
            double precioFormacion = Double.parseDouble(lblPrecioFormacion.getText().toString());
            double precioAlimentacionBD = Double.parseDouble(lblPrecioAlimentacionBD.getText().toString());

            double total = precioBase;

            if (tbtnInstalacion.isChecked()) total += precioInstalacion;
            if (tbtnFormacion.isChecked()) total += precioFormacion;
            if (tbtnAlimentacionBD.isChecked()) total += precioAlimentacionBD;

            lblTotal.setText(String.format("Total: %.2f $", total));
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityEjercicio9.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
