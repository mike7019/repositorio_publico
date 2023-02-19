package com.advantageonlineshopping.pruebas.tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.advantageonlineshopping.pruebas.userinterfaces.AdvantageHomeUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarDatos implements Task {
    private String usuario;

    private String correo;
    private String contrasena;
    private String verContrasena;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_USUARIO, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_USUARIO),
                WaitUntil.the(BTN_CREARUSUARIO, isEnabled()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_CREARUSUARIO),
                Enter.theValue(usuario).into(TXT_NOMBRE_USUARIO),
                Enter.theValue(correo).into(TXT_EMAIL),
                Enter.theValue(contrasena).into(TXT_CLAVE),
                Enter.theValue(verContrasena).into(TXT_CONFIRMAR_CLAVE),
                Scroll.to(TXT_NOMBRE),
                Scroll.to(TXT_DIRECCION),
                Click.on(RDO_I_AGREE),
                Click.on(BTN_REGISTRAR)
        );
    }

    public static IngresarDatos inicioSesion() {
        return Instrumented.instanceOf(IngresarDatos.class).withProperties();
    }

    public IngresarDatos conUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public IngresarDatos yCorreo(String correo) {
        this.correo = correo;
        return this;
    }


    public IngresarDatos yContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }



    public IngresarDatos yVerContrasena(String verContrasena) {
        this.verContrasena = verContrasena;
        return this;
    }
}
