# language: es
Característica: Realizar busqueda de una palabra por medio de google
  Yo como usuario de google
  Quiero realizar la busqueda de una palabra
  Para poder obtener cuantos registros retorna

  Escenario: Realizar busqueda de palabra
    Dado que el navegador de google esta abierto
    Cuando se ingresa una palabra Medellin en el buscador
    Entonces se retorna mas un registro de retorno

  Esquema del escenario: Realizar busqueda de multiples palabras
    Dado que el navegador de google esta abierto
    Cuando se ingresa una palabra <palabra> en el buscador
    Entonces se retorna mas un registro de retorno

    Ejemplos:
      | palabra  |
      | Colombia |
      | Japon    |
      | Vikingos |
