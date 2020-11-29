# Padrão Adapter

## Intenção
 converter a interface de uma classe na interface esperada pelos clientes. 
 O Adapter permite que classes com interfaces incompatíveis trabalhem em
conjunto.

## Motivação
 Em algumas situações, a interface oferecida por um toolkit, projetada para ser
reutilizada não pode ser usada numa aplicação porque sua interface não
corresponde à interface específica.

## Aplicabilidade
 situações nas quais as classes que devem interagir não têm interfaces
compatíveis

 adaptador de objetos é aplicável nos casos em que não é possível adaptar as
classes existentes através de subclasses.

## Participantes

 Os clientes chamam operações de uma instância de
Adapter e este por sua vez chama as operações de
Adaptee que executam a solicitação.

### Conseqüências (adaptador de classe)
– um adaptador de classe nao funciona se quisermos
adaptar uma dada classe e todas as suas subclasses.

– é possível substituir algum comportamento do
Adaptee, uma vez que Adapter é uma subclasse de
Adaptee.

– introduz somente um objeto intermediário, não sendo
necessário endereçamento indireto adicional até se
chegar ao Adaptee.
48

### Conseqüências (adaptador de objetos)
– permite a um único Adapter trabalhar com muitos
Ataptees.
– é difícil redefinir o comportamento de um Adaptee. Para
isso é necessário a criação de subclasses.

• Pontos a considerar

– o 'grau de adaptação' varia muito de uma situação para
outra.
– adaptadores plugáveis.
– adaptadores nos dois sentidos para fornecer 

Diretório:
-Academic-Works/Adapter_Method/src/
