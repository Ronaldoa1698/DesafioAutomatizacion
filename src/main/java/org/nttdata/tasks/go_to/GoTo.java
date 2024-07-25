package org.nttdata.tasks.go_to;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class GoTo {
    public static Performable openUrl(String url) {
        return Task.where("{0} ingresa a la página " + url,
                Open.url(url)
        );
    }
}
