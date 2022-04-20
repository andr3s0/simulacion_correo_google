package com.clasesmoviles.correoelectronico_entregable2;

public class ListaElementos {

    public String color, nombreRemitente, asuntoCorreo, contenidoCorreo, horaCorreo, like;

    public ListaElementos(String color, String nombreRemitente, String asuntoCorreo, String contenidoCorreo, String horaCorreo, String like) {
        this.color = color;
        this.nombreRemitente = nombreRemitente;
        this.asuntoCorreo = asuntoCorreo;
        this.contenidoCorreo = contenidoCorreo;
        this.horaCorreo = horaCorreo;
        this.like = like;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getAsuntoCorreo() {
        return asuntoCorreo;
    }

    public void setAsuntoCorreo(String asuntoCorreo) {
        this.asuntoCorreo = asuntoCorreo;
    }

    public String getContenidoCorreo() {
        return contenidoCorreo;
    }

    public void setContenidoCorreo(String contenidoCorreo) {
        this.contenidoCorreo = contenidoCorreo;
    }

    public String getHoraCorreo() {
        return horaCorreo;
    }

    public void setHoraCorreo(String horaCorreo) {
        this.horaCorreo = horaCorreo;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
