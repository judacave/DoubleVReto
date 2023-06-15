package com.doublev.stepdefinitions;

import com.doublev.setup.Configuracion;
import com.doublev.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.doublev.tasks.LlenarFormulario.llenarFormulario;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusquedaVueloStepDefinitions extends Configuracion {

    public static Logger LOGGER = Logger.getLogger(BusquedaVueloStepDefinitions.class);
    @Given("Given que estoy en la pagina de wingo")
    public void givenQueEstoyEnLaPaginaDeWingo() {
        try {
            configurarNavegador();
            LOGGER.info("Inicio de la Automatizacion");
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("he completado el formulario de busqueda")
    public void heCompletadoElFormularioDeBusqueda() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    llenarFormulario()
            );

        }catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("he clickeado el boton de busqueda")
    public void heClickeadoElBotonDeBusqueda() {

    }

    @Then("se muestran los vuelos disponibles")
    public void seMuestranLosVuelosDisponibles() {

    }

}
