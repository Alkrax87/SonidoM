package com.example.sonidom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void genero1(View view) {
        Intent genero1 = new Intent(this,genero1.class);
        startActivity(genero1);
    }

    public void genero2(View view) {
        Intent genero2 = new Intent(this,genero2.class);
        startActivity(genero2);
    }

    public void genero3(View view) {
        Intent genero3 = new Intent(this,genero3.class);
        startActivity(genero3);
    }
}