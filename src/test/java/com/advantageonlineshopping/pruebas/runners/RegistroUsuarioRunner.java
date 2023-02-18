package com.advantageonlineshopping.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistroUsuario.feature",
        glue = "com.advantageonlineshopping.pruebas.stepdefinition",
        snippets = SnippetType.CAMELCASE)

public class RegistroUsuarioRunner {
}
