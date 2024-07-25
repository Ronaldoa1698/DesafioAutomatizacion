- agregar la configuracion :

clean cleanResources cucumberTest aggregate -Denvironment=PROD -Dcucumber.filter.tags="@RegistroEmpleado"


- Plugins
  - https://plugins.jetbrains.com/plugin/7212-cucumber-for-java
  - https://plugins.jetbrains.com/plugin/9164-gherkin
  - https://plugins.jetbrains.com/plugin/7676-selenium-selenide-web-automation
  - https://plugins.jetbrains.com/plugin/9413-substeps-intellij-plugin


- Uso del patron screen play
- Java version 17

CASOS DE PRUEBA: 
1. Acceso a OrangeHRM
    Escenario: Login en OrangeHRM
    Objetivo: Acceder a la plataforma de OrangeHRM.
    Pasos:
    Dado que Username ingresa a la página de login de OrangeHRM.
    Cuando ingresa las credenciales, Usuario "<Usuario>", Contraseña "<Contraseña>".
    Y da clic en el botón de login.
    Entonces debería ser redirigido al dashboard principal.
    Ejemplo de datos:
    Usuario: Admin
    Contraseña: admin123
2. Automatización del proceso de inicio de sesión en la plataforma
    Escenario: Login en OrangeHRM (Automatización)
    Objetivo: Automatizar el proceso de inicio de sesión en la plataforma.
    Pasos: Los mismos que en el escenario de Login en OrangeHRM.
3. Crear un nuevo empleado con detalles completos
    Escenario: Crear un nuevo empleado en OrangeHRM
    Objetivo: Crear un nuevo empleado en OrangeHRM con todos los datos obligatorios.
    Pasos:
    Dado que el Administrador está logueado en OrangeHRM.
    Y hace click en el botón de pim.
    Y hace click en agregar empleado.
    Cuando completa los datos obligatorios, Nombre "<Nombre>", SegundoNombre "<SegundoNombre>", Apellido "<Apellido>".
    Y da clic en el botón de guardar.
    Y da clic en el botón Employee List.
    Y busca el empleado creado por el nombre "<Nombre>".
    Entonces debemos verificar que el Empleado "<Nombre>" con segundo nombre "<SegundoNombre>" fue creado exitosamente.
    Ejemplo de datos:
    Nombre: Ronaldo
    SegundoNombre: pruebas
    Apellido: testing
4. Validar que el empleado ha sido creado correctamente y que aparece en la lista de empleados
    Escenario: Verificar empleado en la lista
    Objetivo: Validar que el empleado ha sido creado correctamente y aparece en la lista de empleados.
    Pasos: Los mismos que en el escenario de Crear un nuevo empleado en OrangeHRM, incluyendo la búsqueda y verificación del empleado creado.
