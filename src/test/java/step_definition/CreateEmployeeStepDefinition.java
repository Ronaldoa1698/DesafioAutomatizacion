package step_definition;

import io.cucumber.java.es.*;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
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

    @Y("hace click en el boton de pim")
    public void haceClickEnElBotonDePim() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.BUTTON_PIM, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.BUTTON_PIM)
        );
    }

    @Y("hace click en agregar empleado")
    public void haceClickEnAgregarEmpleado() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.BUTTON_ADD, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.BUTTON_ADD)
        );
    }

    @Cuando("completa los datos obligatorios, Nombre {string}, SegundoNombre {string}, Apellido {string}")
    public void completaLosDatosObligatoriosNombreSegundoNombreApellido(String nombre, String segundoNombre, String apellido) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.INPUT_FIRST_NAME, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(nombre).into(CreateEmployeePage.INPUT_FIRST_NAME),
                WaitUntil.the(CreateEmployeePage.INPUT_MIDDLE_NAME, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(segundoNombre).into(CreateEmployeePage.INPUT_MIDDLE_NAME),
                WaitUntil.the(CreateEmployeePage.INPUT_LAST_NAME, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(apellido).into(CreateEmployeePage.INPUT_LAST_NAME)
        );
    }

    @Y("da clic en el boton de guardar")
    public void daClicEnElBotonDeGuardar() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CreateEmployeePage.BUTTON_SAVE),
                WaitUntil.the(CreateEmployeePage.EMPLOYEE_DETAILS_HEADER, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds()
        );
    }

    @Y("da clic en el boton Employee List")
    public void daClicEnElBotonEmployeeList() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.NAV_BAR_EMPLOYEE_LIST, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.NAV_BAR_EMPLOYEE_LIST)
        );
    }

    @Y("busca el empleado creado por el nombre {string}")
    public void buscaElEmpleadoCreadoPorElNombre(String arg0) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.NAV_BAR_EMPLOYEE_LIST, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(arg0).into(CreateEmployeePage.INPUT_EMPLOYEE_NAME),
                WaitUntil.the(CreateEmployeePage.BUTTON_SEARCH, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CreateEmployeePage.BUTTON_SEARCH)
        );
    }

    @Entonces("debemos verificar que el Empleado {string} con segundo nombre {string} fue creado exitosamente")
    public void debemosVerificarQueElEmpleadoConSegundoNombreFueCreadoExitosamente(String firstName, String middleName) {
        String fullName = firstName + " " + middleName;
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CreateEmployeePage.EMPLOYEE_NAME_IN_RESULTS.of(fullName), isVisible()).forNoMoreThan(30).seconds()
        );
    }
}
