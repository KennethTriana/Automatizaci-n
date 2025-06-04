#language:es
#author:Nicol Sanchez

Característica: Autenticarse en la pagina del Sistema de Inventario LGC
  Siendo usuario del Sistema de Inventario LGC
  Quiero iniciar sesion en el portal del Sistema de Inventario LGC
  Para asi acceder al contenido y funcionalidades disponibles en el aplicativo.

  @autenticacion
  Escenario: Verificar que el usuario se haya autenticado exitosamente en la pagina del Sistema de Inventario LGC.
    Dado que el usuario se encuentra en la pagina de inicio de sesion.
    Cuando ingrese las credenciales corretamente (correo y contrasena).
      | email  | contrasena  |
      | nelson@gmail.com  | 123  |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente.
