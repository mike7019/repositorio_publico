#language: es
Característica: Registro de usuario en Advantage

  Esquema del escenario: Escenario: Registro Usuario Exitoso
    Dado Que Julio se encuentro en el sitio web
    Cuando llena sus datos
      | usuario   | correo   | contrasena   | verContrasena   |
      | <usuario> | <correo> | <contrasena> | <verContrasena> |
    Entonces valida el <usuario> en pantalla
    Ejemplos:
      | usuario   | correo              | contrasena | verContrasena |
      | juliocabeza1990 | julio1@colombia.com | Julio112   | Julio112      |