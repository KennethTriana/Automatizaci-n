#language:es
  #author:Kenneth Triana

Característica: Autenticacion en la pagina del sistema de inventario LGC
  Como usuario del sistema de inventario LGC
  Quiero autenticarme en el portal del sistema de inventario LGC
  Para poder acceder al contenido y funcionalidades disponibles en mi cuenta.

  @autenticacion

  Escenario: Verificar la autenticacion exitosa en la pagina del sistema de inventario LGC
    Dado que el usuario se encuentra en la pagina de inicio de sesion del sistema de inventario LGC
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | usuarios                 | clave |
      | Kennethtriana3@gmail.com | 1234  |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de usuario del sistema de inventario LGC