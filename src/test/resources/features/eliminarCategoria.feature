#language: es
  #author: Nicol Sanchez

Característica: Eliminar una categoria en el Sistema de Inventario LGC
  Como usuario del Sistema de Inventario LGC
  Quiero eliminar una categoria en el Sistema de Inventario LGC


  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de la aplicacion.
    Cuando ingrese las credenciales corretamente (correo y contrasena).
      |email|contrasena|
      |nelson@gmail.com|123|

  @categoria3
  Escenario: Eliminar una categoria en el Sistema de Inventario LGC
    Cuando ingrese credenciales correctas para eliminar la categoria.
    |Carnes|

    Entonces se debe verificar que el usuario haya eliminado la categoria en el Sistema de Inventario LGC.