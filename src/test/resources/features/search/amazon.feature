Feature: Amazon busqueda

  Scenario: Searching for a term
    Given Ivan Moreno busca en Amazon
    When elige el producto "Dildo"
    Then Valida que exista

