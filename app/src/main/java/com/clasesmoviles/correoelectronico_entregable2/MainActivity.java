package com.clasesmoviles.correoelectronico_entregable2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListView lista;

    String contenidoCorreo1, contenidoCorreo2, contenidoCorreo3, contenidoCorreo4, contenidoCorreo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        contenidoCorreo1 = "Cada uno de nosotros es una preciosidad, en una perspectiva cósmica. " +
                "Si alguien discrepa de tus opiniones, déjalo vivir. En un trillón de galaxias, no hallarías otro igual";
        contenidoCorreo2 = "Pasamos el primer año de la vida de un niño enseñándole a caminar y a escribir, y el resto de su vida a guardar silencio y sentarse, algo no funciona bien";
        contenidoCorreo3 = "No deberías hacer las cosas de manera diferente solamente para que sean distintas. Necesitan ser mejores";
        contenidoCorreo4 = "Vivir en el mundo sin percatarse del significado del mismo, es como deambular por una gran biblioteca sin tocar sus libros";
        contenidoCorreo5 = "El mundo tiene dos tipos de personas, y cuando ocurre algo afortunado, los del primer grupo lo consideran mas que suerte, más que casualidad, lo consideran una señal. " +
                "Una prueba de que hay alguien ahí arriba cuidando del ser humano. La otra gente lo considera pura suerte, un feliz giro del azar.";

        int[] imagenCorreo = {
                R.mipmap.imagen_02_round,
                R.mipmap.imagen_01_round,
                R.mipmap.imagen_04_round,
                R.mipmap.imagen_03_round,
                R.mipmap.imagen_05_round
        };

        String[] nombreRemitentes = {
                "Carl Sagan",
                "Neil deGrasse Tyson",
                "Elon Musk",
                "Dan Brown",
                "Graham Hess"
        };
        String[] asuntoCorreo = {
                "Los grandes pensamientos",
                "Aportaciones de Neil deGrasse",
                "Inspiracion de Elon Musk",
                "El símbolo perdido",
                "Señales(película)",
        };
        String[] contenido = {
                contenidoCorreo1,
                contenidoCorreo2,
                contenidoCorreo3,
                contenidoCorreo4,
                contenidoCorreo5
        };

        String[] horaCorreo = {
                "10:00am",
                "9:30am",
                "11:30am",
                "11:30am",
                "8:30pm"
        };


        ListAdapter listAdapter = new ListAdapter(MainActivity.this, nombreRemitentes, asuntoCorreo, contenido, horaCorreo, imagenCorreo);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(listAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                Intent irSegundaPantalla = new Intent(MainActivity.this, SegundaPantalla.class);
                irSegundaPantalla.putExtra("nombreRemitente", nombreRemitentes[posicion]);
                irSegundaPantalla.putExtra("asuntoCorreo", asuntoCorreo[posicion]);
                irSegundaPantalla.putExtra("contenido", contenido[posicion]);
                irSegundaPantalla.putExtra("imagenCorreo",imagenCorreo[posicion]);
                startActivity(irSegundaPantalla);
            }
        });
    }
}