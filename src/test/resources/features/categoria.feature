#language: es
  #author: Nicol Sanchez

  Característica: Agregar una categoria en el Sistema de Inventario LGC
    Como usuario del Sistema de Inventario LGC
    Quiero agregar una categoria en el Sistema de Inventario LGC


  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion del Sistema de Inventario LGC.
    Cuando ingrese las credenciales corretamente (correo y contrasena).
    |email|contrasena|
    |nelson@gmail.com|123|

    @categoria
  Escenario: Agregar una categoria en el Sistema de Inventario LGC
      Cuando ingrese credenciales correctas.

      |Aseo        |


      Entonces se debe verificar que el usuario haya creado la categoria en el Sistema de Inventario LGC.
