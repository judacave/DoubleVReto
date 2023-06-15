package com.doublev.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features"},
        glue = {"com.doublev.stepdefinitions"}
)
public class FlujoBusquedaTest {
    public void getHi(){
        System.out.println("Hi");
    }
}
