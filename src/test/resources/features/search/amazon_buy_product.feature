Feature: Comprar productos en Amazon

  Scenario: Cargar al carrito de compra un producto encontrado a través de búsqueda con nombre del articulo
    Given el usuario navega en "https://www.amazon.com/"
    When busca el artículo "Alexa"
    And navega a la pagina "2" de los resultados de busqueda obtenidos
    And selecciona el "3" ítem de los resultados
    Then agrega al carrito más de "2" unidades del tercer ítem si esta "Sogeking" para compra