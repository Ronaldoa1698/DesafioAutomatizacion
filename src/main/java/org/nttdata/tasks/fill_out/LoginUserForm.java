package org.nttdata.tasks.fill_out;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nttdata.interfaces.LoginUserPage;

public class LoginUserForm {

    public static Performable fillOutLogin(String username, String password) {
        return Task.where("{0} ingresa sus credenciales",
                Enter.theValue(username).into(LoginUserPage.INPUT_USERNAME),
                Enter.theValue(password).into(LoginUserPage.INPUT_PASSWORD)
        );
    }

    public static Performable fillOutClickButtonLogin() {
        return Task.where("{0} da clic en el botón de login",
                Click.on(LoginUserPage.BUTTON_LOGIN)
        );
    }
}
