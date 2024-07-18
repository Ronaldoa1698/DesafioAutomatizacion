package org.nttdata.tasks.fill_out;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.interfaces.RegistrationStudentPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrationStudentForm {

    public static Performable fillOutForm(String name, String lastName, String gender, String phoneNumber) {
        return Task.where("{0} ingresa sus datos obligatorio",
                    Enter.theValue(name).into(RegistrationStudentPage.INPUT_FIRST_NAME),
                    Enter.theValue(lastName).into(RegistrationStudentPage.INPUT_LAST_NAME),
                    Check.whether(gender.equals("Masculino")).andIfSo(
                            WaitUntil.the(RegistrationStudentPage.BUTTON_GENDER_MALE, isClickable()).forNoMoreThan(30).seconds(),
                            Click.on(RegistrationStudentPage.BUTTON_GENDER_MALE)
                    ),
                    Enter.theValue(phoneNumber).into(RegistrationStudentPage.INPUT_PHONE_NUMBER)
                );
    }
}
