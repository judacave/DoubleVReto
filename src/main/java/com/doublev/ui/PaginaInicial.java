package com.doublev.ui;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class PaginaInicial extends PageObject {


    public static final Target SELECTOR_ORIGEN = Target.the("Boton ir a mi cuenta")
            .located(By.xpath("//div[@class='input input-origen cont-ext-2']"));

    public static final Target PARENT_DIV = Target.the("Div padre")
            .located(By.className("div.all-inputs"));

    public static final Target VUELO = Target.the("Apartado Vuelo")
            .located(By.cssSelector(".cont-search.cont-search-ibe"));

    public static final Target CHILD_INPUT = Target.the("Selector hijo")
            .located(By.cssSelector(".styledSelect.styledSelectOrigen"));

    public static final Target SELECTOR_PASAJEROS = Target.the("Selector Pasajeros")
            .located(By.cssSelector(".info-airport.info-airport-ibe-pasajeros"));
    public static final Target CAMPO_BUSQUEDA = Target.the("Campo busqueda")
            .located(By.cssSelector("input[placeholder='Buscar en exito.com']"));

    public static final Target BOTON_BUSQUEDA = Target.the("Boton Busqueda")
            .located(By.cssSelector(".vtex-store-components-3-x-searchBarIcon.vtex-store-components-3-x-searchBarIcon--search.flex.items-center.pointer.bn.bg-transparent.outline-0.pv0.pl0.pr3"));

    public static final Target BOTON_UBICACION = Target.the("Sellecionar ubicacion")
            .located(By.cssSelector(".exito-geolocation-3-x-addressResult"));

    public static final Target BOTON_CARRITO = Target.the("Carrito de compras")
            .located(By.cssSelector(".exito-header-3-x-minicartContainer"));


    public Performable ocultarElemento(String nombreClase) {
        WebElement elemento = $(By.className(nombreClase));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].style.display='none'", elemento);
        return null;
    }
}
