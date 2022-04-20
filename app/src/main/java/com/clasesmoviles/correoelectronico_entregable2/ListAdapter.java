package com.clasesmoviles.correoelectronico_entregable2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    private Context myContext;
    private String[] nombreRemitente, asuntoCorreo, contenidoCorreo, horaCorreo;
    private int [] iconoImagen;
    private LayoutInflater inflater;

    public ListAdapter(Context myContext, String[] nombreRemitente, String[] asuntoCorreo, String[] contenidoCorreo, String[] horaCorreo, int[] iconoImagen) {
        this.myContext = myContext;
        this.nombreRemitente = nombreRemitente;
        this.asuntoCorreo = asuntoCorreo;
        this.contenidoCorreo = contenidoCorreo;
        this.horaCorreo = horaCorreo;
        this.iconoImagen = iconoImagen;
        inflater = LayoutInflater.from(myContext);
    }

    @Override
    public int getCount() {
        return nombreRemitente.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_element, null);

        TextView nombreRemitentes = view.findViewById(R.id.nombre_remitente);
        TextView asuntoCorreos = view.findViewById(R.id.asunto_correo);
        TextView contenidoDelosCorreos = view.findViewById(R.id.contenido_correo);
        TextView horaCorreos = view.findViewById(R.id.hora_correo);
        ImageView iconoDeImagenes = view.findViewById(R.id.icono_imageView);

        nombreRemitentes.setText(nombreRemitente[i]);
        asuntoCorreos.setText(asuntoCorreo[i]);
        contenidoDelosCorreos.setText(contenidoCorreo[i]);
        horaCorreos.setText(horaCorreo[i]);
        iconoDeImagenes.setImageResource(iconoImagen[i]);

        return view;
    }
}
