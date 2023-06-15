package com.doublev.util;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {
    public static void click(String imagen) throws FindFailed {
        Screen screen = new Screen();
        Pattern pattern = new Pattern(imagen);
        screen.wait(pattern, 30000);
        screen.click(pattern);
    }

    public static void typeInto(String imagen, String texto) throws FindFailed {
        Screen screen = new Screen();
        Pattern pattern = new Pattern(imagen);
        screen.wait(pattern, 30);
        screen.click(pattern);
        screen.type(texto);
    }
}
