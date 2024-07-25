#language:es
@DemoOrangeHRM
Característica: Registro de cliente en OrangeHRM
    Yo como Usuario
    Quiero ingresar al sistema de OrangeHRM
    Para crear un usuario

    Regla: flujos happy path

        @login
        Esquema del escenario: Login en OrangeHRM
            Dado que Username ingresa a la pagina de login de OrangeHRM
            Cuando ingresa las credenciales,Usuario "<Usuario>", Contraseña "<Contraseña>"
            Y da clic en el botón de login
            Entonces debería ser redirigido al dashboard principal
            Ejemplos:
                |Usuario  | Contraseña |
                | Admin    | admin123 |

        @RegistroEmpleado
        Esquema del escenario: Crear un nuevo empleado en OrangeHRM
            Dado que el Administrador esta logueado en OrangeHRM
            Y hace click en el boton de admin
            Y hace click en agregar empleado
            Cuando completa los datos obligatorios, Roles "<Roles>", Employee Name "<Employee Name>", Username "<Username>", Status "<Status>", Password "<Password>", Confirm Password "<Confirm Password>"
            Y da clic en el boton de guardar
            Entonces debería ser redirigido a la pagina de admin
            Ejemplos:
                | Roles  | Employee Name  | Username | Status  | Password      | Confirm Password |
                | Admin  | Ranga  Akunuri | Ronaldo  | Enabled | 123456.Test   | 123456.Test      |
