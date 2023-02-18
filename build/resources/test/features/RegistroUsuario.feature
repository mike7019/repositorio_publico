#language: es
Característica: Registro de usuario en Advantage

  Esquema del escenario: Escenario: Registro Usuario Exitoso
    Dado Que Julio se encuentro en el sitio web
    Cuando llena sus datos
      | usuario   | contrasena   | correo   | verCorreo   |
      | <usuario> | <contrasena> | <correo> | <verCorreo> |
    Entonces valida el <usuario> en pantalla
    Ejemplos:
      | usuario   | contrasena | correo              | verCorreo           |
      | julio1990 | juliosito1 | julio1@colombia.com | julio1@colombia.com |