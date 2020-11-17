# State Method

## Intenção
 Permite a um objeto alterar o seu comportamento em
função de alterações no seu estado interno.

## Motivação
 Em muitas situações o comportamento de um objeto deve
mudar em função de alterações no seu estado.

## Aplicabilidade
 O comportamento de um objeto depende do seu estado e
pode mudar em tempo de execução.

 Operações têm comandos condicionais grandes, com
várias alternativas que dependem do estado do objeto.

## Participantes
 Strategy e Context interagem para implementar o
algoritmo escolhido.

 Context repassa solicitações dos seus clientes para a
estratégia. Os clientes em geral passam um objeto
ConcreteStrategy para o contexto.

## Conseqüências
 Famílias de algoritmos relacionados
 
 Alternativa para o uso de subclasses
 
 Eliminam comandos condicionais ao se codificar os
métodos

#### Diretório:
-Academic-Works/State_Method/src/
