# Strategy Method

## Intenção
– Definir uma família de algoritmos, encapsular cada
uma delas e torná-las intercambiáveis.
– O padrão Strategy permite que o algoritmo varie
independentemente dos clientes que os utilizam.

## Motivação
– Numa mesma aplicação, para tratar certos tipos de
problemas, diferentes algoritmos são apropriados em
diferentes situações.
– Novos algoritmos podem ser criados e incorporados a
aplicação sem que esta tenha que sofrer alterações
estruturais.

## Colaborações
– Strategy e Context interagem para implementar o
algoritmo escolhido.
– Context repassa solicitações dos seus clientes para a
estratégia. Os clientes em geral passam um objeto
ConcreteStrategy para o contexto.

## Conseqüências
– Famílias de algoritmos relacionados
– Alternativa para o uso de subclasses
– Eliminam comandos condicionais ao se codificar os
métodos

Diretório:
-Academic-Works/Strategy_Method/src/
