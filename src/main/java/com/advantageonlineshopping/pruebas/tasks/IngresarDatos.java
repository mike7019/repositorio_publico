package com.advantageonlineshopping.pruebas.tasks;


import com.advantageonlineshopping.pruebas.utils.DatosExcelListas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static com.advantageonlineshopping.pruebas.userinterfaces.AdvantageHomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatos implements Task {
     String usuario;
     String contrasena;
     String correo;
     String verCorreo;

    public IngresarDatos(String usuario, String contrasena, String correo, String verCorreo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.verCorreo = verCorreo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(BTN_USUARIO),
                    Click.on(BTN_CREARUSUARIO),
                    Enter.theValue(usuario).into(TXT_NOMBRE_USUARIO),
                    Enter.theValue(contrasena).into(TXT_EMAIL),
                    Enter.theValue(correo).into(TXT_CLAVE),
                    Enter.theValue(verCorreo).into(TXT_CONFIRMAR_CLAVE),
                    Scroll.to(TXT_NOMBRE),
                    Scroll.to(TXT_DIRECCION),
                    Click.on(RDO_I_AGREE),
                    Click.on(BTN_REGISTRAR)
            );
    }
    public static IngresarDatos inicioSesion() {
        return instrumented(IngresarDatos.class);
    }

    public IngresarDatos conUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }


    public IngresarDatos yContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    public IngresarDatos yCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public IngresarDatos yVerCorreo(String verCorreo) {
        this.verCorreo = verCorreo;
        return this;
    }
}
