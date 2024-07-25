package org.nttdata.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateEmployeePage {
    public static final Target INPUT_USERNAME = Target.the("Campo de nombre de usuario")
            .locatedBy("//input[@data-v-1f99f73c and @autocomplete='off' and @class='oxd-input oxd-input--active']");

    public static final Target INPUT_EMPLOYEE_NAME = Target.the("Campo de nombre del empleado")
            .locatedBy("//input[@data-v-75e744cd and @placeholder='Type for hints...']");

    public static final Target FIRST_EMPLOYEE_NAME_OPTION = Target.the("Primera opción de nombre de empleado")
            .locatedBy("//div[@role='listbox']//div[@class='oxd-autocomplete-option']");

    public static final Target INPUT_PASSWORD = Target.the("Campo de contraseña")
            .locatedBy("//input[@data-v-1f99f73c and @type='password' and @autocomplete='off']");

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Campo de confirmación de contraseña")
            .locatedBy("//label[text()='Confirm Password']/ancestor::div[contains(@class, 'oxd-input-group')]/div/input[@type='password' and @autocomplete='off']");

    public static final Target SELECT_USER_ROLE = Target.the("Selector de rol de usuario")
            .locatedBy("(//div[@class='oxd-select-text-input' and @tabindex='0'])[1]");

    public static final Target SELECT_USER_ROLE_OPTION = Target.the("Opción de rol de usuario")
            .locatedBy("//div[@role='listbox']//span[contains(text(), '{0}')]");

    public static final Target SELECT_STATUS = Target.the("Selector de estado")
            .locatedBy("(//div[@class='oxd-select-text-input' and @tabindex='0'])[2]");

    public static final Target SELECT_STATUS_OPTION = Target.the("Opción de estado")
            .locatedBy("//div[@role='listbox']//span[contains(text(), '{0}')]");

    public static final Target BUTTON_SAVE = Target.the("Botón de guardar")
            .locatedBy("//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public static final Target ADMIN_PAGE_HEADER = Target.the("Encabezado de la página de administración")
            .locatedBy("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module' and text()='Admin']");

    public static final Target BUTTON_ADMIN = Target.the("Botón de Admin")
            .locatedBy("//span[text()='Admin']/ancestor::a");

    public static final Target BUTTON_ADD_EMPLOYEE = Target.the("Botón de agregar empleado")
            .locatedBy("//button[contains(@class, 'oxd-button--secondary') and contains(., ' Add ')]");

    public static final Target EMPLOYEE_NAME = Target.the("Nombre del empleado")
            .locatedBy("//div[text()='{0}']");
}
