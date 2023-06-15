package com.doublev.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class VistaDesplegables extends PageObject {

    public static final Target BOGOTA = Target.the("Opcion Bogota")
            .located(By.cssSelector("li[data-cod='BOG']"));
    public static final Target CALI = Target.the("Opcion Cali")
            .located(By.cssSelector("ul[id='comboDestino'] li[data-cod='CLO']"));

    public static final Target BOTON_AGREGAR_ADULTO = Target.the("Opcion Cali")
            .located(By.xpath("/html[1]/body[1]/div[1]/main[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]"));

    public static final Target FECHA_IDA = Target.the("Opcion Cali")
            .located(By.cssSelector("body > div:nth-child(2) > main:nth-child(3) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)"));

    public static final Target DIA = Target.the("Opcion Cali")
            .located(By.xpath("(//div[contains(text(),'14')])[1]"));
}



