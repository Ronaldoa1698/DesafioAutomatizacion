package step_definition;

import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import net.thucydides.model.util.EnvironmentVariables;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import org.nttdata.tasks.fill_out.RegistrationStudentForm;
import org.nttdata.tasks.go_to.GoTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CustomerRegistrationStepDefinition {
    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
    @Dado("que {actor} ingresa a la pagina de demo qa")
    public void queIngresaALaPaginaDeDemoQa(Actor actor) {
        String url = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("urls.demoqa");
        actor.wasAbleTo(
                GoTo.openUrl("https://demoqa.com/")
        );
    }

    @E("ingresa al formulario de registro de estudiantes")
    public void ingresaAlFormularioDeRegistroDeEstudiantes() {
        theActorInTheSpotlight().attemptsTo(
                GoTo.openForm()
        );
    }

    @Cuando("ingresa sus datos obligatorio, Nombre {string}, Apellido {string}, Genero {string}, Celular {string}")
    public void ingresaSusDatosObligatorioNombreApellidoGeneroCelular(String name, String lastName, String gender, String phoneNumber) {
        theActorInTheSpotlight().attemptsTo(
                RegistrationStudentForm.fillOutForm(name, lastName, gender, phoneNumber)
        );
    }

    @Entonces("se debería validar que el registro fue exitoso")
    public void seDeberíaValidarQueElRegistroFueExitoso() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(By.xpath("//div[@id='example-modal-sizes-title-lg']"), isVisible()).forNoMoreThan(30).seconds()
        );
    }

    @Y("da clic en el botón de enviar")
    public void daClicEnElBotónDeEnviar() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(By.xpath("//button[@id='submit']"))
        );
    }
}
