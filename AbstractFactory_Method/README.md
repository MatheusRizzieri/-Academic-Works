## Abstract Factory Method

## Intenção
Fornecer uma interface para a
criação de famílias de objetos relacionados ou
dependentes sem especificar suas classes
completas

## Motivação
Em muitas situações uma ‘aplicação cliente’ precisa criar determinados
objetos cuja construção efetiva só é definida
em tempo de execução. A aplicação cliente
não deve se preocupar com a criação dos
objetos.

## Aplicabilidade
Aplicável a situações nas quais:
 
– o sistema deve ser independente de como seus
produtos são criados, compostos ou
representados

– o sistema deve ser configurado como um produto
de uma família de múltiplos produtos

– a ‘família’ de objetos-produto é projetada para
ser usada em conjunto

– deseja-se revelar apenas a interface da biblioteca
de classes-produto e não a sua implementação

## Participantes

– Em tempo de execução, normalmente é criada uma
única instância da classe ConcreteFactory. Ela será a
responsável pela criação dos produtos concretos.

– AbstractFactory delega a criação dos objetos-produto
para suas subclasses concretas (ConcreteFactory).

## Conseqüências
– Isola as classes concretas

– Facilita a troca de famílias de produtos

– É difícil suportar novos tipos de produtos

Diretório:
-Academic-Works/AbstractFactory_Method/src/
