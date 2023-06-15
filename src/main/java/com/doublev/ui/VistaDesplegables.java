package com.doublev.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;

public class VistaDesplegables extends PageObject {

    public static final Target BOGOTA = Target.the("Opcion Bogota")
            .located(By.cssSelector("li[data-cod='BOG']"));
    public static final Target CALI = Target.the("Opcion Cali")
            .located(By.cssSelector("ul[id='comboDestino'] li[data-cod='CLO']"));
    public static final Target FECHA_IDA = Target.the("Opcion Cali")
            .located(By.cssSelector("body > div:nth-child(2) > main:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)"));

    public static final Target MONTH = Target.the("Month 1")
            .located(By.xpath("(//table[contains(@class,'month1')])[1]"));

    public static final Target MONTHPRUEBA = Target.the("Month 1")
            .located(By.cssSelector("body > div:nth-child(2) > main:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1)"));

    public static final Target MONTH2 = Target.the("Month 1")
            .located(By.xpath("(//table[contains(@class,'month2')])[2]"));

    public static final Target AGREGAR_PASAJERO = Target.the("Agregar Pasajero")
            .located(By.xpath("(//*[@class='passenger'][1]/descendant::div[4]"));


    //*[@class='day toMonth  valid' and text() ='14']
}



