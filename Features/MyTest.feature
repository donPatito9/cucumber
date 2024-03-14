Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion
Given Abrir Chrome
When ingresa Username "usuario" y Password "password"
Then inicia sesion