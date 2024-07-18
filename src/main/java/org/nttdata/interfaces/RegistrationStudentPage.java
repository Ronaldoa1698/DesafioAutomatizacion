package org.nttdata.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationStudentPage {

    public static Target INPUT_FIRST_NAME = Target.the("Campo de nombre")
            .locatedBy("//input[@id='firstName']");
    public static Target INPUT_LAST_NAME = Target.the("Campo de apellido")
            .locatedBy("//input[@id='lastName']");
    public static Target INPUT_EMAIL = Target.the("Campo de correo")
            .locatedBy("//input[@id='userEmail']");
    public static Target BUTTON_GENDER_MALE = Target.the("Botón de género masculino")
            .locatedBy("//label[contains(text(),'Male')]");

    public static Target INPUT_PHONE_NUMBER = Target.the("Campo de número de teléfono")
            .locatedBy("//input[@id='userNumber']");
}
