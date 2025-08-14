Feature: Calculadora

  Scenario: Suma de dos valores
    Given que la calculadora está encendida
    When ingreso 5 y 3 y selecciono suma
    Then el resultado debe ser 8

  Scenario: Resta de dos valores
    Given que la calculadora está encendida
    When ingreso 10 y 4 y selecciono resta
    Then el resultado debe ser 6

  Scenario: Multiplicación de dos valores
    Given que la calculadora está encendida
    When ingreso 6 y 7 y selecciono multiplicación
    Then el resultado debe ser 42

  Scenario: División de dos valores
    Given que la calculadora está encendida
    When ingreso 20 y 5 y selecciono división
    Then el resultado debe ser 4
