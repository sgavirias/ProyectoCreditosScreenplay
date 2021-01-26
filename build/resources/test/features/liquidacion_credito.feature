#language: es

Característica: Usuario realiza un crédito

  Esquema del escenario: Usuario puede realizar credito
    Dado El usuario se encuentra en la pagina del CESDE
      |  DocNum  |
      | <DocNum> |
    Cuando El usuario se identifica


    Entonces El credito se finaliza correctamente

  Ejemplos:
|  DocNum  |
| 40404040 |


#Cuando user clicks identificacion
# user enter the ID number
#| <IdNumber> |

#Ejemplos:
#| IdNumber |
#| 40404040 |

#Cuando user clicks validar

#Cuando User enters the personal information
#| <FirstName> | <SecondName> | <Surname> | <SecondSurname> | <HomePhone> | <MobilePhone> | <Email> |

#Ejemplos:
#| FirstName | SecondName | Surname | SecondSurname | HomePhone | MobilePhone | Email                        |
#| Sebastian | Andres     | Londono | Lopera        | 2333333   | 3117562200  |sgavirias@choucairtesting.com |