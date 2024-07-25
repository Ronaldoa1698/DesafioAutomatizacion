package step_definition;

import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.tasks.go_to.GoTo;
import org.nttdata.tasks.fill_out.LoginUserForm;
import org.openqa.selenium.By;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepDefinition {

    private static final Logger logger = Logger.getLogger(LoginStepDefinition.class.getName());

    @Dado("que {actor} ingresa a la pagina de login de OrangeHRM")
    public void queUsernameIngresaALaPaginaDeLoginDeOrangeHRM(Actor actor) {
        actor.wasAbleTo(
                GoTo.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        );
    }

    @Cuando("ingresa las credenciales,Usuario {string}, Contraseña {string}")
    public void ingresaLasCredencialesUsuarioContraseña(String username, String password) {
        theActorInTheSpotlight().attemptsTo(
                LoginUserForm.fillOutLogin(username, password)
        );
    }

    @Y("da clic en el botón de login")
    public void daClicEnElBotónDeLogin() {
        theActorInTheSpotlight().attemptsTo(
                LoginUserForm.fillOutClickButtonLogin()
        );
    }

    @Entonces("debería ser redirigido al dashboard principal")
    public void deberíaSerRedirigidoAlDashboardPrincipal() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(By.xpath("//h6[contains(@class, 'oxd-topbar-header-breadcrumb-module') and text()='Dashboard']"), isVisible()).forNoMoreThan(30).seconds()
        );
    }
}
