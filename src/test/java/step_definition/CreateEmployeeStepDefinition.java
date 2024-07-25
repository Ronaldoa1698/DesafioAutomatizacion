package step_definition;

import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.interfaces.CreateEmployeePage;
import org.nttdata.tasks.fill_out.LoginUserForm;
import org.nttdata.tasks.go_to.GoTo;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CreateEmployeeStepDefinition {
    @Dado("que el Administrador esta logueado en OrangeHRM")
    public void queElAdministradorEstaLogueadoEnOrangeHRM() {
        Actor admin = theActorInTheSpotlight();

        admin.attemptsTo(
                GoTo.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        );
        theActorInTheSpotlight().attemptsTo(
                LoginUserForm.fillOutLogin("Admin", "admin123"),
                LoginUserForm.fillOutClickButtonLogin()
        );
    }

    @Y("hace click en el boton de admin")
    public void haceClickEnElBotonDeAdmin() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.BUTTON_ADMIN, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.BUTTON_ADMIN)
        );
    }

    @Y("hace click en agregar empleado")
    public void haceClickEnAgregarEmpleado() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.BUTTON_ADD_EMPLOYEE, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.BUTTON_ADD_EMPLOYEE)
        );
    }

    @Cuando("completa los datos obligatorios, Roles {string}, Employee Name {string}, Username {string}, Status {string}, Password {string}, Confirm Password {string}")
    public void completaLosDatosObligatoriosRolesEmployeeNameUsernameStatusPasswordConfirmPassword(String roles, String employeeName, String username, String status, String password, String confirmPassword) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CreateEmployeePage.SELECT_USER_ROLE),
                WaitUntil.the(CreateEmployeePage.SELECT_USER_ROLE_OPTION.of(roles), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.SELECT_USER_ROLE_OPTION.of(roles)),

                Enter.theValue(employeeName).into(CreateEmployeePage.INPUT_EMPLOYEE_NAME),
                WaitUntil.the(CreateEmployeePage.FIRST_EMPLOYEE_NAME_OPTION, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.FIRST_EMPLOYEE_NAME_OPTION),

                Enter.theValue(username).into(CreateEmployeePage.INPUT_USERNAME),

                Click.on(CreateEmployeePage.SELECT_STATUS),
                WaitUntil.the(CreateEmployeePage.SELECT_STATUS_OPTION.of(status), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.SELECT_STATUS_OPTION.of(status)),

                Enter.theValue(password).into(CreateEmployeePage.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(CreateEmployeePage.INPUT_CONFIRM_PASSWORD)
        );
    }

    @Y("da clic en el boton de guardar")
    public void daClicEnElBotonDeGuardar() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CreateEmployeePage.BUTTON_SAVE)
        );
    }


    @Entonces("debería ser redirigido a la pagina de admin")
    public void deberíaSerRedirigidoALaPaginaDeAdmin() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.ADMIN_PAGE_HEADER, isVisible()).forNoMoreThan(30).seconds()
        );

        BrowseTheWeb.as(theActorInTheSpotlight()).evaluateJavascript("window.scrollBy(0, 250);");

    }
}
