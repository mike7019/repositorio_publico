package com.advantageonlineshopping.pruebas.models;

public class DatosDeUsuario {
    String usuario;
    String correo;
    String contrasena;
    String verContrasena;

    public DatosDeUsuario(String usuario, String correo, String contrasena, String verContrasena) {
        this.usuario = usuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.verContrasena = verContrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getVerContrasena() {
        return verContrasena;
    }

    public void setVerContrasena(String verContrasena) {
        this.verContrasena = verContrasena;
    }
}
