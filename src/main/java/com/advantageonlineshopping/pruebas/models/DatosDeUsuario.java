package com.advantageonlineshopping.pruebas.models;

public class DatosDeUsuario {
    String usuario;
    String contrasena;
    String correo;
    String verCorreo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getVerCorreo() {
        return verCorreo;
    }

    public void setVerCorreo(String verCorreo) {
        this.verCorreo = verCorreo;
    }

    public DatosDeUsuario(String usuario, String contrasena, String correo, String verCorreo) {


        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.verCorreo = verCorreo;
    }
}
