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
            Y hace click en el boton de pim
            Y hace click en agregar empleado
            Cuando completa los datos obligatorios, Nombre "<Nombre>", SegundoNombre "<SegundoNombre>", Apellido "<Apellido>"
            Y da clic en el boton de guardar
            Y da clic en el boton Employee List
            Y busca el empleado creado por el nombre "<Nombre>"
            Entonces debemos verificar que el Empleado "<Nombre>" con segundo nombre "<SegundoNombre>" fue creado exitosamente
            Ejemplos:
                | Nombre   | SegundoNombre  | Apellido |
                | Ronaldo  |  pruebas       | testing  |
