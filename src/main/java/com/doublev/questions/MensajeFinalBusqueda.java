package com.doublev.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.doublev.ui.PaginaInicial.MENSAJE_FINAL;

public class MensajeFinalBusqueda implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_FINAL.resolveFor(actor).getText();
    }

    public static MensajeFinalBusqueda mensajeFinalBusqueda(){
        return new MensajeFinalBusqueda();
    }
}
