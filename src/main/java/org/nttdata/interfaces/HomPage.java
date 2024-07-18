package org.nttdata.interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomPage {
    public static Target INPUT_FORM= Target.the("Botón de formulario")
            .located(By.xpath("//h5[contains(text(),'Forms')]"));
    public static Target INPUT_PRACTICE_FORM= Target.the("Botón de formulario de práctica")
            .located(By.xpath("//span[contains(text(),'Practice Form')]"));
}
