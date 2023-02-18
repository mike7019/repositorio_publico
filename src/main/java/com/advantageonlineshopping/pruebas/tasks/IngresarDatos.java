package com.advantageonlineshopping.pruebas.tasks;


import com.advantageonlineshopping.pruebas.utils.DatosExcelListas;
import net.serenitybdd.screenplay.Actor;
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

    private static ArrayList<Map<String, String>> datos = new ArrayList<Map<String, String>>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            datos = DatosExcelListas.leerExcel("Datos.xlsx", "Ingresar");
            actor.attemptsTo(
                    Click.on(BTN_USUARIO),
                    Click.on(BTN_CREARUSUARIO),
                    Enter.theValue(datos.get(0).get("Usuario")).into(TXT_NOMBRE_USUARIO),
                    Enter.theValue(datos.get(0).get("Usuario")).into(TXT_EMAIL),
                    Enter.theValue(datos.get(0).get("Usuario")).into(TXT_CLAVE),
                    Enter.theValue(datos.get(0).get("Usuario")).into(TXT_CONFIRMAR_CLAVE),
                    Scroll.to(TXT_NOMBRE),
                    Scroll.to(TXT_DIRECCION),
                    Click.on(RDO_I_AGREE),
                    Click.on(BTN_REGISTRAR)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static IngresarDatos inicioSesion() {
        return instrumented(IngresarDatos.class);
    }
}
