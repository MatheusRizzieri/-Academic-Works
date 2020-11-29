## Factory Method

## Intenção
Definir uma interface para a criação de um objeto,
deixando as subclasses decidirem que classe instanciar. 

O FactoryMethod delega a instanciação para as subclasses.

## Motivação
Em muitas situações, uma aplicação necessita criar
objetos cujas classes fazem parte de uma hierarquia de
classes, mas não necessita ou não tem como definir qual a
subclasse a ser instanciada.

O FactoryMethod é usado nesses
casos e decide com base do ‘contexto’, qual das subclasses
ativar. Um exemplo simples: leitura de objetos serializados
num arquivo. 

## Aplicabilidade
Em casos tais que:

– O cliente não consegue antecipar a classe de objetos que deve criar.

– Uma classe quer que suas subclasses especifiquem os objetos que criam

## Participantes
– Creator depende das suas subclasses para definir o método de construção
necessário à retornar a instância do produto concreto apropriado.

## Conseqüências

– Fornece ‘ganchos’ para as subclasses.

– Conecta hierarquias de classe paralelas.

Diretório:
-Academic-Works/Factory_Method/src/

