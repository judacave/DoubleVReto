package com.doublev.ui;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class PaginaInicial extends PageObject {

    public static final Target VUELO = Target.the("Apartado Vuelo")
            .located(By.cssSelector(".cont-search.cont-search-ibe"));

    public static final Target CHILD_INPUT = Target.the("Selector hijo")
            .located(By.cssSelector(".styledSelect.styledSelectOrigen"));

    public static final Target SELECTOR_PASAJEROS = Target.the("Selector Pasajeros")
            .located(By.cssSelector(".info-airport.info-airport-ibe-pasajeros"));

    public static final Target BOTON_BUSCAR = Target.the("Boton de busqueda")
            .located(By.cssSelector(".btn-search.bt-search"));

    public static final Target MENSAJE_FINAL = Target.the("Mensaje Final")
            .located(By.cssSelector(".d400e78e4a.c8305f6688"));

}
