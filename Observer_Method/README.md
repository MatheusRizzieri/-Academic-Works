# Observer Method
 Markdown

## Descrição
O Observer é um padrão de projeto comportamental que permite que você defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.

### Participantes 
Publisher, Subscriber, Concrete Subscriber, Foreach e Client.

## Aplicabilidade
O padrão Observer permite que qualquer objeto que implemente a interface do assinante possa se inscrever para notificações de eventos em objetos da publicadora. Você pode adicionar o mecanismo de inscrição em seus botões, permitindo que o cliente coloque seu próprio código através de classes assinantes customizadas.

## Como implementar
- Olhe para sua lógica do negócio e tente quebrá-la em duas partes: a funcionalidade principal, independente de outros códigos, irá agir como publicadora; o resto será transformado em um conjunto de classes assinantes.

- Declare a interface do assinante. No mínimo, ela deve declarar um único método atualizar.

- Declare a interface da publicadora e descreva um par de métodos para adicionar um objeto assinante e removê-lo da lista. Lembre-se que publicadoras somente devem trabalhar com assinantes através da interface do assinante.

- Decida onde colocar a lista atual de assinantes e a implementação dos métodos de inscrição. Geralmente este código se parece o mesmo para todos os tipos de publicadoras, então o lugar óbvio para colocá-lo é dentro de uma classe abstrata derivada diretamente da interface da publicadora. Publicadoras concretas estendem aquela classe, herdando o comportamento de inscrição.

  Contudo, se você está aplicando o padrão para uma hierarquia de classe já existente, considere uma abordagem baseada na composição: coloque a lógica da inscrição dentro de um objeto separado, e faça todos as publicadoras reais usá-la.

- Crie as classes publicadoras concretas. A cada vez que algo importante acontece dentro de uma publicadora, ela deve notificar seus assinantes.

- Implemente os métodos de notificação de atualização nas classes assinantes concretas. A maioria dos assinantes precisarão de dados contextuais sobre o evento. Eles podem ser passados como argumentos do método de notificação.

  Mas há outra opção. Ao receber uma notificação, o assinante pode recuperar os dados diretamente da notificação. Neste caso, a publicadora deve passar a si mesma através do método de atualização. A opção menos flexível é ligar uma publicadora ao assinante permanentemente através do construtor.

- O cliente deve criar todas os assinantes necessários e registrá-los com suas publicadoras apropriadas.

##  Prós e contras
Princípio aberto/fechado. Você pode introduzir novas classes assinantes sem ter que mudar o código da publicadora (e vice versa se existe uma interface publicadora).
 Você pode estabelecer relações entre objetos durante a execução.
 
 Assinantes são notificados em ordem aleatória
 
### Diretório:
-Academic-Works/Observer_Method/src/
