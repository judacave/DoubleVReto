package com.doublev.tasks;

import com.doublev.ui.PaginaInicial;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import com.doublev.util.*;
import org.sikuli.script.FindFailed;

import static com.doublev.ui.PaginaInicial.*;

import static com.doublev.ui.VistaDesplegables.*;


public class LlenarFormulario implements Task{
    PaginaInicial page = new PaginaInicial();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VUELO),
                Click.on(CHILD_INPUT),
                Click.on(BOGOTA),
                Click.on(CALI),
                Click.on(FECHA_IDA),
                Click.on(MONTHPRUEBA),
                Click.on(MONTH2),
                Click.on(SELECTOR_PASAJEROS)
        );
        try {
            Sikuli.click("PLUS.png");
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
    }
    public static LlenarFormulario llenarFormulario(){
        return new LlenarFormulario();
    }


}
