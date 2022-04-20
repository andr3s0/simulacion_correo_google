package com.clasesmoviles.correoelectronico_entregable2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaPantalla extends AppCompatActivity {

    String mensaje, asunto, nombre;
    int imagen;
    TextView asuntoVista, nombreRemitente, mensajeRemitente;
    ImageView imagenCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        imagen = getIntent().getIntExtra("imagenCorreo",1);
        mensaje = getIntent().getStringExtra("contenido");
        asunto = getIntent().getStringExtra("asuntoCorreo");
        nombre = getIntent().getStringExtra("nombreRemitente");

        asuntoVista = findViewById(R.id.asunto);
        mensajeRemitente = findViewById(R.id.contenido);
        nombreRemitente = findViewById(R.id.remitente);
        imagenCorreo = findViewById(R.id.icono_imageView2);

        asuntoVista.setText(asunto);
        nombreRemitente.setText(nombre);
        mensajeRemitente.setText(mensaje);
        imagenCorreo.setImageResource(imagen);
    }
}