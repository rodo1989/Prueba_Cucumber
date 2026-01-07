Feature: Como usuario quiero realizar flujo de Login

  Scenario: Flujo de login
    Given Usuario abre navegador y visualiza pantalla de Login
    When Ingresa user y pass
    And presiona boton Submit
    Then deberia ver el mensaje de bienvenida "Logged In Successfully"

