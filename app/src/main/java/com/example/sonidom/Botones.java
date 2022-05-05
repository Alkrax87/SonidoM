package com.example.sonidom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Botones extends AppCompatActivity {

    ImageButton btnPerro, btnGato, btnLeon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btnGato = findViewById(R.id.gato);
        btnPerro = findViewById(R.id.perro);
        btnLeon = findViewById(R.id.leon);
    }

    public void gato(View view) {
        MediaPlayer gato = MediaPlayer.create(this, R.raw.s1);
        gato.start();
        Toast.makeText(this, "Sonido de Gato", Toast.LENGTH_SHORT).show();
    }

    public void perro(View view) {
        MediaPlayer perro = MediaPlayer.create(this, R.raw.s2);
        perro.start();
        Toast.makeText(this, "Sonido de Perro", Toast.LENGTH_SHORT).show();
    }

    public void leon(View view) {
        MediaPlayer leon = MediaPlayer.create(this, R.raw.s4);
        leon.start();
        Toast.makeText(this, "Sonido de Perro", Toast.LENGTH_SHORT).show();
    }
}