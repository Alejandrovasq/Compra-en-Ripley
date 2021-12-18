Feature: Realizar Compra

  Scenario: Comprar algo en ripley
    Given Abrir el navegador
    When Escribir Ripley en el buscador
    And Apretar Buscar
    And Seleccionar la pagina de ripley
    And Apretar el Buscador
    And escribir telefono
    And Bajar al final de la pagina
    And Seleccionar el producto
    And ir al carrito de compras
    Then Ir a pagar el Producto