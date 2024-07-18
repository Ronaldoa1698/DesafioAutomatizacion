#language:es
@Demoqa
Característica: Registro de cliente en demo qa
  Yo como Usuario
  Quiero registrar mis datos la pagina de demo qa
  Para validar su funcionalidad

  Regla: flujos happy path

    @RegistroCliente
    Esquema del escenario: Registro de cliente en demo qa
        Dado que Ronaldo ingresa a la pagina de demo qa
        E ingresa al formulario de registro de estudiantes
        Cuando ingresa sus datos obligatorio, Nombre "<Nombre>", Apellido "<Apellido>", Genero "<Genero>", Celular "<Celular>"
        Y da clic en el botón de enviar
        Entonces se debería validar que el registro fue exitoso
      Ejemplos:
        | Nombre  | Apellido | Genero    | Celular    |
        | Ronaldo | Perez    | Masculino | 1234567890 |