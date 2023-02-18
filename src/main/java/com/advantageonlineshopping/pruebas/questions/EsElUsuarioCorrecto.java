package com.advantageonlineshopping.pruebas.questions;

import com.advantageonlineshopping.pruebas.userinterfaces.AdvantageHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class EsElUsuarioCorrecto implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return AdvantageHomeUI.TXT_VALIDAR.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new EsElUsuarioCorrecto();
    }


}
