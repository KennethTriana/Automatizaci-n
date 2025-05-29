#language:es
#author:Kenneth Triana

Característica: Venta en la página del sistema de inventario LGC
  Como usuario del sistema de inventario LGC
  Quiero realizar una venta en el sistema de inventario LGC


  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion del sistema de inventario LGC
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | usuarios                 | clave |
      | Kennethtriana3@gmail.com | 1234  |

  @venta
  Esquema del escenario: Realizar la venta exitosa en la pagina del sistema de inventario LGC
    Cuando ingrese las credenciales correctas (nombre y cantidad)
      | nombre   | cantidad   |
      | <nombre> | <cantidad> |
    Entonces se debe verificar que el usuario haya vendido en el sistema de inventario LGC

    Ejemplos:
      | nombre | cantidad |
      | Arroz  | 11       |
