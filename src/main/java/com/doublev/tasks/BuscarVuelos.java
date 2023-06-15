package com.doublev.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.doublev.ui.PaginaInicial.BOTON_BUSCAR;


public class BuscarVuelos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_BUSCAR)
        );
    }
    public static BuscarVuelos buscarVuelos(){
        return new BuscarVuelos();
    }


}
