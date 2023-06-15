package com.doublev.tasks;

import com.doublev.ui.PaginaInicial;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.doublev.ui.PaginaInicial.*;

import static com.doublev.ui.VistaDesplegables.*;

public class LlenarFormulario implements Task{
    PaginaInicial page = new PaginaInicial();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                WaitUntil.the(SELECTOR_ORIGEN, isClickable()).forNoMoreThan(10).seconds(),
//                page.ocultarElemento("all-inputs")
//                Hit.the(Keys.ENTER).into(CHILD_INPUT)
//                AjustarSuperposicion.delElemento(Target.the("elemento-superpuesto").located(By.cssSelector(".all-inputs"))),
//                WaitUntil.the(CHILD_INPUT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(VUELO),
                Click.on(CHILD_INPUT),
                Click.on(BOGOTA),
                Click.on(CALI),
//                Click.on(SELECTOR_PASAJEROS),
//                WaitUntil.the(BOTON_AGREGAR_ADULTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(FECHA_IDA)
//                Click.on(DIA)
        );
    }
    public static LlenarFormulario llenarFormulario(){
        return new LlenarFormulario();
    }


}
