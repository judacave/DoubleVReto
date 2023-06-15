package com.doublev.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;

public class AjustarSuperposicion implements Task {
    private final Target elementoSuperpuesto;

    public AjustarSuperposicion(Target elementoSuperpuesto) {
        this.elementoSuperpuesto = elementoSuperpuesto;
    }

    public static AjustarSuperposicion delElemento(Target elementoSuperpuesto) {
        return new AjustarSuperposicion(elementoSuperpuesto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].style.visibility='hidden'", elementoSuperpuesto);
    }
}