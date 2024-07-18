package org.nttdata.tasks.go_to;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.nttdata.interfaces.HomPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class GoTo {
    public static Performable openUrl(String url) {
        return Task.where("{0} ingresa a la página " + url,
                Open.url(url)
        );
    }
    public static Performable openForm() {
        return Task.where("{0} ingresa al formulario de registro de estudiantes",
                WaitUntil.the(HomPage.INPUT_FORM, isPresent()).forNoMoreThan(30).seconds(),
                Click.on(HomPage.INPUT_FORM),
                WaitUntil.the(HomPage.INPUT_PRACTICE_FORM, isPresent()).forNoMoreThan(30).seconds(),
                Click.on(HomPage.INPUT_PRACTICE_FORM)

        );
    }
}
