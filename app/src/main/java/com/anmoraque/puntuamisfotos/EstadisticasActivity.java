package com.anmoraque.puntuamisfotos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.anmoraque.puntuamisfotos.util.GestionPreferencias;

public class EstadisticasActivity extends AppCompatActivity {
    int foto1 = 0;
    int foto2 = 0;
    int foto3 = 0;
    int foto4 = 0;
    int foto5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

        TextView media1 = findViewById(R.id.media1);
        TextView media2 = findViewById(R.id.media2);
        TextView media3 = findViewById(R.id.media3);
        TextView media4 = findViewById(R.id.media4);
        TextView media5 = findViewById(R.id.media5);

        foto1 = GestionPreferencias.leerPreferenciaFoto(this, 0+"");
        foto2 = GestionPreferencias.leerPreferenciaFoto(this, 1+"");
        foto3 = GestionPreferencias.leerPreferenciaFoto(this, 2+"");
        foto4 = GestionPreferencias.leerPreferenciaFoto(this, 3+"");
        foto5 = GestionPreferencias.leerPreferenciaFoto(this, 4+"");

        media1.setText(foto1+"");
        media2.setText(foto2+"");
        media3.setText(foto3+"");
        media4.setText(foto4+"");
        media5.setText(foto5+"");





    }
}