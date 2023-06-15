package com.doublev.tasks;

import com.doublev.ui.PaginaInicial;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.doublev.util.Sikuli;
import org.sikuli.script.FindFailed;

import static com.doublev.ui.PaginaInicial.*;

import static com.doublev.ui.VistaDesplegables.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

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
        actor.attemptsTo(
                Click.on(BOTON_BUSCAR)
        );
    }
    public static LlenarFormulario llenarFormulario(){
        return new LlenarFormulario();
    }


}
