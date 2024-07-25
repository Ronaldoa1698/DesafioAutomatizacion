package org.nttdata.interfaces;

import net.serenitybdd.screenplay.targets.Target;


public class LoginUserPage {

    public static Target INPUT_USERNAME = Target.the("Campo de usuario")
            .locatedBy("//input[@name='username']");
    public static Target INPUT_PASSWORD = Target.the("Campo de contraseña")
            .locatedBy("//input[@name='password']");
    public static Target BUTTON_LOGIN = Target.the("Botón de login")
            .locatedBy("//button[@type='submit']");
}
