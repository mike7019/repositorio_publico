package com.advantageonlineshopping.pruebas.stepdefinition;

import com.advantageonlineshopping.pruebas.tasks.IngresarDatos;
import com.advantageonlineshopping.pruebas.userinterfaces.AdvantageHomeUI;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegistroUsuarioStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Jota");

    private AdvantageHomeUI advantageHomeUI = new AdvantageHomeUI();

    @Before
    public void configuracion() {
        actor.can(BrowseTheWeb.with(navegador));
    }
    @Dado("^que estoy en la pagina Advantage$")
    public void queEstoyEnLaPaginaAdvantage() {
        actor.wasAbleTo(Open.browserOn(advantageHomeUI));
    }

    @Cuando("^lleno todos mis datos$")
    public void llenoTodosMisDatos() {
        actor.attemptsTo(IngresarDatos.inicioSesion());
    }

    @Entonces("^valido estar logueado$")
    public void validoEstarLogueado() {

    }

}
