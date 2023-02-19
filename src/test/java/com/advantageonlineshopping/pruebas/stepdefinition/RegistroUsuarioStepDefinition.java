package com.advantageonlineshopping.pruebas.stepdefinition;

import com.advantageonlineshopping.pruebas.drivers.DriverManager;
import com.advantageonlineshopping.pruebas.models.DatosDeUsuario;
import com.advantageonlineshopping.pruebas.questions.EsElUsuarioCorrecto;
import com.advantageonlineshopping.pruebas.tasks.IngresarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.advantageonlineshopping.pruebas.utils.Enlaces.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;


public class RegistroUsuarioStepDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^Que Julio se encuentro en el sitio web$")
    public void queJulioSeEncuentroEnElSitioWeb() {
        DriverManager.withChromeOptions();
        OnStage.theActorCalled("julio").can(BrowseTheWeb.with(DriverManager.on(URL)));
    }
    @Cuando("^llena sus datos$")
    public void llenaSusDatos(List<DatosDeUsuario> datosDeUsuarioList) {
        System.out.println(datosDeUsuarioList.get(0).getUsuario());
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarDatos.inicioSesion()
                        .conUsuario(datosDeUsuarioList.get(0).getUsuario())
                        .yCorreo(datosDeUsuarioList.get(0).getCorreo())
                        .yContrasena(datosDeUsuarioList.get(0).getContrasena())
                        .yVerContrasena(datosDeUsuarioList.get(0).getVerContrasena())
        );
    }

    @Entonces("^valida el (.*) en pantalla$")
    public void validaElNombreDeUsuarioEnPantalla(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(EsElUsuarioCorrecto.value(), containsString(text)));
    }

}







//    @Dado("^que estoy en la pagina Advantage$")
//    public void queEstoyEnLaPaginaAdvantage() {
//        OnStage.theActorCalled("").wasAbleTo(Open.browserOn(advantageHomeUI));
//    }
//
//    @Cuando("^lleno todos mis datos$")
//    public void llenoTodosMisDatos() {
//        actor.attemptsTo(IngresarDatos.inicioSesion());
//    }
//
//    @Entonces("^valido estar logueado$")
//    public void validoEstarLogueado() {
//
//    }
