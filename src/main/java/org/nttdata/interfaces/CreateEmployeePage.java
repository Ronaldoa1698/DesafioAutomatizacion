package org.nttdata.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateEmployeePage {

    public static final Target INPUT_FIRST_NAME = Target.the("Campo de primer nombre")
            .locatedBy("//input[@name='firstName']");

    public static final Target INPUT_MIDDLE_NAME = Target.the("Campo de segundo nombre")
            .locatedBy("//input[@name='middleName']");

    public static final Target INPUT_LAST_NAME = Target.the("Campo de apellido")
            .locatedBy("//input[@name='lastName']");

    public static final Target BUTTON_SAVE = Target.the("Botón de guardar")
            .locatedBy("//button[@type='submit' and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--secondary') and contains(@class, 'orangehrm-left-space') and text()=' Save ']");

    public static final Target BUTTON_PIM = Target.the("Botón de PIM")
            .locatedBy("//span[text()='PIM']/ancestor::a");

    public static final Target BUTTON_ADD = Target.the("Botón de agregar empleado")
            .locatedBy("//button[@type='button' and contains(@class, 'oxd-button') and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--secondary')]");

    public static final Target NAV_BAR_EMPLOYEE_LIST = Target.the("Barra de navegación de lista de empleados")
            .locatedBy("//a[contains(text(), 'Employee List')]");

    public static final Target INPUT_EMPLOYEE_NAME = Target.the("Campo de búsqueda por nombre del empleado")
            .locatedBy("//input[@placeholder='Type for hints...']");

    public static final Target EMPLOYEE_NAME_IN_RESULTS = Target.the("Nombre completo del empleado en los resultados de búsqueda")
            .locatedBy("//div[@class='oxd-table-body']//div[@role='row']//div[contains(@class, 'oxd-table-cell oxd-padding-cell') and contains(., '{0}')]");

    public static final Target BUTTON_SEARCH = Target.the("Botón de buscar")
            .locatedBy("//button[@type='submit' and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--secondary') and contains(., 'Search')]");

    public static final Target EMPLOYEE_DETAILS_HEADER = Target.the("Encabezado de detalles del empleado")
            .locatedBy("//h6[contains(@class, 'oxd-text--h6') and contains(@class, 'orangehrm-main-title') and text()='Personal Details']");
}
