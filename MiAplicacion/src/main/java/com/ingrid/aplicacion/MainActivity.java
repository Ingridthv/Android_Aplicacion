package com.ingrid.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEjercicio1, btnEjercicio2, btnEjercicio3, btnEjercicio4, btnEjercicio5,
            btnEjercicio6, btnEjercicio7, btnEjercicio8, btnEjercicio9, btnEjercicio10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjercicio1 = findViewById(R.id.btnEjercicio1);
        btnEjercicio2 = findViewById(R.id.btnEjercicio2);
        btnEjercicio3 = findViewById(R.id.btnEjercicio3);
        btnEjercicio4 = findViewById(R.id.btnEjercicio4);
        btnEjercicio5 = findViewById(R.id.btnEjercicio5);
        btnEjercicio6 = findViewById(R.id.btnEjercicio6);
        btnEjercicio7 = findViewById(R.id.btnEjercicio7);
        btnEjercicio8 = findViewById(R.id.btnEjercicio8);
        btnEjercicio9 = findViewById(R.id.btnEjercicio9);
        btnEjercicio10 = findViewById(R.id.btnEjercicio10);

        btnEjercicio1.setOnClickListener(this);
        btnEjercicio2.setOnClickListener(this);
        btnEjercicio3.setOnClickListener(this);
        btnEjercicio4.setOnClickListener(this);
        btnEjercicio5.setOnClickListener(this);
        btnEjercicio6.setOnClickListener(this);
        btnEjercicio7.setOnClickListener(this);
        btnEjercicio8.setOnClickListener(this);
        btnEjercicio9.setOnClickListener(this);
        btnEjercicio10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        int id = v.getId();

        if (id == R.id.btnEjercicio1) intent = new Intent(this, ActivityEjercicio1.class);
        else if (id == R.id.btnEjercicio2) intent = new Intent(this, ActivityEjercicio2.class);
        else if (id == R.id.btnEjercicio3) intent = new Intent(this, ActivityEjercicio3.class);
        else if (id == R.id.btnEjercicio4) intent = new Intent(this, ActivityEjercicio4.class);
        else if (id == R.id.btnEjercicio5) intent = new Intent(this, ActivityEjercicio5.class);
        else if (id == R.id.btnEjercicio6) intent = new Intent(this, ActivityEjercicio6.class);
        else if (id == R.id.btnEjercicio7) intent = new Intent(this, ActivityEjercicio7.class);
        else if (id == R.id.btnEjercicio8) intent = new Intent(this, ActivityEjercicio8.class);
        else if (id == R.id.btnEjercicio9) intent = new Intent(this, ActivityEjercicio9.class);
        else if (id == R.id.btnEjercicio10) intent = new Intent(this, ActivityEjercicio10.class);

        if (intent != null) startActivity(intent);
    }
}
