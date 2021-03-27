# language: es
Característica: Realizar busqueda de una palabra por medio de buscador de wikipedia
  Yo como usuario de wikipedia
  Quiero realizar la busqueda de una palabra
  Para poder obtener información sobre la palabra

  Antecedentes:
    Dado que el navegador de wikipedia esta abierto

  Escenario: Realizar busqueda de palabra
    Cuando se ingresa una palabra Medellin en el buscador
    Entonces se retorna informacion sobre la palabra

  Esquema del escenario: Realizar busqueda de multiples palabras
    Cuando se ingresa una palabra <palabra> en el buscador
    Entonces se retorna informacion sobre la palabra

    Ejemplos:
      | palabra  |
      | Colombia |
      | Japon    |
      | Vikingos |

  @BusquedaConModels
  Esquema del escenario: Realizar busqueda con resultado esperado
    Cuando se ingresa una palabra <palabra> en el buscador
    Entonces se espera que la palabra retorne la cantidad indicada de registros en el buscador
      | palabra  | cantidad |
      | Colombia | 63717    |
      | Japon    | 89624    |

    Ejemplos:
      | palabra  |
      | Colombia |
      | Japon    |
