Feature: Busqueda de vuelos en Wingo
  yo como usuario de la pagina wingo
  quiero hacer a busqueda de vuelos

  Scenario: Busqueda de Vuelo ida y vuelta
    Given Given que estoy en la pagina de wingo
    When he completado el formulario de busqueda
    And he clickeado el boton de busqueda
    Then se muestran los vuelos disponibles