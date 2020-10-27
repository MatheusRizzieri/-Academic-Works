# Singleton Method
Markdown

## Intenção
Garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela.

## Estrutura
A classe Singleton declara o método estático getInstance que retorna a mesma instância de sua própria classe.
O construtor da singleton deve ser escondido do código cliente. Chamando o método getInstance deve ser o único modo de obter o objeto singleton.

## Aplicabilidade
Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.
O padrão Singleton desabilita todos os outros meios de criar objetos de uma classe exceto pelo método especial de criação. Esse método tanto cria um novo objeto ou retorna um objeto existente se ele já tenha sido criado.
Utilize o padrão Singleton quando você precisa de um controle mais estrito sobre as variáveis globais.

## Vantagens
Uma classe só terá uma única instância.
O objeto singleton é inicializado somente quando for pedido pela primeira vez.

## Desvantagens
Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.
O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem muito sobre cada um.
O padrão requer tratamento especial em um ambiente multithreaded para que múltiplas threads não possam criar um objeto singleton várias vezes.
 Pode ser difícil realizar testes unitários do código cliente do Singleton porque muitos frameworks de teste dependem de herança quando produzem objetos simulados. 
 
 Código de Exemplo:
 -Academic-Works/Singleton_Method/src/Padrão/
